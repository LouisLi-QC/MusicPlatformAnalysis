package com.hwadee.scu.common.domain.entity;

public class UserCount {

    private Long value;
    private String name;

    public UserCount() {
    }

    public UserCount(Long value,String name) {
        this.value=value;
        this.name=name;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UserCount{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
