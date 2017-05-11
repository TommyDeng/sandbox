package com.tom.aspirated.service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author TommyDeng <250575979@qq.com>
 * @version 创建时间：2016年9月28日 下午2:33:40
 *
 */

public interface DataAccessService {

	/**
	 * 执行sql后返回第一行第一列
	 * 
	 * @param sql
	 * @param paramMap
	 * @param cls
	 * @return
	 */
	<T> T queryForObject(String sqlName, Map<String, Object> paramMap, Class<T> cls);

	/**
	 * 执行sql后返回第一行Map
	 * 
	 * @param sql
	 * @param paramMap
	 * @return
	 */
	Map<String, Object> queryForMap(String sqlName, Map<String, Object> paramMap);

	/**
	 * 单条插入，paramMap中无对应项则赋值为null
	 * 
	 * @param tableName
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	int insertSingle(String tableName, Map<String, Object> paramMap);

	/**
	 * 单条修改，只更新paramMap中对应项,必须包含PK
	 * 
	 * @param tableName
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	int updateSingle(String tableName, Map<String, Object> setParamMap, Map<String, Object> whereParamMap);

	/**
	 * 执行sql
	 * 
	 * @param sqlName
	 * @param paramMap
	 * @return
	 */
	int update(String sqlName, Map<String, Object> paramMap);

	/**
	 * 查询MapList
	 * 
	 * @param sqlName
	 * @param paramMap
	 * @return
	 */
	List<Map<String, Object>> queryMapList(String sqlName, Map<String, Object> paramMap);

	/**
	 * 查询MapList
	 * 
	 * @param sqlName
	 * @param paramMap
	 * @return
	 */
	List<Map<String, Object>> queryMapList(String sqlName);

}
