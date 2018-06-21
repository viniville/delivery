package com.coderef.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderef.delivery.model.CreditCard;
import com.coderef.delivery.service.CreditCardService;

@RestController
@RequestMapping(value = "/creditcards", produces = MediaType.APPLICATION_JSON_VALUE)
public class CreditCardController {

	@Autowired
	private CreditCardService creditCardService;
	
	@PostMapping
	public ResponseEntity<CreditCard> add(@RequestBody CreditCard creditCard){
		creditCard.setId(null);
		return ResponseEntity.ok(creditCardService.save(creditCard));
	}
	
    @GetMapping(value = "/{id}")
    public ResponseEntity<CreditCard> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(creditCardService.findById(id));
    }

    @GetMapping
    public ResponseEntity<Iterable<CreditCard>> findAll(){
        return ResponseEntity.ok().body(creditCardService.findAll());
    }
    

}
