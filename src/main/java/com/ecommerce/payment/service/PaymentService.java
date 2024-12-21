package com.ecommerce.payment.service;

import com.ecommerce.payment.dto.PaymentDto;
import com.ecommerce.payment.entity.Payment;
import com.ecommerce.payment.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment processPayment(PaymentDto paymentDto) {
        Payment payment = new Payment();
        payment.setOrderid(paymentDto.getOrderid());
        payment.setAmount(paymentDto.getAmount());
        payment.setStatus("Success");
        payment.setPaymentdate(Instant.now());
        return paymentRepository.save(payment);
    }
}
