package com.example.homework.service;

import com.example.homework.mapper.ItemMapper;
import com.example.homework.model.Item;
import com.example.homework.model.ItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemMapper itemMapper;
    public List<Item> FindItemAll() {
        return itemMapper.selectByExample(new ItemExample());
    }

    public List<Item> FindItemById(Integer id) {
        ItemExample itemExample = new ItemExample();
        itemExample.createCriteria().andIdEqualTo(id);
        return itemMapper.selectByExample(itemExample);
    }
}
