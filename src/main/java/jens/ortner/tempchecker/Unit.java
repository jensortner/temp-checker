package jens.ortner.tempchecker;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Unit {

    private final String unitName;
    private final Map<LocalDateTime,String> tempMap = new HashMap<>();

    public Unit(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitName() {
        return unitName;
    }

    public Map<LocalDateTime, String> getTempMap() {
        return tempMap;
    }

    public void newMapEntry(String temp){
        this.tempMap.put(LocalDateTime.now(), temp);
    }

}
