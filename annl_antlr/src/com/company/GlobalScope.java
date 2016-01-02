package com.company;

/**
 * Created by qm on 16/1/2.
 */
public class GlobalScope extends BaseScope {
    public GlobalScope(Scope enclosingScope) {
        super(enclosingScope);
    }

    public String getScopeName() {
        return "globals";
    }
}
