package jens.ortner.tempchecker;



public class TempPrinter {

    public String printTemp(Unit unit) {
        if (unit == null || unit.getUnitName() == null) {
            return "Empty Object";
        }
        boolean temp = unit.getTempMap().values().stream().anyMatch(val -> val>-18);
        if (temp) {
           return  "Temp High";
        }
        return "";
    }
}
