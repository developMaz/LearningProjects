package com.learning.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLogger(){
        ///Given
        /*Logger logger = new Logger();
        useless code after being transformed into singleton
         */
        //When
        Logger.getInstance().log("logging");
        Logger.getInstance().log("next logging");
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("next logging", lastLog);
    }
}
