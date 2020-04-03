package com.ldgroup.ldmall.ldmallproductservice.test.mybatis;

import com.ldgroup.ldmall.ldmallproductservice.dao.entity.SBox;
import com.ldgroup.ldmall.ldmallproductservice.dao.mapper.SboxDao;
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
    private SboxDao sboxDao;

    @Test
    public void selectSboxesByStatus(){
        Example example = new Example(SBox.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andNotEqualTo("useState",0);
        List<SBox> sBoxes = sboxDao.selectByExample(example);
        sBoxes.forEach(sBox -> System.out.println(sBox));

    }
}
