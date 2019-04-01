package com.annotation_bean_declaration;/**
 * @author Evgeny Borisov
 */

import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Component
public @interface SafechargeComponent {
}
