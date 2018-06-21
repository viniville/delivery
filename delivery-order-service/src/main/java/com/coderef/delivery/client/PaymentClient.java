package com.coderef.delivery.client;

//@FeignClient(name = "delivery-payments-service")
public interface PaymentClient {

//	@GetMapping("/api/payments-status/{orderCode}")
	String checkStatus(/*@Param("orderCode") */String orderCode);
}
