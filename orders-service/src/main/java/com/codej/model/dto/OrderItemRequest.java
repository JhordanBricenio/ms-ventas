package com.codej.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItemRequest {
    private UUID id;

    private String sku;
    private Double price;
    private Long quantity;

}
