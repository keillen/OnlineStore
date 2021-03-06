package com.example.homework.mapper;

import com.example.homework.model.ClassificationGoods;
import com.example.homework.model.ClassificationGoodsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ClassificationGoodsMapper {

//    @Select("select * from classification")
//    public List<ClassificationGoods> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification
     *
     * @mbg.generated Wed Dec 18 15:42:03 CST 2019
     */
    long countByExample(ClassificationGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification
     *
     * @mbg.generated Wed Dec 18 15:42:03 CST 2019
     */
    int deleteByExample(ClassificationGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification
     *
     * @mbg.generated Wed Dec 18 15:42:03 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification
     *
     * @mbg.generated Wed Dec 18 15:42:03 CST 2019
     */
    int insert(ClassificationGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification
     *
     * @mbg.generated Wed Dec 18 15:42:03 CST 2019
     */
    int insertSelective(ClassificationGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification
     *
     * @mbg.generated Wed Dec 18 15:42:03 CST 2019
     */
    List<ClassificationGoods> selectByExampleWithRowbounds(ClassificationGoodsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification
     *
     * @mbg.generated Wed Dec 18 15:42:03 CST 2019
     */
    List<ClassificationGoods> selectByExample(ClassificationGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification
     *
     * @mbg.generated Wed Dec 18 15:42:03 CST 2019
     */
    ClassificationGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification
     *
     * @mbg.generated Wed Dec 18 15:42:03 CST 2019
     */
    int updateByExampleSelective(@Param("record") ClassificationGoods record, @Param("example") ClassificationGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification
     *
     * @mbg.generated Wed Dec 18 15:42:03 CST 2019
     */
    int updateByExample(@Param("record") ClassificationGoods record, @Param("example") ClassificationGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification
     *
     * @mbg.generated Wed Dec 18 15:42:03 CST 2019
     */
    int updateByPrimaryKeySelective(ClassificationGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification
     *
     * @mbg.generated Wed Dec 18 15:42:03 CST 2019
     */
    int updateByPrimaryKey(ClassificationGoods record);
}