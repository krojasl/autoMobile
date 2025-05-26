package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target EMAIL_INPUT = Target.the("input for write emaill")
            .located(By.id("org.wordpress.android:id/input"));
    public static final Target EMAIL_BUTTON = Target.the("button next email")
            .located(By.id("org.wordpress.android:id/primary_button"));
    public static final Target PASSWORD_LINK = Target.the("Link for enter your password")
            .located(By.id("org.wordpress.android:id/login_enter_password"));
    public static final Target PASSWORD_INPUT = Target.the("input for write password")
            .located(By.id("org.wordpress.android:id/input"));
    public static final Target PASSWORD_BUTTON = Target.the("button next password")
            .located(By.id("org.wordpress.android:id/primary_button"));
    public static final Target TEXT_LABEL = Target.the("text label for validations")
            .located(By.id("org.wordpress.android:id/logged_in_as_heading"));

}
