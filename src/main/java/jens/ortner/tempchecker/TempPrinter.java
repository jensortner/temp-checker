package jens.ortner.tempchecker;


import java.util.List;

public class TempPrinter {

    public String printTemp(Unit unit) {

        if (unit == null || unit.getUnitName() == null) {
            return "Empty Object";
        }
        boolean temp = unit.getTempMap().values().stream().anyMatch(val -> val>-18);
        if (temp) {
           return  "Temp High";
        }

        unit.getTempMap().entrySet().stream()
                .map(val -> "Date: " + val.getKey().toString() + " Temp: " + val.getValue() + "\n").toList()
                .forEach(System.out::print);

        return "";
    }
}
