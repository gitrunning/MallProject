package com.ldmall.common.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/4/2 11:06
 **/
@ApiModel(
        value = "ApiResult",
        description = "统一错误码"
)
public class ApiResult<T> {
    @ApiModelProperty("http专用错误码")
    private Integer httpCode;
    @ApiModelProperty(
            value = "Hierway 业务错误码",
            example = "200: Success; 201: Failure"
    )
    private Integer code;
    @ApiModelProperty("错误码信息")
    private String msg;
    @ApiModelProperty("中文错误码信息")
    private String msgCh;
    @ApiModelProperty("错误码额外信息，当msg不能满足的情况下使用")
    private String addiInfo;
    @ApiModelProperty("基本信息，比如模块名，IP等")
    private ApiInfo basicInfo;
    @ApiModelProperty("返回值的内容")
    private T data;

    public ApiResult() {
    }

    public ApiResult(Integer httpCode, Integer code, String msg, String msgCh, String addiInfo, ApiInfo basicInfo, T data) {
        this.httpCode = httpCode;
        this.code = code;
        this.msg = msg;
        this.msgCh = msgCh;
        this.addiInfo = addiInfo;
        this.basicInfo = basicInfo;
        this.data = data;
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsgCh() {
        return msgCh;
    }

    public void setMsgCh(String msgCh) {
        this.msgCh = msgCh;
    }

    public String getAddiInfo() {
        return addiInfo;
    }

    public void setAddiInfo(String addiInfo) {
        this.addiInfo = addiInfo;
    }

    public ApiInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(ApiInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResult{" +
                "httpCode=" + httpCode +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", msgCh='" + msgCh + '\'' +
                ", addiInfo='" + addiInfo + '\'' +
                ", basicInfo=" + basicInfo +
                ", data=" + data +
                '}';
    }
}