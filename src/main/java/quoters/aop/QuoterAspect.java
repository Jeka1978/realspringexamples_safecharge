package quoters.aop;

import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */

@Aspect
@Component
public class QuoterAspect {

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println(Object.class.getMethod("toString").toString());
    }

    //signature of some method:     java.lang.String java.lang.Object.toString()
    @Before("execution(* quoters..*.say*(..)))")
    public void doBeforeSayMethods(JoinPoint jp){
        String simpleName = jp.getTarget().getClass().getSimpleName();
        System.out.println("this is quote of "+simpleName+": ");
    }

}
