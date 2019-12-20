package com.example.homework.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.homework.model.ClassificationGoods;
import com.example.homework.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

@CrossOrigin(maxAge = 3600 , origins = "*")
@RequestMapping("/information")
public class InformationController {
    @Autowired
    private InformationService informationService;
    //    查找所有
    @GetMapping("/selectAll")
    public Object FindCategoryAll(){
        List<ClassificationGoods> classificationGoods = informationService.FindAll();
        return  JSONObject.toJSON(classificationGoods);
    }
}
