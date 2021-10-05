package com.udhayanna;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Random;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.XMLFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class superClass {

    public WebDriverWait wait;
    String returnValue;
    public Actions action;
    int randomInteger;

    public WebDriverWait getwaitdriver(WebDriver driver) {
        if (wait == null) {
            wait = new WebDriverWait(driver, 10);
            return wait;
        } else {
            return wait;
        }
    }

    public Actions getActionDriver(WebDriver driver) {
        if (action == null) {
            action = new Actions(driver);
            return action;
        } else {
            return action;
        }

    }

    public String getValueFromDataConfig(String value) throws IOException {

        FileReader reader = new FileReader("./src/test/resources/Data.properties");

        Properties p = new Properties();
        p.load(reader);

        returnValue = p.getProperty(value);
        return returnValue;

    }

    public By getValueFromElementAddressConfig(String value) throws IOException {
        FileReader reader = new FileReader("./src/test/resources/elementAddress.properties");

        Properties p = new Properties();
        p.load(reader);

        returnValue = p.getProperty(value);

        By elementByAddress = By.xpath(returnValue);

        // WebElement elementAddress = driver.findElement(By.xpath(returnValue));
        return elementByAddress;

    }

    public static String getAlphaNumericString(int n) {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }

    public void setLogger(String log) throws Exception {

        // Creating an object of XMLFormatter class
        XMLFormatter xmlFormatter = new XMLFormatter();

        // Setting level to Info
        LogRecord logRecord = new LogRecord(Level.INFO, "Logrecord message to be printed in xml file..");
        logRecord.setMessage(log);

        // We can see the output of LogRecord in
        // logrecordxml.xml file
        FileHandler fileHandler = new FileHandler("logrecordxml.xml");
        fileHandler.setFormatter(xmlFormatter);

        // Prepared data is displayed in the
        // logrecordxml.xml file
        fileHandler.publish(logRecord);

        // Lastly releasing out all the records
        // using the flush() method
        fileHandler.flush();
    }

    public String getcurrrentDateAndTime() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        return dtf.format(now);

    }

    public HashMap<Integer, String> hashIssueCategory() {
        HashMap<Integer, String> issueCategorymap = new HashMap<Integer, String>();// Creating HashMap
        issueCategorymap.put(1, "Public Utility Service"); // Put elements in Map
        issueCategorymap.put(2, "Livelihood");
        issueCategorymap.put(3, "Government Documents");
        issueCategorymap.put(4, "Others");
        return issueCategorymap;
    }

    public HashMap<Integer, String> hashIssuePUS() {
        HashMap<Integer, String> issuemapPUS = new HashMap<Integer, String>();// Creating HashMap
        issuemapPUS.put(1, "Government school");
        issuemapPUS.put(2, "Encroachment");
        issuemapPUS.put(3, "Road");
        issuemapPUS.put(4, "Park and Playground");
        issuemapPUS.put(5, "Ration shops");
        issuemapPUS.put(6, "Transport");
        issuemapPUS.put(7, "Cremation ground");
        issuemapPUS.put(8, "Stormwater drain");
        issuemapPUS.put(9, "Drinking water");
        issuemapPUS.put(10, "Garbage");
        issuemapPUS.put(11, "Government hospital");
        issuemapPUS.put(12, "Public toilets");
        issuemapPUS.put(13, "Electricity");
        issuemapPUS.put(14, "Public health");
        issuemapPUS.put(15, "Street Light");
        issuemapPUS.put(16, "Water stagnation");
        issuemapPUS.put(17, "Drainage");
        issuemapPUS.put(18, "Housing");
        return issuemapPUS;

    }

    public HashMap<Integer, String> hashIssueLiveli() {
        HashMap<Integer, String> issuemapLiveli = new HashMap<Integer, String>();// Creating HashMap
        issuemapLiveli.put(1, "Transgender welfare");
        issuemapLiveli.put(2, "Women welfare");
        issuemapLiveli.put(3, "Differently abled Welfare");
        issuemapLiveli.put(4, "Pension");
        issuemapLiveli.put(5, "Education assistance");
        issuemapLiveli.put(6, "Employment Assistance");
        return issuemapLiveli;
    }

    public HashMap<Integer, String> hashIssueGovtDoc() {
        HashMap<Integer, String> issuemapGovtDoc = new HashMap<Integer, String>();// Creating HashMap
        issuemapGovtDoc.put(1, "OBC certificate");
        issuemapGovtDoc.put(2, "Aadhar card");
        issuemapGovtDoc.put(3, "Death certificate");
        issuemapGovtDoc.put(4, "Community certificate");
        issuemapGovtDoc.put(5, "Birth certificate");
        issuemapGovtDoc.put(6, "Ration card");
        issuemapGovtDoc.put(7, "Legal heir certificate");
        issuemapGovtDoc.put(8, "Deserted woman certificate");
        return issuemapGovtDoc;
    }

    public int getrandomvalue(int from, int to) {

        for (int i = 0; i < 1; i++) {
            Random random = new Random();
            randomInteger = random.nextInt(to);
            if(randomInteger == 0)
            {
                randomInteger = randomInteger + 1;
            }
            System.out.println("int in a range : " + randomInteger);
        }
        return randomInteger;

    }

}
