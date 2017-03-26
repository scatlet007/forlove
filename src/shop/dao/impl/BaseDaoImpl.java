package shop.dao.impl;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import shop.dao.BaseDao;

public class BaseDaoImpl implements BaseDao {
	
	private JdbcTemplate jdbcTemplate;
	private SessionFactory sessionFactory;
	private Session session = null;
	private Transaction transaction = null;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public <T> void add(T t) {
		try
        {
            session = this.openSession();
            transaction = session.beginTransaction();
            if (null != t)
            {
                session.save(t);
                transaction.commit();

            }
        }
        catch (Exception e)
        {
            transaction.rollback();
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        finally
        {
            this.closeSession(session);
        }
		
	}

	@Override
	public <T> void update(T t) {
		try
        {
            session = this.openSession();
            transaction = session.beginTransaction();
            if (null != t)
            {
                session.update(t);
                transaction.commit();

            }
        }
        catch (Exception e)
        {
            transaction.rollback();
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        finally
        {
            this.closeSession(session);
        }
		
	}

	@Override
	public int update(String sql, Object[] param) {
		return this.jdbcTemplate.update(sql, param);
	}

	@Override
	public int delHQL(String sql, Object[] param) {
		Query query = null;
        try
        {
            session = this.openSession();
            query = session.createQuery(sql);
            if (null != param && 0 < param.length)
            {
                for (int i = 0; i < param.length; i++)
                {
                    query.setParameter(i, param[i]);
                }
            }

            query.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        finally
        {
            this.closeSession(session);
        }
        return 0;
	}

	@Override
	public <T> void delete(T t) {
		try
        {
            session = this.openSession();
            transaction = session.beginTransaction();
            if (null != t)
            {
                session.delete(t);
                transaction.commit();
            }
        }
        catch (Exception e)
        {
            transaction.rollback();
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        finally
        {
            this.closeSession(session);
        }
	}

	@Override
	public <T> void delete(Class<T> t, Serializable id) {
		try
        {
            session = this.openSession();
            Object object = session.get(t, id);
            transaction = session.beginTransaction();
            if (null != object)
            {
                session.delete(object);
                transaction.commit();
            }
        }
        catch (Exception e)
        {
            transaction.rollback();
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        finally
        {
            this.closeSession(session);
        }
	}

	@Override
	public <T> T getByHibernate(Class<T> t, Serializable id) {
		try
        {
            session = this.openSession();
            return (T) session.get(t, id);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        finally
        {
            this.closeSession(session);
        }
	}

	@Override
	public List<Map<String, Object>> query(String sql, Object[] param) {
		return this.jdbcTemplate.queryForList(sql, param);
	}

	@Override
	public List<Map<String, Object>> query(String sql) {
		return this.jdbcTemplate.queryForList(sql);
	}

	@Override
	public <T> List<T> query(String sql, Object[] param, Class<T> requiredType) {
		return this.jdbcTemplate.query(sql, param,
                new BeanPropertyRowMapper<T>(requiredType));
	}

	@Override
	public <T> List<T> query(String sql, Class<T> requiredType) {
		return this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<T>(
                requiredType));
	}

	@Override
	public <T> List<T> query(String sql, RowMapper<T> rowMapper) {
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public <T> List<T> query(String sql, Object[] param, RowMapper<T> rowMapper) {
		return this.jdbcTemplate.query(sql, param, rowMapper);
	}

	@Override
	public <T> T queryForObject(String sql, Class<T> requiredType) {
		return this.jdbcTemplate.queryForObject(sql, requiredType);
	}

	@Override
	public <T> T queryForObject(String sql, Object[] param,
			Class<T> requiredType) {
		if(this.jdbcTemplate==null)
			System.out.println("null");
		 return (T) this.jdbcTemplate.queryForObject(sql, param,
	                new BeanPropertyRowMapper<T>(requiredType));
	}

	@Override
	public <T> T queryForObjectHQL(String sql, Object[] param) {
		Query query = null;
        try
        {
            session = this.openSession();
            query = session.createQuery(sql);
            if (null != param && 0 < param.length)
            {
                for (int i = 0; i < param.length; i++)
                {
                    query.setParameter(i, param[i]);
                }
            }

            Object[] objects = (Object[]) query.uniqueResult();
            if (null != objects && 0 < objects.length) { return (T) objects[0]; }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        finally
        {
            this.closeSession(session);
        }
        return null;
	}

	@Override
	public Map<String, Object> queryForMap(String sql, Object[] param) {
		return this.jdbcTemplate.queryForMap(sql, param);
	}

	@Override
	public int queryForIntPage(String sql, int maxResults) {
		int all = this.jdbcTemplate.queryForObject(sql, Integer.class);
        return all % maxResults == 0 ? all / maxResults : all / maxResults + 1;
	}

	@Override
	public int queryForIntPage(String sql, Object[] param) {
		int all = this.jdbcTemplate.queryForObject(sql, Integer.class, param);
        return all;
	}

	@Override
	public int queryForIntPage(String sql) {
		int all = this.jdbcTemplate.queryForObject(sql, Integer.class);
        return all;
	}

	@Override
	public int queryForIntPage(String sql, Object[] param, int maxResults) {
		int all = this.jdbcTemplate.queryForObject(sql, Integer.class, param);
        return all % maxResults == 0 ? all / maxResults : all / maxResults + 1;
	}
	
	private Session openSession()
    {
        return sessionFactory.openSession();
    }

    private void closeSession(Session session)
    {
        if (null != session)
        {
            session.close();
        }
    }


}
