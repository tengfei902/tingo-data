package com.tingo.data.service.impl;

import com.tingo.data.criterial.IndexAlias;
import com.tingo.data.exception.TingoElasticException;
import com.tingo.data.service.ElasticOperations;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.Requests;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * Created by tengfei on 2017/1/26.
 */
public class ElasticSearchTemplate implements ElasticOperations {
    private Client client;

    public ElasticSearchTemplate(Client client) {
        this.client = client;
    }

    @Override
    public boolean createIndex(String index) {
        if(StringUtils.isEmpty(index)) {
            throw new TingoElasticException("Index name cannot be null");
        }
        return client.admin().indices().create(Requests.createIndexRequest(index)).actionGet().isAcknowledged();
    }

    @Override
    public <T> boolean createIndex(Class<T> dataType) {
        return createIndexIfNotExist(dataType);
    }

    private <T> boolean createIndexIfNotExist(Class<T> dataType) {
        return checkIfIndexExist(getPersistentEntityFor(clazz).getIndexName()) || createIndexWithSettings(dataType);
    }

    private <T> boolean createIndexWithSettings(Class<T> dataType) {

    }

    @Override
    public boolean checkIfIndexExist(String index) {
        return false;
    }

    @Override
    public boolean deleteIndex(String index) {
        return false;
    }

    @Override
    public <T> boolean putMapping(Class<T> dataType) {
        return false;
    }

    @Override
    public <T> boolean putMapping(Class<T> dataType, Object mapping) {
        return false;
    }

    @Override
    public boolean putMapping(String index, String type, Object mapping) {
        return false;
    }

    @Override
    public <T> Map getMapping(Class<T> dataType) {
        return null;
    }

    @Override
    public Map getMapping(String index) {
        return null;
    }

    @Override
    public Map getMapping(String index, String type) {
        return null;
    }

    @Override
    public boolean alias(IndexAlias indexAlias) {
        return false;
    }

    @Override
    public boolean aliases(List<IndexAlias> indexAliases) {
        return false;
    }

    @Override
    public List<String> getIndexByAlias(String alias) {
        return null;
    }

    @Override
    public List<String> getAliasByIndex(String index) {
        return null;
    }
}
