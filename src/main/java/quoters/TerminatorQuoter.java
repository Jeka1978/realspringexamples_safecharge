package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@Film
public class TerminatorQuoter implements Quoter {

    @Autowired
    @Qualifier("terminatorQuoter")
    private Quoter myProxy;

    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] messages) {
        this.messages = asList(messages);
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    public void sayBla(){
        System.out.println("Blaa");
    }


    public void killAll(){
        System.out.println("you are terminated...");
    }
}
