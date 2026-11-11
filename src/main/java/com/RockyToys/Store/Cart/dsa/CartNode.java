package com.RockyToys.Store.Cart.dsa;

import com.RockyToys.Store.CartItem.model.CartItem;

public class CartNode {
    CartItem data;
    CartNode next;
    public CartNode(CartItem data) { this.data = data; }
    public CartItem getData() { return data; }
    public CartNode getNext() { return next; }
}
