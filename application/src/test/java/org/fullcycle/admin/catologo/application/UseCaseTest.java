package org.fullcycle.admin.catologo.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UseCaseTest {
    @Test
    public void testCreateUseCase() {
        Assertions.assertNotNull(new UseCase());
    }
}
