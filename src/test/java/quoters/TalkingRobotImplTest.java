package quoters;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TalkingRobotImplTest {

    @Test
    public void name() {
        TalkingRobotImpl talkingRobot = new TalkingRobotImpl();
        talkingRobot.talk();
    }
}