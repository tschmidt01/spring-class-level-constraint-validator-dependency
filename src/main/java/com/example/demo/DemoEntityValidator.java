package com.example.demo;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class DemoEntityValidator implements ConstraintValidator<ValidDemoEntity, DemoEntity> {

    private DemoEntityRepository demoEntityRepository;

    public DemoEntityValidator(DemoEntityRepository demoEntityRepository) {
        this.demoEntityRepository = demoEntityRepository;
    }

    @Override
    public void initialize(ValidDemoEntity constraintAnnotation) {

    }

    @Override
    public boolean isValid(DemoEntity demoEntity, ConstraintValidatorContext constraintValidatorContext) {
        return true;
    }
}
