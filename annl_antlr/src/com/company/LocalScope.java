package com.company;

/**
 * Created by qm on 16/1/2.
 */
public class LocalScope extends BaseScope {

    public LocalScope(Scope parent) {
        super(parent);
    }

    public String getScopeName() {
        return "locals";
    }
}
