package com.linhphan.phannhatlinhcoffeemanager.model;

import java.io.Serializable;

/**
 * Created by Linh Phan on 10-Dec-17.
 */

public class Table implements Serializable{
    private int code;
    private String tableName;
    private String tableStatus;

    public Table() {
    }

    public Table(int code, String tableName, String tableStatus) {
        this.code = code;
        this.tableName = tableName;
        this.tableStatus = tableStatus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
    }
}
