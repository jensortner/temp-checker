package jens.ortner.tempchecker;

import org.springframework.stereotype.Component;


public class TempPrinter {

    public String printTemp(Unit unit) {
        if (unit == null || unit.getUnitName() == null) {
            return "Empty Object";
        }

        return "";
    }
}
