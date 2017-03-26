package shop.dao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;

public interface BaseDao {
	/**
	 * 添加一个实体
	 * @param t 要添加的实体
	 */
	<T> void add(T t);
	
	/**
	 * 修改一个实体
	 * @param t 要修改的实体
	 */
    <T> void update(T t);
    
    /**
     * 修改实体数据
     * @param sql sql语句
     * @param param 参数列表
     * @return
     */
    int update(String sql, Object[] param);
    
    /**
     * 删除实体
     * @param sql sql语句
     * @param param 参数列表
     * @return
     */
    int delHQL(String sql, Object[] param);
    
    /**
     * 删除一个实体
     * @param t 要删除的实体
     */
    <T> void delete(T t);
    
    /**
     * 通过ID删除实体
     * @param t 实体类
     * @param id 实体ID
     */
    <T> void delete(Class<T> t, Serializable id);
    
    /**
     * 通过ID查询实体
     * @param t 实体类
     * @param id 要获得的实体ID
     * @return
     */
    <T> T getByHibernate(Class<T> t, Serializable id);
    
    /**
     * 查询数据，返回的是一个Map类型的List数据
     * @param sql sql语句
     * @param param 参数列表
     * @return
     */
    List<Map<String, Object>> query(String sql, Object[] param);
    
    /**
     * 查询数据，返回的是一个Map类型的List数据
     * @param sql sql语句
     * @return
     */
    List<Map<String, Object>> query(String sql);
    
    /**
     * 查询数据，返回的是一个适配类List数据
     * @param sql sql语句
     * @param param 参数列表
     * @param requiredType 实体类
     * @return
     */
    <T> List<T> query(String sql, Object[] param, Class<T> requiredType);
    
    /**
     * 查询数据，返回的是一个适配类List数据
     * @param sql sql语句
     * @param requiredType 实体类
     * @return
     */
    <T> List<T> query(String sql, Class<T> requiredType);
    
    /**
     * 查询数据，返回的是一个适配类List数据，可选择输出列
     * @param sql
     * @param rowMapper
     * @return
     */
    <T> List<T> query(String sql, RowMapper<T> rowMapper);
    
    /**
     * 查询数据，返回的是一个适配类List数据，可选择输出列
     * @param sql
     * @param param
     * @param rowMapper
     * @return
     */
    <T> List<T> query(String sql, Object[] param, RowMapper<T> rowMapper);
    
    /**
     * 查询一个实体
     * @param sql
     * @param requiredType 实体类
     * @return
     */
    <T> T queryForObject(String sql, Class<T> requiredType);
    
    /**
     * 查询一个实体
     * @param sql
     * @param param 参数列表
     * @param requiredType 实体类
     * @return
     */
    <T> T queryForObject(String sql, Object[] param, Class<T> requiredType);
    
    /**
     * 通过HQL语句查询实体
     * @param sql 
     * @param param 参数列表
     * @return
     */
    <T> T queryForObjectHQL(String sql,  Object[] param);
    
    /**
     * 查询数据，返回的是一个Map类型的数据
     * @param sql
     * @param param 参数列表
     * @return
     */
    Map<String, Object> queryForMap(String sql, Object[] param);
    
    /**
     * 分页查询 查询总页数
     * @param sql
     * @param maxResults 每一页最大数据
     * @return
     */
    int queryForIntPage(String sql, int maxResults);
    
    /**
     * 分页查询，查询总页数
     * @param sql
     * @param param 参数列表
     * @return
     */
    int queryForIntPage(String sql, Object[] param);
    
    /**
     * 分页查询，查询总页数
     * @param sql
     * @return
     */
    int queryForIntPage(String sql);
    
    /**
     * 分页查询。查询总页数
     * @param sql
     * @param param 参数列表
     * @param maxResults 每一页最大数据条数
     * @return
     */
    int queryForIntPage(String sql, Object[] param, int maxResults);
    
}
