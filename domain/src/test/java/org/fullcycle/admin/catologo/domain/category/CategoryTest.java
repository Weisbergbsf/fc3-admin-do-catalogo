package org.fullcycle.admin.catologo.domain.category;

import org.fullcycle.admin.catologo.domain.category.Category;
import org.fullcycle.admin.catologo.domain.category.exceptions.DomainException;
import org.fullcycle.admin.catologo.domain.validation.handler.ThowsValidationHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void givenAValidParams_whenCallNewCategory_themInstatiateACategory() {
        final var expectedName = "Filmes";
        final var expectedDescription = "A vategoria mais assistida";
        final var expectedIsActive = true;

        final var  actualCategory = Category.newCategory(expectedName, expectedDescription, expectedIsActive);

        Assertions.assertNotNull(actualCategory);
        Assertions.assertNotNull(actualCategory.getId());
        Assertions.assertEquals(expectedName, actualCategory.getName());
        Assertions.assertEquals(expectedDescription, actualCategory.getDescription());
        Assertions.assertEquals(expectedIsActive, actualCategory.isActive());
        Assertions.assertNotNull(actualCategory.getCreatedAt());
        Assertions.assertNotNull(actualCategory.getUpdatedAt());
        Assertions.assertNull(actualCategory.getDeletedAt());
    }

    @Test
    public void givenAnInvalidNullName_whenCallNewCategoryAndValidate_themShouldReceiveError() {
        final String expectedName = null;
        final var expectedErrorCount = 1;
        final var expectedErrorMessage = "'name' should be not null";
        final var expectedDescription = "A vategoria mais assistida";
        final var expectedIsActive = true;

        final var  actualCategory = Category.newCategory(expectedName, expectedDescription, expectedIsActive);

        final var actualException =  Assertions.assertThrows(DomainException.class, () -> actualCategory.validate(new ThowsValidationHandler()));
        System.out.println();
         Assertions.assertEquals(expectedErrorCount,actualException.getErrors().size());
         Assertions.assertEquals(expectedErrorMessage,actualException.getErrors().get(0).message());
    }
}
