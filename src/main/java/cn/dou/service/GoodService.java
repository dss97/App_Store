package cn.dou.service;

import cn.dou.po.Good;

import java.util.List;

public interface GoodService {


    public Object getGood(int id);

    public List<Object> getAll();

    public List<Object> getAllOdd();

    public List<Object> getAllEven();

    public List<Good> getByType(String goodType);

    public List<Good> getTitle();
}
