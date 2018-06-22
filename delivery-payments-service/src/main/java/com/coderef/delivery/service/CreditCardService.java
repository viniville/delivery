package com.coderef.delivery.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.coderef.delivery.model.CreditCard;
import com.coderef.delivery.repository.CreditCardRepository;

@Service
public class CreditCardService {

	@Autowired
	private CreditCardRepository creditCardRepository;
	
	public CreditCard save(@Validated CreditCard creditCard) {
		return creditCardRepository.save(creditCard);		
	}
	
	public CreditCard findById(Integer id){
		return creditCardRepository.findOne(id);
	}
	
	public Iterable<CreditCard> findAll(){
		return creditCardRepository.findAll();
	}
	
	public CreditCard findByNumberIgnoreCaseAndExpiration(String number, Date expiration) {
		return creditCardRepository.findByNumberIgnoreCaseAndExpiration(number, expiration);
	}

}
