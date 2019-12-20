package com.example.homework.model;

import lombok.Data;

import java.util.List;

@Data
public class ClassificationGoods {
    public Integer id;
    public String category;
    public List<GoodsType> goodsType;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }
}