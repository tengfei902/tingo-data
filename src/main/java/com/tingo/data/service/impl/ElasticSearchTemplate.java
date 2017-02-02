package com.tingo.data.service.impl;

import com.tingo.data.service.ElasticOperations;
import org.elasticsearch.client.Client;

/**
 * Created by tengfei on 2017/1/26.
 */
public class ElasticSearchTemplate implements ElasticOperations {
    private Client client;

    public ElasticSearchTemplate(Client client) {
        this.client = client;
    }

}
