package org.fullcycle.admin.catologo.domain.pagination;

import java.util.List;

public record Pagination<T>(int currentPare, int perPage, long total, List<T> items) {
}
