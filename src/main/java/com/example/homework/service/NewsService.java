package com.example.homework.service;

import com.example.homework.mapper.NewsMapper;
import com.example.homework.model.News;
import com.example.homework.model.NewsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsMapper newsMapper;
    public List<News> FindNewsAll() {

        return newsMapper.selectByExample(new NewsExample());
    }

    public List<News> FindNewsById(Integer id) {
        NewsExample newsExample = new NewsExample();
        newsExample.createCriteria().andIdEqualTo(id);
        return newsMapper.selectByExample(newsExample);
    }
}
