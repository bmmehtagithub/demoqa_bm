package com.demoqa.task_helper;

import com.demoqa.browserfactory.DriverHelpers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskHelper  extends DriverHelpers {
    public static Actions actions;
    public static JavascriptExecutor js;

    public static void applyActions(){
        actions=new Actions(driver);
    }
    public static WebDriverWait explicitWait(long seconds){
        WebDriverWait wait=new WebDriverWait(driver,seconds);
        return wait;
    }
    public static void customWait(long miliSeconds){
        try {
            Thread.sleep(miliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void ScrollByJavaScriptExecutor(int y,int x){
        js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy("+y+","+x+")");
    }
}
