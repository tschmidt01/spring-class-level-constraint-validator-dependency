package com.example.demo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

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
