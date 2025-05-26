package co.com.choucair.automation.android.utils;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

public class Hook {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }
}
