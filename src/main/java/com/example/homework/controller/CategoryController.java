package com.example.homework.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.homework.model.Category;
import com.example.homework.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin(maxAge = 3600 , origins = "*")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
//    查找所有
    @GetMapping("/selectAll")
    public Object FindCategoryAll(){
        List<Category> categories = categoryService.FindCategoryAll();
        return  JSONObject.toJSON(categories);
    }
//    根据父类id查询
    @GetMapping("/selectParentId")
    public Object SelectParentId(@RequestParam Integer parentId){
        List<Category> categories = categoryService.FindCategoryByParentId(parentId);
        return  JSONObject.toJSON(categories);
    }
//    根据id查询
    @GetMapping("/selectCategoryById")
    public Object FindCategoryById(@RequestParam Integer id){
        List<Category> categories = categoryService.FindCategoryById(id);
        return  JSONObject.toJSON(categories);
    }
}
