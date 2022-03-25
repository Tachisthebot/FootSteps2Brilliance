package FootSteps2Brilliance.step_defenitions;

import FootSteps2Brilliance.utilities.Driver;
import org.junit.Test;

public class TestOpenWebPage {
    @Test
    public void test() {
        Driver.getDriver().get("https://www.google.com/");
        System.out.println("Title of A driver " + Driver.getDriver().getTitle());
    }
}
