package com.codej.model.dto;

import java.util.UUID;

public record OrderItemsResponse(UUID id, String sku, Double price, Long quantity) {
}