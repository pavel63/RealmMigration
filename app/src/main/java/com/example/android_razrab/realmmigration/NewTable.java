package com.example.android_razrab.realmmigration;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by android_razrab on 11/12/2017.
 */

public class NewTable extends RealmObject {

    @PrimaryKey
    private String node;

    private String alias;

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
