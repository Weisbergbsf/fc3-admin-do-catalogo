package org.fullcycle.admin.catologo.domain.validation;

public abstract class Validator {

    private final ValidationHandler handler;

    protected Validator(final  ValidationHandler aHandler) {
        this.handler = aHandler;
    }

    public abstract void validate();

    protected ValidationHandler validationHandler() {
        return this.handler;
    }
}
