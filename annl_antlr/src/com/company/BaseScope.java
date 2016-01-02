package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by qm on 16/1/2.
 */
public abstract class BaseScope implements Scope{

    Scope enclosingScope;
    Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();

    public BaseScope(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
    }

    public Symbol resolve(String name) {
        Symbol s = symbols.get(name);
        if (s!=null) return s;
        if (enclosingScope!=null) return enclosingScope.resolve(name);
        return null;
    }

    public void define(Symbol sym) {
        symbols.put(sym.name, sym);
        sym.scope = this;
    }

    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    public String toString() {
        return getScopeName() + ":" + symbols.keySet().toString();
    }
}
