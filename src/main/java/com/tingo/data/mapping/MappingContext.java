package com.tingo.data.mapping;

import java.util.Collection;

/**
 * Created by tengfei on 2017/2/9.
 */
public interface MappingContext<T extends PersistentEntity,P extends PersistentProperty> {

    Collection<T> getPersistentEntities();

    T getPersistentEntity(Class dataType);

    T getPersistentEntity(P property);

    boolean hasPersistentEntityFor(Class dataType);
}
