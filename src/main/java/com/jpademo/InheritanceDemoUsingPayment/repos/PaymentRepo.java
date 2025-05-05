package com.jpademo.InheritanceDemoUsingPayment.repos;

import org.springframework.data.repository.CrudRepository;

import com.jpademo.InheritanceDemoUsingPayment.entities.Payment;

public interface PaymentRepo extends CrudRepository<Payment, Integer> {
	

}
