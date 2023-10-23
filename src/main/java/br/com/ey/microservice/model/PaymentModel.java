package br.com.ey.microservice.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payments") //At Db, this is what name that will appear in the table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Positive
    private BigDecimal value;

    @NotBlank
    @Size(max=100)
    private String name;

    @NotBlank
    @Size(max=19)
    private String number;

    @NotBlank
    @Size(max=8)
    private String expiresAt;

    @NotBlank
    @Size(min=3, max=3)
    private String code;

    @NotNull
    @Enumerated(EnumType.STRING)
    private StatusModel status;

    @NotNull
    private Long IdRequest;

    @NotNull
    private Long PaymentIdModel;
}