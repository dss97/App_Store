package cn.dou.service.impl;

import cn.dou.dao.GoodMapper;
import cn.dou.po.Good;
import cn.dou.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {

    @Autowired
    private GoodMapper goodMapper;

    @Override
    public Object getGood(int id) {
        return goodMapper.getGood(id);
    }

    @Override
    public List<Object> getAll() {
        return goodMapper.getAll();
    }

    @Override
    public List<Object> getAllOdd() {
        return goodMapper.getAllOdd();
    }

    @Override
    public List<Object> getAllEven() {
        return goodMapper.getAllEven();
    }

    @Override
    public List<Good> getByType(String goodType) {
        return goodMapper.getByType(goodType);
    }

    @Override
    public List<Good> getTitle() {
        return goodMapper.getTitle();
    }
}
