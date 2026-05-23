package br.com.picpay_desafio.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("TRANSACTIONS")
public record Transaction (
    @Id Long id,
    Long payer,
    Long payee,
    BigDecimal value,
    @CreatedDate LocalDateTime createdAt){

        public Transaction {
            value = value.setScale(2, java.math.RoundingMode.HALF_UP);
            //(2:newScsale);
        }
    
}

// transaction configuration 