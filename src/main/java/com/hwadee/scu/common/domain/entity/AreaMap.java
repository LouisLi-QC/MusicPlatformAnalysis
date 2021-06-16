package com.hwadee.scu.common.domain.entity;

import java.util.Map;

public class AreaMap {
    private Map<String, Long> areaMap;

    public AreaMap() {
    }

    public Map<String, Long> getAreaMap() {
        return areaMap;
    }

    public void setAreaMap(Map<String, Long> areaMap) {
        this.areaMap = areaMap;
    }

    @Override
    public String toString() {
        return "AreaMap{" +
                "areaMap=" + areaMap +
                '}';
    }
}
