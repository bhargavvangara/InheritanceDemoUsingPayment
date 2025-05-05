package com.jpademo.InheritanceDemoUsingPayment;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpademo.InheritanceDemoUsingPayment.entities.CheckNumber;
import com.jpademo.InheritanceDemoUsingPayment.entities.CreditCard;
import com.jpademo.InheritanceDemoUsingPayment.entities.DebitCard;
import com.jpademo.InheritanceDemoUsingPayment.entities.Payment;
import com.jpademo.InheritanceDemoUsingPayment.repos.CreditCardRepo;
import com.jpademo.InheritanceDemoUsingPayment.repos.PaymentRepo;

@SpringBootTest
class InheritanceDemoUsingPaymentApplicationTests {
	@Autowired
	private PaymentRepo paymentRepo;
	@Autowired
	private CreditCardRepo creditCardRepo;
	
	@Test
	void savePayments() {
		// Create instances of CreditCard, DebitCard, and CheckNumber
		CreditCard creditCard = new CreditCard();
		creditCard.setCardnumber("1234-5678-9012-3456");
		creditCard.setAmount(100.0f);

		DebitCard debitCard = new DebitCard();
		debitCard.setCardnumber("9876-5432-1098-7654");
		debitCard.setAmount(50.0f);

		CheckNumber checkNumber = new CheckNumber();
		checkNumber.setChecknumber("CHK123456");
		checkNumber.setAmount(200.0f);

		// Save the payments
		paymentRepo.save(creditCard);
		paymentRepo.save(debitCard);
		paymentRepo.save(checkNumber);
		
	}
	
	@Test
	void findAllPayments() {
		// Fetch all payments
		Iterable<Payment> payments = paymentRepo.findAll();
		
		// Print the payments
		for (Payment payment : payments) {
			System.out.println(payment);
		}
	}
	
	@Test
	void findPaymentByCardNumber() {
		// Fetch all payments
		List<CreditCard> payments = creditCardRepo.findByCardnumber("1234-5678-9012-3456");
		// Print the payments
		for (CreditCard payment : payments) {
			System.out.println(payment.getCardnumber());
		}
		
	}

}
