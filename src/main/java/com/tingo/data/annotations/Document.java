package com.tingo.data.annotations;

/**
 * Created by tengfei on 2017/1/29.
 */

public @interface Document {
    String index();

    String type();

    short shards() default 5;

    short replicas() default 1;

    String refreshInterval() default "1s";

    String indexStoreType() default "fs";
}
