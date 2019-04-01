package profiles_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class StartService {
    @Autowired
    private PredictionService predictionService;

    @EventListener(ContextRefreshedEvent.class)
    public void start() {
        boolean answerStark = predictionService.willSurviveThisWinter("Nedd Stark");
        System.out.println("answer = " + answerStark);
        boolean answerBoration = predictionService.willSurviveThisWinter("Baration");
        System.out.println("answerBoration = " + answerBoration);
        }
}
