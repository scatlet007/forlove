package shop.dao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;

public interface BaseDao {
	/**
	 * ���һ��ʵ��
	 * @param t Ҫ��ӵ�ʵ��
	 */
	<T> void add(T t);
	
	/**
	 * �޸�һ��ʵ��
	 * @param t Ҫ�޸ĵ�ʵ��
	 */
    <T> void update(T t);
    
    /**
     * �޸�ʵ������
     * @param sql sql���
     * @param param �����б�
     * @return
     */
    int update(String sql, Object[] param);
    
    /**
     * ɾ��ʵ��
     * @param sql sql���
     * @param param �����б�
     * @return
     */
    int delHQL(String sql, Object[] param);
    
    /**
     * ɾ��һ��ʵ��
     * @param t Ҫɾ����ʵ��
     */
    <T> void delete(T t);
    
    /**
     * ͨ��IDɾ��ʵ��
     * @param t ʵ����
     * @param id ʵ��ID
     */
    <T> void delete(Class<T> t, Serializable id);
    
    /**
     * ͨ��ID��ѯʵ��
     * @param t ʵ����
     * @param id Ҫ��õ�ʵ��ID
     * @return
     */
    <T> T getByHibernate(Class<T> t, Serializable id);
    
    /**
     * ��ѯ���ݣ����ص���һ��Map���͵�List����
     * @param sql sql���
     * @param param �����б�
     * @return
     */
    List<Map<String, Object>> query(String sql, Object[] param);
    
    /**
     * ��ѯ���ݣ����ص���һ��Map���͵�List����
     * @param sql sql���
     * @return
     */
    List<Map<String, Object>> query(String sql);
    
    /**
     * ��ѯ���ݣ����ص���һ��������List����
     * @param sql sql���
     * @param param �����б�
     * @param requiredType ʵ����
     * @return
     */
    <T> List<T> query(String sql, Object[] param, Class<T> requiredType);
    
    /**
     * ��ѯ���ݣ����ص���һ��������List����
     * @param sql sql���
     * @param requiredType ʵ����
     * @return
     */
    <T> List<T> query(String sql, Class<T> requiredType);
    
    /**
     * ��ѯ���ݣ����ص���һ��������List���ݣ���ѡ�������
     * @param sql
     * @param rowMapper
     * @return
     */
    <T> List<T> query(String sql, RowMapper<T> rowMapper);
    
    /**
     * ��ѯ���ݣ����ص���һ��������List���ݣ���ѡ�������
     * @param sql
     * @param param
     * @param rowMapper
     * @return
     */
    <T> List<T> query(String sql, Object[] param, RowMapper<T> rowMapper);
    
    /**
     * ��ѯһ��ʵ��
     * @param sql
     * @param requiredType ʵ����
     * @return
     */
    <T> T queryForObject(String sql, Class<T> requiredType);
    
    /**
     * ��ѯһ��ʵ��
     * @param sql
     * @param param �����б�
     * @param requiredType ʵ����
     * @return
     */
    <T> T queryForObject(String sql, Object[] param, Class<T> requiredType);
    
    /**
     * ͨ��HQL����ѯʵ��
     * @param sql 
     * @param param �����б�
     * @return
     */
    <T> T queryForObjectHQL(String sql,  Object[] param);
    
    /**
     * ��ѯ���ݣ����ص���һ��Map���͵�����
     * @param sql
     * @param param �����б�
     * @return
     */
    Map<String, Object> queryForMap(String sql, Object[] param);
    
    /**
     * ��ҳ��ѯ ��ѯ��ҳ��
     * @param sql
     * @param maxResults ÿһҳ�������
     * @return
     */
    int queryForIntPage(String sql, int maxResults);
    
    /**
     * ��ҳ��ѯ����ѯ��ҳ��
     * @param sql
     * @param param �����б�
     * @return
     */
    int queryForIntPage(String sql, Object[] param);
    
    /**
     * ��ҳ��ѯ����ѯ��ҳ��
     * @param sql
     * @return
     */
    int queryForIntPage(String sql);
    
    /**
     * ��ҳ��ѯ����ѯ��ҳ��
     * @param sql
     * @param param �����б�
     * @param maxResults ÿһҳ�����������
     * @return
     */
    int queryForIntPage(String sql, Object[] param, int maxResults);
    
}
