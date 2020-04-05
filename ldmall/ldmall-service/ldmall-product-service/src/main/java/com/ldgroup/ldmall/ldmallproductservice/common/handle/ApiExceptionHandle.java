package com.ldgroup.ldmall.ldmallproductservice.common.handle;


import com.ldmall.common.result.ApiResult;
import com.ldmall.common.result.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 捕获异常的类，返回信息给浏览器，可以自定义返回的code,msg等信息
 */
@ControllerAdvice
public class ApiExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ApiExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiResult handle(Exception e) {
        logger.error("全局异常：{}", e);
        return ResultUtil.handleApiException(e);
    }
}