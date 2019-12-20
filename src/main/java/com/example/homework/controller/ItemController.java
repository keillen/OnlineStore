package com.example.homework.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.homework.model.ClassificationGoods;
import com.example.homework.model.Item;
import com.example.homework.service.ItemService;
import com.example.homework.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin(maxAge = 3600 , origins = "*")
public class ItemController {
    @Autowired
    private ItemService itemService;
//查询全部信息
    @GetMapping("/selectAll")
    public Object FindItemAll(){
        List<Item> items = itemService.FindItemAll();
        return  JSONObject.toJSON(items);
    }
//根据id查询
    @GetMapping("/selectItemById")
    public Object FindItemById(@RequestParam Integer id){
        List<Item> items = itemService.FindItemById(id);
        return  JSONObject.toJSON(items);
    }
    @Autowired
    private InformationService informationService;
    //    查找所有
    @GetMapping("/select")
    public Object FindCategoryAll(){
        List<ClassificationGoods> classificationGoods = informationService.FindAll();
        System.out.println("000"+classificationGoods);
        return  JSONObject.toJSON(classificationGoods);
    }
}
