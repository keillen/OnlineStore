package com.example.homework.service;

import com.example.homework.mapper.SlideMapper;
import com.example.homework.model.Slide;
import com.example.homework.model.SlideExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SlideService {
    @Autowired
    private SlideMapper slideMapper;
    public List<Slide> FindSlideAll() {
       return slideMapper.selectByExample(new SlideExample());
    }
}
