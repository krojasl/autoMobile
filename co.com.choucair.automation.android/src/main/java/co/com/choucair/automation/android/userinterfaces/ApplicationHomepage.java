package co.com.choucair.automation.android.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class ApplicationHomepage {
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.id("org.wordpress.android:id/login_button"));
}
