package jens.ortner.tempchecker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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



}
