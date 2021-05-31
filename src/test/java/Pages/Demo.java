package Pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public WebDriver ldriver;
    ExtentReports extent = new ExtentReports();
    By homeLoans=By.linkText("Home loans");
    //By.xpath("//a[text()='Home loans')]");
    By calculators=By.xpath("//img[@ src='/content/dam/commbank-assets/pictograms/pictogram_calculator64.svg']");
    By checkBox=By.xpath("//*[@id='item-1']/span");
    By repaymentCalculator=By.xpath("//a[@data-tracker-locationid='calc_repayments']");
    By homeCheckBox=By.xpath("//*[@class='rct-icon rct-icon-uncheck']");
    By noRadioButton=By.xpath("//*[@id='impressiveRadio' and @type='radio']");
    By yesRadio=By.xpath("//*[@class='custom-control-label' and @for='yesRadio']");
    Demo(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    public void clickOnForms() throws IOException{


    }
    public void clickHomeLoans() throws IOException{
        takeScreenShot();
        ldriver.manage().window().maximize();
        ldriver.findElement(homeLoans).click();
        takeScreenShot();

//        ldriver.findElement(radioButton).click();
//        ldriver.findElement(yesRadio).click();
//        takeScreenshotForEachStep("clicking on radio button");
        // extentReport("AutomationReport");

    }
    public void clickOnCalculator() throws IOException{
        JavascriptExecutor js=(JavascriptExecutor)ldriver;
        js.executeScript("window.scrollBy(0,350)", "");
        ldriver.findElement(calculators).click();
        takeScreenShot();
//        takeScreenshotForEachStep("clicking on element");
//        ldriver.findElement(radioButton).click();
//       // ldriver.findElement(yesRadio).click();
//        takeScreenshotForEachStep("clicking on radio button");
        // extentReport("AutomationReport");

    }
    public void calculateRepayment() throws IOException{
        JavascriptExecutor js=(JavascriptExecutor)ldriver;
        js.executeScript("window.scrollBy(0,350)", "");
        takeScreenShot();
        ldriver.findElement(repaymentCalculator).click();


    }
    public  String takeScreenShot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot)ldriver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        String destination=System.getProperty("user.dir")+"/Screenshots/" +"Commenwealth bank repayment"+".png";
        File finalDestination=new File(destination);
        FileUtils.copyFile(source, finalDestination);
        return destination;
    }

    public void extentReport(String title) throws IOException{
        ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/" +title +".html");
//        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        extent.flush();

    }
    public void takeScreenshotForEachStep(String teststep) throws IOException{
        ExtentTest logger=extent.createTest(teststep);
        logger.log(Status.INFO, teststep);
        logger.pass("Attaching screenshot of the test", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot()).build());
        logger.log(Status.PASS, "Title verified");

    }
    public  void BrowserClose()
    {
        ldriver.quit();
    }



}













//
//        char []charSearch={};
//        for(int i=0;i<s.length();i++) {
//
////            char ch = s.charAt(i);
////
//          System.out.println(s.split(""));
//
//        }
//    String S = "aaabbcccc";
//    // convert string into stream
//    Map< Character, Long > result = S
//            .chars().mapToObj(c -> (char) c)
//            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//        result.forEach((k, v) -> {
//                if (v > 1) {
//                System.out.println(k + " : " + v);
//                }
//                });


























//    String s="Welcometojava";
//index=  0123456789012
//   int k=3;
//        int len=s.length();
//        System.out.println("Length is "+len);
// System.out.println(s.substring(0,3));
//
//    String[] res = new String[(s.length()+2)/3];
//        for (int i = 0 ; i != res.length ; i++) {
//                res[i] = s.substring(3*i, Math.min(3*i+3, s.length()));
//                System.out.println(res[i]);
//                }

//            String splitString=s.substring(0,k);
//           System.out.println(s.indexOf(splitString));
//  ar.add(k,i+k);
//ar.add(s.substring(k,))
//                }
//        ar.add(s.substring(0,3));
//        ar.add(s.substring(3,6));
//        for (int i=0;i<res.size();i++){
//            System.out.println(res.get(i));
//       }



