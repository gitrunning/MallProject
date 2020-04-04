package com.ldgroup.ldmall.ldmallproductservice.dao.mapper;


import com.ldgroup.ldmall.ldmallproductservice.dao.MyBaseDao;
import com.ldgroup.ldmall.ldmallproductservice.dao.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/3/31 21:02
 **/
@Repository
public interface IProductDao extends MyBaseDao<Product> {
    List<Product> selectProductInfoByIds(List<Integer> productIds);
}
