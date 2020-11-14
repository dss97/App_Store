package cn.dou.service;

import cn.dou.po.Cart;
import cn.dou.po.Order;

import java.util.List;

public interface OrderService {

    public List<Cart> getAll();

    public void insert(Order order);

    public void deleteAll();
}
