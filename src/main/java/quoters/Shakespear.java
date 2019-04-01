package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */

@Book
public class Shakespear implements Quoter {

    private String message;


    @Value("${shake}")
    public void setMessage(String message) {
        this.message = message.toUpperCase();
    }

    @InjectRandomInt(min=3,max=7)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
