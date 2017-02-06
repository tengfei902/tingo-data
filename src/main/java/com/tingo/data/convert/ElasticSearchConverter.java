package com.tingo.data.convert;

import org.springframework.core.convert.ConversionService;

/**
 * Created by tengfei on 2017/2/6.
 */
public interface ElasticSearchConverter {
    /**
     * 实体类->索引信息映射
     * @return
     */
    MappingContext<? extends ElasticsearchPersistentEntity<?>, ElasticsearchPersistentProperty> getMappingContext();
    ConversionService getConversionService();
}
