package com.ldgroup.ldmall.ldmallproductservice.test.mybatis;


import com.ldgroup.ldmall.ldmallproductservice.dao.entity.Product;
import com.ldgroup.ldmall.ldmallproductservice.dao.mapper.IProductDao;
import com.ldgroup.ldmall.ldmallproductservice.service.ProductServiceImpl;
import com.ldmall.common.result.ApiResult;
import com.ldmall.entity.ProductEntity;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/4/2 14:53
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class ConnectionTest {
    @Autowired
    private IProductDao productDao;
    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void selectSboxesByStatus(){
        List<Product> products = productDao.selectAll();
        products.forEach(product -> System.out.println(product));

    }

    @Test
    public void getAll(){
        ApiResult<List<ProductEntity>> result = productService.getAllProduct();
        Integer code = result.getCode();
        if (result!=null && code == HttpStatus.OK.value()){
            List<ProductEntity> data = result.getData();
            data.forEach(productEntity -> System.out.println(data));
        }else {
            System.out.println("查询失败");
        }
    }
}
