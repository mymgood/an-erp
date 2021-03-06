package com.springmvc.dao;

import com.springmvc.dto.Product;
import com.springmvc.dto.ProductStockRecord;
import com.springmvc.pojo.ProductQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDAO {
    /**
     *  根据指定的条件获取数据库记录数
     *
     * @param example
     */
    long countByExample(ProductQuery example);

    /**
     *  根据指定的条件删除数据库符合条件的记录
     *
     * @param example
     */
    int deleteByExample(ProductQuery example);

    /**
     *  根据主键删除数据库的记录
     *
     * @param productId
     */
    int deleteByPrimaryKey(Integer productId);

    /**
     *  新写入数据库记录
     *
     * @param record
     */
    int insert(Product record);

    /**
     *  动态字段,写入数据库记录
     *
     * @param record
     */
    int insertSelective(Product record);

    /**
     *  根据指定的条件查询符合条件的数据库记录
     *
     * @param example
     */
    List<Product> selectByExample(ProductQuery example);

    /**
     *  根据指定主键获取一条数据库记录
     *
     * @param productId
     */
    Product selectByPrimaryKey(Integer productId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductQuery example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductQuery example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     *  根据主键来更新符合条件的数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Product record);

    /**
     * 获取一个带有类别名称的数据库记录
     *
     * @param example
     */
    List<Product> selectWithCategoryNameByExample(ProductQuery example);

    /**
     *  根据指定的条件查询符合条件的数据库记录（产品库存）
     *
     * @param query 查询条件
     * @return 一页记录
     */
    List<ProductStockRecord> selectProductStockByExample(ProductQuery query);

    /**
     *  根据指定的条件统计符合条件的数据库记录（产品库存）
     *
     * @param query 查询条件
     * @return 一页记录
     */
    ProductStockRecord statisticsProductStockByExample(ProductQuery query);
}