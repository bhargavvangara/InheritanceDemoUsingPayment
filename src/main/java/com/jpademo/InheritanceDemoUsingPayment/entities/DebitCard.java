package com.jpademo.InheritanceDemoUsingPayment.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("DC")
@Getter
@Setter
public class DebitCard extends Payment {
	private String cardnumber;
}
