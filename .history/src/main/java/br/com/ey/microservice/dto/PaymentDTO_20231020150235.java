package br.com.ey.microservice.dto;

import java.math.BigDecimal;

import br.com.ey.microservice.model.StatusModel;
import lombok.Data;

@Data
public class PaymentDTO {
    
    private Long id;
    private BigDecimal value;
    private String name;
    private String number;
    private String expiresAt;
    private String code;
    private StatusModel status;
    private Long IdRequest;
    private Long PaymentIdModel;
}
