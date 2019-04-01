package com.conditional_examples;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Evgeny Borisov
 */
public class OnProdEnvCondition implements Condition {
    private static Boolean cachedAnswer;
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (cachedAnswer == null) {
            cachedAnswer = !System.getenv().get("OS").toLowerCase().contains("windows");
        }
        return cachedAnswer;
    }
}
