package com.jpademo.InheritanceDemoUsingPayment.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpademo.InheritanceDemoUsingPayment.entities.CreditCard;

public interface CreditCardRepo extends CrudRepository<CreditCard, Integer> {

	List<CreditCard> findByCardnumber(String cardnumber);

}
