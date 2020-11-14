package cn.dou.dao;

import cn.dou.po.Good;

import java.util.List;

public interface GoodMapper {

    public Object getGood(int id);

    public List<Object> getAll();

    public List<Object> getAllOdd();

    public List<Object> getAllEven();

    public List<Good> getByType(String goodType);

    public List<Good> getTitle();
}
