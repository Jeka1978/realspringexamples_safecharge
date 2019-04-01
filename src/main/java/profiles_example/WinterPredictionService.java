package profiles_example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@Profile("WINTER_IS_HERE")
//spring.profiles.active=WINTER_IS_HERE
public class WinterPredictionService implements PredictionService {
    @Override
    public boolean willSurviveThisWinter(String name) {
        return name.toLowerCase().contains("lanister");
    }
}
