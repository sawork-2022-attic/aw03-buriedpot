package com.example.webpos.biz;

import com.example.webpos.model.Cart;
import com.example.webpos.model.Product;

import java.util.List;

public interface PosService {
    public Cart getCart();

    public Cart newCart();

    public void checkout(Cart cart);

    public void total(Cart cart);

    public boolean add(Product product, int amount);

    public boolean add(String productId, int amount);

    public boolean delete(String productId); // delete an item in the cart by productId

    public boolean modify(String productId, int amount); // modify amount of some item in the cart

    public boolean empty();// empty the cart


    public List<Product> products();
}
