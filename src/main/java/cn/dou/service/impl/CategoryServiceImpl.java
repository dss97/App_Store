package cn.dou.service.impl;

import cn.dou.dao.CategoryMapper;
import cn.dou.po.Category;
import cn.dou.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getAll() {
        return categoryMapper.getAll();
    }
}
