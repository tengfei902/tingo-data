package com.tingo.data.criterial;

import com.tingo.data.enums.AliasSet;

/**
 * Created by tengfei on 2017/2/3.
 */
public class IndexAlias {
    private String index;
    private String alias;
    private AliasSet operator;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public AliasSet getOperator() {
        return operator;
    }

    public void setOperator(AliasSet operator) {
        this.operator = operator;
    }
}
