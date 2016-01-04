package com.company;

/**
 * Created by bohaohan on 1/1/16.
 */
public class Variable extends Symbol{
    public Variable(){}
    public Variable(String type){
        this.dType = type;
    }
    public Variable(String varType, String type) {
        this.varType = varType;
        this.dType = type;
    }
    public Variable(String varType, String type, String id) {
        this.varType = varType;
        this.dType = type;
        this.id = id;
        this.name = id;
    }
    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
    }


    private String varType = null;

    public String getType() {
        return dType;
    }

    public void setType(String type) {
        this.dType = type;
    }

    private String dType = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        this.name = id;
    }

    private String id = null;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value = "0";
}
