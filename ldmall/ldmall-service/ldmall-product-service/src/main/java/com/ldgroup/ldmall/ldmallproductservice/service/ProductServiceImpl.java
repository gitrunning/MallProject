package com.ldgroup.ldmall.ldmallproductservice.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.ldgroup.ldmall.ldmallproductservice.dao.entity.Product;
import com.ldgroup.ldmall.ldmallproductservice.dao.mapper.IProductDao;
import com.ldmall.common.result.ApiException;
import com.ldmall.common.result.ApiResult;
import com.ldmall.common.result.ResultCode;
import com.ldmall.common.result.ResultUtil;
import com.ldmall.entity.ProductEntity;
import com.ldmall.service.IProductService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/4/2 15:04
 **/
@Component
@Transactional
//@Service(version = "1.0.0",interfaceClass = IProductService.class)
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;

    @Override
    public ApiResult<List<ProductEntity>> getAllProduct() {
        List<ProductEntity> retList = new ArrayList<>();
        List<Product> products = productDao.selectAll();
        products.forEach(product -> retList.add(product.convert()));
        if (CollectionUtils.isEmpty(retList)){
            throw new ApiException(ResultCode.NO_DATA_FOUND);
        }
        return ResultUtil.success(retList);
    }
}
