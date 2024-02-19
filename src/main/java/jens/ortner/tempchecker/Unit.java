package jens.ortner.tempchecker;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Component
public class Unit {

    private final String unitName;
    private Integer temp;
    private Map<Date,String> tempMap = new HashMap<>();

    public Unit(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitName() {
        return unitName;
    }

    public Map<Date, String> getTempMap() {
        return tempMap;
    }

}
