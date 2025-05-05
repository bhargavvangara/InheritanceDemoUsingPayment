package com.jpademo.InheritanceDemoUsingPayment.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("CH")
@Getter
@Setter
public class CheckNumber extends Payment {
	private String checknumber;
}
