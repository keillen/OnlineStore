package com.example.homework.service;

import com.example.homework.mapper.ClassificationGoodsMapper;
import com.example.homework.mapper.GoodsTypeMapper;
import com.example.homework.mapper.TypeTypeMapper;
import com.example.homework.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationService {
    @Autowired
     private ClassificationGoodsMapper classificationGoodsMapper;
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;
    @Autowired
    private TypeTypeMapper typeTypeMapper;

    public List<ClassificationGoods> FindAll(){
        List<ClassificationGoods> classList =classificationGoodsMapper.selectByExample(new ClassificationGoodsExample());
        for (int i = 0; i <classList.size();i++){
            List<GoodsType> goodsList = getGoodsTypeOne(classList.get(i).id);

            for (int j =0; j <goodsList.size();j++){
                List<TypeType> TypeList =getTypeTypeOne(goodsList.get(j).id);
                goodsList.get(j).typeType = TypeList;
            }

            classList.get(i).goodsType = goodsList;
        }
        return classList;

//        List<ClassificationGoods> classList = classificationGoodsMapper.selectAll();
//                //查询classification表中的数据
//        System.out.println(classList);
//        for (int i = 0;i < classList.size();i++){
//            List<GoodsType> goodsList = getGoodsTypeOne(classList.get(i).id);    //通过id查询goodsType表的数据
//                                            //mysql:select * from goodsType where cid = id
//            for (int j = 0;j < goodsList.size();j++){
//                List<TypeType> getTypeTypeOne(goodsList.get(j).id); //通过id查询TypeType表的数据
//                                            //mysql:select * from TypeType where gid = id
//            }
//
//            classList.get(i).goodsList = goodsList;
//


//        }
    }
    public List<GoodsType>  getGoodsTypeOne (Integer id){
        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
        goodsTypeExample.createCriteria().andCidEqualTo(id);
        List<GoodsType> goodsType = goodsTypeMapper.selectByExample(goodsTypeExample);
        return goodsType;
    }
    public List<TypeType> getTypeTypeOne(Integer id){
        TypeTypeExample typeTypeExample =new TypeTypeExample();
        typeTypeExample.createCriteria().andGidEqualTo(id);
        List<TypeType> TypeList =typeTypeMapper.selectByExample(typeTypeExample);
        return TypeList;
    }


}
