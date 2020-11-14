package cn.dou.dao;

import cn.dou.po.Cart;

import java.util.List;

public interface CartMapper {
    public List<Cart> getAll();

    public void insert(Cart cart);
}
