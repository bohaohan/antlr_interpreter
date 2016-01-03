package com.company;

/**
 * Created by bohaohan on 1/1/16.
 */
public class Variable {
    public Variable(){}
    public Variable(String type){
        this.type = type;
    }
    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
    }

    private String varType = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id = null;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value = null;
}
