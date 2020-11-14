package cn.dou.service.impl;

import cn.dou.dao.OrderMapper;
import cn.dou.po.Cart;
import cn.dou.po.Order;
import cn.dou.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Cart> getAll() {
        return orderMapper.getAll();
    }

    @Override
    public void insert(Order order) {
        orderMapper.insert(order);
    }

    @Override
    public void deleteAll() {
        orderMapper.deleteAll();
    }
}
