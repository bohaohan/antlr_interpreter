package com.company;

/**
 * Created by qm on 16/1/2.
 */
public interface Scope {

    public String getScopeName();

    public Scope getEnclosingScope();

    public void define(Symbol sym);

    public Symbol resolve(String name);
}
