package com.example.homework.mapper;

import com.example.homework.model.Shop;
import com.example.homework.model.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jq_shop
     *
     * @mbg.generated Thu Dec 19 13:40:41 CST 2019
     */
    long countByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jq_shop
     *
     * @mbg.generated Thu Dec 19 13:40:41 CST 2019
     */
    int deleteByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jq_shop
     *
     * @mbg.generated Thu Dec 19 13:40:41 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jq_shop
     *
     * @mbg.generated Thu Dec 19 13:40:41 CST 2019
     */
    int insert(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jq_shop
     *
     * @mbg.generated Thu Dec 19 13:40:41 CST 2019
     */
    int insertSelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jq_shop
     *
     * @mbg.generated Thu Dec 19 13:40:41 CST 2019
     */
    List<Shop> selectByExampleWithRowbounds(ShopExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jq_shop
     *
     * @mbg.generated Thu Dec 19 13:40:41 CST 2019
     */
    List<Shop> selectByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jq_shop
     *
     * @mbg.generated Thu Dec 19 13:40:41 CST 2019
     */
    Shop selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jq_shop
     *
     * @mbg.generated Thu Dec 19 13:40:41 CST 2019
     */
    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jq_shop
     *
     * @mbg.generated Thu Dec 19 13:40:41 CST 2019
     */
    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jq_shop
     *
     * @mbg.generated Thu Dec 19 13:40:41 CST 2019
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jq_shop
     *
     * @mbg.generated Thu Dec 19 13:40:41 CST 2019
     */
    int updateByPrimaryKey(Shop record);
}