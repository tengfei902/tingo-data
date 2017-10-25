package com.tingo.data.client.impl;

import com.tingo.data.client.ClientFactory;
import com.tingo.data.config.DataConfig;
import com.tingo.data.config.impl.ElasticDataConfig;
import org.elasticsearch.client.transport.TransportClient;

/**
 * Created by tengfei on 2017/1/26.
 */
public class ElasticClientFactory implements ClientFactory<TransportClient> {

    private String clusterNodes = "127.0.0.1:9300";
    private String clusterName = "elasticsearch";
    private Boolean clientTransportSniff = true;
    private Boolean clientIgnoreClusterName = Boolean.FALSE;
    private String clientPingTimeout = "5s";
    private String clientNodesSamplerInterval = "5s";
    private TransportClient client;

    @Override
    public  ElasticClientFactory init(DataConfig config) {
        ElasticDataConfig elasticDataConfig = (ElasticDataConfig)config;
        this.clusterName = elasticDataConfig.getClusterName();
        this.clusterNodes = elasticDataConfig.getClusterNodes();
        this.clientTransportSniff = elasticDataConfig.getClientTransportSniff();
        this.clientIgnoreClusterName = elasticDataConfig.getClientIgnoreClusterName();
        this.clientPingTimeout = elasticDataConfig.getClientPingTimeout();
        this.clientNodesSamplerInterval = elasticDataConfig.getClientNodesSamplerInterval();
        return this;
    }

    @Override
    public TransportClient getClient() {
        return client;
    }
}
