package quoters;

/**
 * @author Evgeny Borisov
 */
public class Shakespear implements Quoter {
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
