package org.fullcycle.admin.catologo.domain.category;

import org.fullcycle.admin.catologo.domain.validation.ValidationHandler;
import org.fullcycle.admin.catologo.domain.validation.Validator;

public class CategoryValidator extends Validator {

    private final Category category;
    public CategoryValidator(final Category aCategory,final ValidationHandler aHandler) {
        super(aHandler);
        this.category = aCategory;
    }

    @Override
    public void validate() {

    }
}
