package com.test.model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int itemId;
    
	private String itemName;
	
	private int price;
	
	private int qty;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="customerId")
	@JsonIgnoreProperties("item")
	Customer cust;
}
