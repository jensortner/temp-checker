package jens.ortner.tempchecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempPrinterTest {

    TempPrinter tempPrinter = new TempPrinter();

    @Test
    public void shouldPrintErrorMsgForPrintingNullObject() {
        //Arrange, Act & Assert
        assertEquals("Empty Object",tempPrinter.printTemp(null));
    }

    @Test
    public void shouldPrintErrorMsgForPrintingNullNameOfObject(){
        //Arrange
        Unit testUnit = new Unit(null);
        //Act & Assert
        assertEquals("Empty Object",tempPrinter.printTemp(testUnit));
    }

    @Test
    public void shouldPrintPrintTempHighIfTempAboveMinus18Degrees(){
        //Arrange
        Unit testUnit = new Unit("kitchen");
        testUnit.newMapEntry(-10);
        //Act & Assert
        assertEquals("Temp High",tempPrinter.printTemp(testUnit));
    }

    @Test
    public void shouldPrintPrintDateAndTempAndReturnString(){
        //Arrange
        Unit testUnit = new Unit("kitchen");
        testUnit.newMapEntry(-18);
        testUnit.newMapEntry(-50);
        testUnit.newMapEntry(-68);
        //Act & Assert
        assertNotNull(tempPrinter.printTemp(testUnit));
    }



}
