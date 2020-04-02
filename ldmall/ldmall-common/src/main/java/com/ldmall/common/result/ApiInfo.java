package com.ldmall.common.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/4/2 11:08
 **/
@ApiModel(
        value = "ApiInfo",
        description = "API基本信息"
)
public class ApiInfo {
    @ApiModelProperty("服务模块名")
    private String module_name = "unknown name";
    @ApiModelProperty("服务模块IP地址")
    private String ip_address = "0.0.0.0";
    @ApiModelProperty("服务模块端口号")
    private short udp_port = 0;
    @ApiModelProperty("其它信息")
    private String addiInfo = "no additional information";

    ApiInfo() {
    }

    public ApiInfo(String module_name, String ip_address, short udp_port, String addiInfo) {
        this.module_name = module_name;
        this.ip_address = ip_address;
        this.udp_port = udp_port;
        this.addiInfo = addiInfo;
    }

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public short getUdp_port() {
        return udp_port;
    }

    public void setUdp_port(short udp_port) {
        this.udp_port = udp_port;
    }

    public String getAddiInfo() {
        return addiInfo;
    }

    public void setAddiInfo(String addiInfo) {
        this.addiInfo = addiInfo;
    }

    @Override
    public String toString() {
        return "ApiInfo{" +
                "module_name='" + module_name + '\'' +
                ", ip_address='" + ip_address + '\'' +
                ", udp_port=" + udp_port +
                ", addiInfo='" + addiInfo + '\'' +
                '}';
    }
}