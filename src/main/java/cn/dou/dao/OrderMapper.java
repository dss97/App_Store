package cn.dou.dao;

import cn.dou.po.Cart;
import cn.dou.po.Order;

import java.util.List;

public interface OrderMapper {
    public List<Cart> getAll();

    public void insert(Order order);

    public void deleteAll();
}
