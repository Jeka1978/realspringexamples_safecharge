package profiles_example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MockConfig.class)
@ActiveProfiles("WINTER_IS_COMING")
public class PredictionServiceTest {

    @Autowired
    private PredictionService predictionService;

    @Test
    public void predictionServiceNotInWinterWorkingCorrectly() {
        Assert.assertFalse(predictionService.willSurviveThisWinter("Nedd stark"));
        Assert.assertTrue(predictionService.willSurviveThisWinter("Robert Baration"));
        Assert.assertTrue(predictionService.willSurviveThisWinter("Therion Lanister"));
    }
}














