package com.example.demo;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {DemoEntityValidator.class})
public @interface ValidDemoEntity {

    String message() default "{some.demo.validator.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
