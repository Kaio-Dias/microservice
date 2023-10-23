package br.com.ey.microservice.interfaces;

import br.com.ey.microservice.model.PaymentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaymentRepository extends JpaRepository<PaymentModel, Long>{
    
}
