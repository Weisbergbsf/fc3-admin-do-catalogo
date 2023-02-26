package org.fullcycle.admin.catologo.domain.validation.handler;

import org.fullcycle.admin.catologo.domain.category.exceptions.DomainException;
import org.fullcycle.admin.catologo.domain.validation.Error;
import org.fullcycle.admin.catologo.domain.validation.ValidationHandler;

import java.util.List;

public class ThowsValidationHandler implements ValidationHandler {
    @Override
    public ValidationHandler append(final Error anError) {
        throw DomainException.with(anError);
    }

    @Override
    public ValidationHandler append(ValidationHandler anHandler) {
        throw DomainException.with(anHandler.getErrors());
    }

    @Override
    public ValidationHandler validate(final Validation aValidation) {
        try {
            aValidation.validate();
        } catch (final Exception ex) {
            throw  DomainException.with(new Error(ex.getMessage()));
        }
        return this;
    }

    @Override
    public List<Error> getErrors() {
        return List.of();
    }
}
