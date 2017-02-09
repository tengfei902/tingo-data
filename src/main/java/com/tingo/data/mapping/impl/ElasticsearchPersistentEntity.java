package com.tingo.data.mapping.impl;

import com.tingo.data.mapping.PersistentEntity;

/**
 * Created by tengfei on 2017/2/9.
 */
public interface ElasticsearchPersistentEntity extends PersistentEntity {

    String getIndexName();

    String getIndexType();

    short getShards();

    short getReplicas();

    boolean isUseServerConfiguration();

    String getRefreshInterval();

    String getIndexStoreType();

    ElasticsearchPersistentProperty getVersionProperty();

    String getParentType();

    ElasticsearchPersistentProperty getParentIdProperty();

    String settingPath();

    boolean isCreateIndexAndMapping();
}
