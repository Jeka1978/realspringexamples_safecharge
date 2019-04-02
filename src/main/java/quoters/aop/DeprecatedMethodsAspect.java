package quoters.aop;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Aspect
public class DeprecatedMethodsAspect {
    private Random random = new Random();


    @Pointcut("execution(* quoters..*.*(..))")
    public void allBusinessMethods(){}

    @Around("@annotation(Deprecated) && allBusinessMethods()")
    @SneakyThrows
    public void handleDeprecated(ProceedingJoinPoint pjp) {
        System.out.println("you are using deprecated method "+pjp.getSignature().getName());
        if (random.nextBoolean()) {
            System.out.println("you are lucky I'll run it this time");
            pjp.proceed();
        }else {
            System.out.println("I'll not run this method this time, it is deprecated");
        }
    }
}








