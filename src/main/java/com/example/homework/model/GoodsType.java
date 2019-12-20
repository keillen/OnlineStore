package com.example.homework.model;

import lombok.Data;

import java.util.List;

@Data
public class GoodsType {
    public Integer id;
    public Integer cid;
    public String type;
    public List<TypeType> typeType;
}
