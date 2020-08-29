import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SampleSelenideTest {

  @BeforeMethod
  public void setUp() {
    Configuration.browser = "Chrome";
  }

  @Test
  public void loginTest() {
    open("https://jira.hillel.it/secure/Dashboard.jspa");
    $(By.id("login-form-username")).setValue("IrinaChub");
    $(By.id("login-form-password")).setValue("IrinaChub");
    $(By.id("login")).click();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
//    assertTrue(1 == 1);

    $(By.xpath(("//*[@id='dashboard-content']//h1"))).shouldBe(Condition.visible);
//    Configuration.assertionMode = Configuration.AssertionMode.SOFT;
//    Configuration.assertionMode = Configuration.AssertionMode.STRICT;
  }
}