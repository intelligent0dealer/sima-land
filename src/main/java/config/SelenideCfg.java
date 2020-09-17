package config;

import com.codeborne.selenide.Configuration;

public class SelenideCfg {
    static {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "//driver/chromedriver.exe");
    }
    public SelenideCfg() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://www.sima-land.ru";
    }
}
