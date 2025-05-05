package com.jpademo.InheritanceDemoUsingPayment.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("CC")
@Getter
@Setter
public class CreditCard extends Payment {
	private String cardnumber;
}
