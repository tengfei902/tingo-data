package com.tingo.data.client;

import com.tingo.data.config.DataConfig;

/**
 * Created by tengfei on 2017/1/28.
 */
public interface ClientFactory<K> {
    <T extends ClientFactory> T init(DataConfig config);
    K getClient();
}
