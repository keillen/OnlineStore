package com.example.homework.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.homework.model.News;
import com.example.homework.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
@CrossOrigin(maxAge = 3600 , origins = "*")
public class NewsController {
    @Autowired
    private NewsService newsService;

    //查询全部信息
    @GetMapping("/selectAll")
    public Object FindNewsAll(){
        List<News> news = newsService.FindNewsAll();
        return  JSONObject.toJSON(news);
    }
    //根据id查询
    @GetMapping("/selectNewsById")
    public Object FindNewsById(@RequestParam Integer id){
        List<News> news = newsService.FindNewsById(id);
        return JSONObject.toJSON(news);
    }
}
