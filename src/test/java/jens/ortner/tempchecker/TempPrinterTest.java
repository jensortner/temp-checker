package jens.ortner.tempchecker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TempPrinterTest {
    @Autowired
    TempPrinter tempPrinter;
    @Autowired
    Unit unit;

    @Test
    public void shouldThrowForPrintingNullObject(){
        //Arrange
        Unit testUnit = new Unit()

        //Act

        //Assert
    }

}
