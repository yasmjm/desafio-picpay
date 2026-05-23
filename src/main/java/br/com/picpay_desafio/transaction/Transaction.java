package br.com.picpay_desafio.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public record Transaction (
    @Id Long id,
    Long payer,
    Long payee,
    BigDecimal value,
    LocalDateTime createdAt){
    
}

// transaction configuration 