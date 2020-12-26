package com.geekbrains.spring.integration.order.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetails {
    private String product;
    private BigDecimal price;
    private Double amount;
    private BigDecimal sum;
}
