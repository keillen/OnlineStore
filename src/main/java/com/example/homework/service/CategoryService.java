package com.example.homework.service;

import com.example.homework.mapper.CategoryMapper;
import com.example.homework.model.Category;
import com.example.homework.model.CategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
//查询所有
    public List<Category> FindCategoryAll() {
//        CategoryExample categoryExample = new CategoryExample();
//        CategoryExample.Criteria criteria = categoryExample.createCriteria();
//        criteria.andIdEqualTo(id);
        return categoryMapper.selectByExample(new CategoryExample());
    }
//    public List<Category> FindCategoryAll(Integer id) {
//        CategoryExample categoryExample = new CategoryExample();
//        CategoryExample.Criteria criteria = categoryExample.createCriteria();
//        criteria.andIdEqualTo(id);
//        return categoryMapper.selectByExample(new CategoryExample());
//    }
 //id
    public List<Category> FindCategoryById(Integer id) {
        CategoryExample categoryExample = new CategoryExample();
        categoryExample.createCriteria()
                .andIdEqualTo(id);
        return categoryMapper.selectByExample(categoryExample);
    }
//parentId
    public List<Category> FindCategoryByParentId(Integer parentId) {
        CategoryExample categoryExample = new CategoryExample();
        categoryExample.createCriteria()
                .andParentIdEqualTo(parentId);
        return categoryMapper.selectByExample(categoryExample);
    }



}
