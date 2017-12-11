package com.linhphan.phannhatlinhcoffeemanager.models;

import java.io.Serializable;

/**
 * Created by Linh Phan on 10-Dec-17.
 */

public class Table implements Serializable{
    private int code;//thường thì đặt là id
    private String tableName;//sửa thành name
    private String tableStatus;//sửa thành status
    //2 thuộc tính name và status nó thuộc table rồi thì chỉ cần đặt là name, status là được rồi

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
