package org.fullcycle.admin.catologo.domain.category.exceptions;

import org.fullcycle.admin.catologo.domain.validation.Error;

import java.util.List;

public class DomainException extends NoStacktraceException {
    private final List<Error> errors;

    public DomainException(final List<Error> anErrors) {
        super("");
        this.errors = anErrors;
    }

    public static DomainException with(final List<Error> anErrors){
        // return new DomainException(List.of(anErrors));
        return new DomainException(anErrors);
    }

    public List<Error> getErrors() {
        return errors;
    }
}
