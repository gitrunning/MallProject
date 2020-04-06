package com.ldgroup.ldmall.ldmallproductweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ldmall.common.result.ApiResult;
import com.ldmall.common.result.ResultUtil;
import com.ldmall.entity.ProductEntity;
import com.ldmall.service.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/4/6 21:32
 **/
@RestController()
@RequestMapping("/product")
public class ProductController {
    @Reference
    private IProductService productService;

    @GetMapping("/test")
    public ApiResult<String> test(){
        return ResultUtil.success("hello");
    }

    @GetMapping("/list")
    public ApiResult<List<ProductEntity>> getAll(){
        return productService.getAllProduct();
    }

}
