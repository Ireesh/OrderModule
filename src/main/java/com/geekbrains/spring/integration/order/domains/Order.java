package com.geekbrains.spring.integration.order.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private long orderId;
    private String userEmail;
    private List<OrderDetails> details;
}
