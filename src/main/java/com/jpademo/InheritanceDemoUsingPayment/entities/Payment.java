package com.jpademo.InheritanceDemoUsingPayment.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@DiscriminatorColumn(name = "pmode", discriminatorType = DiscriminatorType.STRING)
public class Payment {
	@Id
	private int id;
	private float amount;
	@Column(insertable = false, updatable = false)
    private String pmode; // Now it's read-only. Either we should remove this or make it read-only when using @Discriminator.


}
