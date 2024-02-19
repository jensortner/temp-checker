package jens.ortner.tempchecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempPrinterTest {

    TempPrinter tempPrinter = new TempPrinter();

    @Test
    public void shouldPrintErrorMsgForPrintingNullObject(){
        //Arrange
        Unit testUnit = null;
        //Act & Assert
        assertEquals("Empty Object",tempPrinter.printTemp(testUnit));
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



}
