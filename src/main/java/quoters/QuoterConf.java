package quoters;

import org.springframework.context.annotation.*;

/**
 * @author Evgeny Borisov
 */
@Configuration
@PropertySource("classpath:quotes.properties")
@ComponentScan
@EnableAspectJAutoProxy
@ImportResource(locations = "classpath:context.xml")
public class QuoterConf {
}
