package com.example.homework.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.homework.model.Slide;
import com.example.homework.service.SlideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/slide")
@CrossOrigin(maxAge = 3600 , origins = "*")
public class SlideController {
    @Autowired
    private SlideService slideService;
    //查询全部信息
    @GetMapping("/selectAll")
    public Object FindNewsAll(){
        List<Slide> slides = slideService.FindSlideAll();
        return  JSONObject.toJSON(slides);
    }

}

