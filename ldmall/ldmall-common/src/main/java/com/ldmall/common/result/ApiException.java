package com.ldmall.common.result;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/4/2 11:07
 **/
public class ApiException extends RuntimeException {
    private ApiResult apiResult;

    public ApiResult getApiResult() {
        return this.apiResult;
    }

    public void setApiResult(ApiResult apiResult) {
        this.apiResult = apiResult;
    }

    public ApiException(ResultCode resultCode) {
        this.apiResult = ResultUtil.error(resultCode);
    }

    public ApiException(ResultCode resultCode, String addiInfo) {
        this.apiResult = ResultUtil.error(resultCode, addiInfo);
    }

    public String toString() {
        return "ApiException{apiResult=" + this.apiResult + '}';
    }
}
