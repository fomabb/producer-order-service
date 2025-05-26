package com.example.order_service.dto;

public record Order(
        String orderId,
        String product,
        Integer quantity
) {
}
