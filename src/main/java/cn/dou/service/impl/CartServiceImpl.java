package cn.dou.service.impl;

import cn.dou.dao.CartMapper;
import cn.dou.po.Cart;
import cn.dou.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<Cart> getAll() {
        List<Cart> carts = cartMapper.getAll();
        return carts;
    }

    @Override
    public void insert(Cart cart) {
        cartMapper.insert(cart);
    }


}
