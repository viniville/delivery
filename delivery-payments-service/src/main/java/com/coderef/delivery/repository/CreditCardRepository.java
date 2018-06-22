package com.coderef.delivery.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderef.delivery.model.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {
	
	CreditCard findByNumberIgnoreCaseAndExpiration(String number, Date expiration);

}
