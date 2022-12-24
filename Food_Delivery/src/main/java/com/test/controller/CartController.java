package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Cart;
import com.test.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	public CartService cartService;
	
	
	// add a book
	
	@PostMapping(value = "/save")
	public Cart addController(@RequestBody Cart cart) {
		
		return cartService.saveCart(cart);
	}

    // get all book
	
	@GetMapping(value = "/viewAll")
	public List<Cart> getAllCarts() {
		return cartService.getAllItems();
	}

	//get by id
	@GetMapping(value = "/view/{id}")
	public Cart viewCart(@PathVariable Integer id) {
		return cartService.findByCartId(id);
		}
	// update a book
	
	@PutMapping(value = "/edit/{id}")
	public Cart updateController(@PathVariable int id, @RequestBody Cart cart) {
		return cartService.updateItem(cart, id);
	}

	// delete a book

	@DeleteMapping(value = "/del/{id}")
	public String deleteController(@PathVariable int id) {
		return cartService.deleteItem(id);
	}

}
