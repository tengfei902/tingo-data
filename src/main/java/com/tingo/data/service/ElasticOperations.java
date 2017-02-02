package com.tingo.data.service;

import com.tingo.data.criterial.IndexAlias;

import java.util.List;
import java.util.Map;

/**
 * Created by tengfei on 2017/1/26.
 */
public interface ElasticOperations extends BaseOperations {
    //创建索引
    boolean createIndex(String index);
    <T> boolean createIndex(Class<T> dataType);
    boolean checkIfIndexExist(String index);
    boolean deleteIndex(String index);
    //设置映射
    <T> boolean putMapping(Class<T> dataType);
    <T> boolean putMapping(Class<T> dataType,Object mapping);
    boolean putMapping(String index,String type,Object mapping);
    //获取映射
    <T> Map getMapping(Class<T> dataType);
    Map getMapping(String index);
    Map getMapping(String index,String type);
    //索引别名
    boolean alias(IndexAlias indexAlias);
    boolean aliases(List<IndexAlias> indexAliases);
    List<String> getIndexByAlias(String alias);
    List<String> getAliasByIndex(String index);

    //插入

}
