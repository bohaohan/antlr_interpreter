package com.company;

/**
 * Created by qm on 16/1/2.
 */
public class Symbol {
    public static enum Type {INVALID, REAL, INT, DOUBLE, BOOL, CHAR,
        REAL_LIST, INT_LIST, DOUBLE_LIST, BOOL_LIST, CHAR_LIST};

    String name;      // All symbols at least have a name
    Type type;
    Scope scope;      // All symbols know what scope contains them.

    public Symbol(String name) { this.name = name; }
    public Symbol(String name, Type type) { this(name); this.type = type; }
    public String getName() { return name; }

    public String toString() {
        if ( type!=Type.INVALID ) return '<'+getName()+":"+type+'>';
        return getName();
    }
}
