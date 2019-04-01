package quoters;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Film
public class TrumpeldorQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("Good to die for our country!");
    }
}
