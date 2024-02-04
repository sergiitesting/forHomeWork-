package lesson13.config;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.TextCheck;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser {
    public void setBrowser(String testName) {
        var selenideConfig = new SelenideConfig();
        selenideConfig.browser("chrome");
        selenideConfig.browserSize("1920x1080");
        selenideConfig.pageLoadStrategy("normal");
        selenideConfig.pageLoadTimeout(15000);
        selenideConfig.timeout(10000);
        selenideConfig.textCheck(TextCheck.FULL_TEXT);
        selenideConfig.remote("http://8.8.8.8:4444/wd/hub");
        selenideConfig.browserCapabilities(capabilities(testName));
    }


    public static DesiredCapabilities capabilities(String testName){
        var capabilities = new DesiredCapabilities();
        var option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        capabilities.setCapability("goog:chromeOptions", option);

        //selenoid
        capabilities.setCapability("enableVideo", true);
        capabilities.setCapability("videoName", testName + ".mp4");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("sessionTimeout", "2m");
        capabilities.setCapability("timeZone", "Europe/Kiev");
        return capabilities;
    }
}
