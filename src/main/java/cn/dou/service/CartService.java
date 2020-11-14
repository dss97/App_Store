package cn.dou.service;

import cn.dou.po.Cart;

import java.util.List;

public interface CartService {

    public List<Cart> getAll();

    public void insert(Cart cart);
}
