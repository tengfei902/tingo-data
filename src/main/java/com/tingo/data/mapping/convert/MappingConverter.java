package com.tingo.data.mapping.convert;

import com.tingo.data.mapping.MappingContext;
import com.tingo.data.mapping.PersistentEntity;
import com.tingo.data.mapping.PersistentProperty;
import org.springframework.core.convert.ConversionService;

/**
 * Created by tengfei on 2017/2/6.
 */
public interface MappingConverter<P extends PersistentEntity,K extends PersistentProperty> {
    /**
     * 实体类->索引信息映射
     * @return
     */
    MappingContext<P,K> getMappingContext();
    ConversionService getConversionService();
}
