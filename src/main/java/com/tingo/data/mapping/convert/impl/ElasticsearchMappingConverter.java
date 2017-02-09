package com.tingo.data.mapping.convert.impl;

import com.tingo.data.mapping.MappingContext;
import com.tingo.data.mapping.convert.MappingConverter;
import com.tingo.data.mapping.impl.ElasticsearchPersistentEntity;
import com.tingo.data.mapping.impl.ElasticsearchPersistentProperty;
import org.springframework.core.convert.ConversionService;

/**
 * Created by tengfei on 2017/2/10.
 */
public class ElasticsearchMappingConverter implements MappingConverter {
    private MappingContext<? extends ElasticsearchPersistentEntity,ElasticsearchPersistentProperty> elasticsearchMappingContext;

    @Override
    public MappingContext<? extends ElasticsearchPersistentEntity,ElasticsearchPersistentProperty> getMappingContext() {
        return elasticsearchMappingContext;
    }

    @Override
    public ConversionService getConversionService() {
        return null;
    }
}
