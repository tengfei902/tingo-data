package com.tingo.data.client;

import com.tingo.data.BaseTestCase;
import com.tingo.data.config.ElasticDataConfig;
import com.tingo.data.service.impl.ElasticSearchTemplate;
import org.elasticsearch.client.transport.TransportClient;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by tengfei on 2017/1/26.
 */
public class ElasticClientFactoryTest extends BaseTestCase {

    @Test
    public void testInitClient() {
        ElasticDataConfig config = new ElasticDataConfig();
        TransportClient client = new ElasticClientFactory().init(config).getClient();
        ElasticSearchTemplate elasticSearchTemplate = new ElasticSearchTemplate(client);
        elasticSearchTemplate.batchSave(Arrays.asList("abc","def"));
    }
}
