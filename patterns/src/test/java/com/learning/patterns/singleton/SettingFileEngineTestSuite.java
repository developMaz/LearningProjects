package com.learning.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingFileEngineTestSuite {

    @BeforeClass
    public static void openSettingsFile() {
        SettingsFileEngine.getInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingFile(){
        SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName(){
        //Given
        //When
        String fileName =  SettingsFileEngine.getInstance().getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        Assert.assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings(){
        //Given
        //When
        boolean result =  SettingsFileEngine.getInstance().loadSettings();
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings(){
        //Given
        //When
        boolean result =  SettingsFileEngine.getInstance().saveSettings();
        //Then
        Assert.assertTrue(result);
    }

}
