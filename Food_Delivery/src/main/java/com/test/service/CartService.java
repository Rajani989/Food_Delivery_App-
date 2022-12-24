package com.test.service;

import java.util.List;

import com.test.model.Cart;

public interface CartService {
	
    public Cart saveCart(Cart cart);
    
    public Cart findByCartId(int bookId);
    
    public List<Cart> getAllItems();

	public String deleteItem(int id);
	
	public Cart updateItem(Cart cart, int id);

}
