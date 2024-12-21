package com.ecommerce.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class PaymentDto {

    private Long orderid;
    private BigDecimal amount;
}
