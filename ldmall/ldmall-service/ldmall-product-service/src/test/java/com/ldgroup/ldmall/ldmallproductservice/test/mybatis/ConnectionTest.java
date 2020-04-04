package com.ldgroup.ldmall.ldmallproductservice.test.mybatis;


import com.ldgroup.ldmall.ldmallproductservice.dao.entity.Product;
import com.ldgroup.ldmall.ldmallproductservice.dao.mapper.IProductDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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

    @Test
    public void selectSboxesByStatus(){
        List<Product> products = productDao.selectAll();
        products.forEach(product -> System.out.println(product));

    }
}
