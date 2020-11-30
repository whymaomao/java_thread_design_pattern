package com.yue.ImmutableUser;

/// define as final
// do not provide setter function
public final class person {
    private final String name;
    private final String address;

    public person(String name, String address){
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[ Person: name = " + name + ", address = " + address + " ]";
    }
}
