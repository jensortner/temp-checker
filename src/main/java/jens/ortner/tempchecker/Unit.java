package jens.ortner.tempchecker;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Unit {

    private final String unitName;
    private Map<Date,String> tempMap;

    public Unit(String unitName, Map<Date, String> tempMap) {
        this.unitName = unitName;
        this.tempMap =  new HashMap<>();
    }

    public String getUnitName() {
        return unitName;
    }

    public Map<Date, String> getTempMap() {
        return tempMap;
    }

    public void setTempMap(Map<Date, String> tempMap) {
        this.tempMap = tempMap;
    }
}
