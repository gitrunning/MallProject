package com.ldmall.service;

import com.ldmall.common.result.ApiResult;
import com.ldmall.entity.ProductEntity;

import java.util.List;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/4/5 18:05
 **/
public interface IProductService {
     ApiResult<List<ProductEntity>> getAllProduct();
}
