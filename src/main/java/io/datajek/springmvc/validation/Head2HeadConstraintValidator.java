package io.datajek.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Head2HeadConstraintValidator implements ConstraintValidator<HeadToHead, String> {
    @Override
    public void initialize(HeadToHead headToHead) {
 // annotation does not take any value parameter that can be initialized,  no need to use this method.
    }

    @Override
    public boolean isValid(String headToHeadScore, ConstraintValidatorContext constraintValidatorContext) {
        return headToHeadScore.matches("[0-9]{1,2}-[0-9]{1,2}");
    }

    //custom business logic to validate the annotation

}