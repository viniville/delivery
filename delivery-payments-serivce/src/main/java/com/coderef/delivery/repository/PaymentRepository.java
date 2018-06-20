package com.coderef.delivery.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.coderef.delivery.model.Payment;

public interface PaymentRepository  extends JpaRepository<Payment, Integer> {

	@Query("SELECT p FROM Payment p WHERE LOWER(p.creditCard.number) = LOWER(:number) and"
			+ " p.creditCard.expiration = :expiration and p.status like 'PENDING'")
	List<Payment> findByPendingPaymentsFromCard(@Param("number") String number, @Param("expiration") Date expiration); 
	
}
