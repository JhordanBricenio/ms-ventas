package com.codej.model.dto;

import java.util.List;
import java.util.UUID;

public record OrderResponse(UUID id, String orderNumber, List<OrderItemsResponse> orderItems) {
}