package com.ldmall.common.result;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/4/2 11:09
 **/
public enum ResultCode {
    UNKONW_ERROR(-1, "Unknown error", "未知错误"),
    SUCCESS(200, "Success", "成功"),
    FAILURE(201, "Failure", "失败"),
    NO_DATA_FOUND(202, "Data not found", "未找到数据"),
    COMMON_BASE_CODE(1000, "Common Base Error Code", "通用基本错误码"),
    COMMON_FAILSURE(1001, "Failsure", "失败"),
    COMMON_NO_DATA_FOUND(1002, "Data not found", "未找到数据"),
    ADD_FAILED(1003, "Add failed", "添加失败"),
    UPDATE_FAILED(1004, "Updated failed", "更新失败"),
    DELETE_FAILED(1005, "Delete failed", "删除失败"),
    DATA_ALREADY_EXIST(1006, "Data already existed", "数据已经存在"),
    NOT_SUITABLE_OPERATION(1007, "Not suitable operation", "不适合的操作"),
    DATABASE_OP_FAILED(1008, "Operate database failed", "操作数据库失败"),
    NO_PERMISSION(1009, "Permission is needed", "权限不够，需要开通权限"),
    SERVER_ERROR(1010, "Server error", "服务器错误"),
    AUTH_ERROR(1011, "Authentication failed ", "鉴权失败"),
    PARAMS_ERROR(1012, "Parameter error", "参数错误"),
    JSON_PARSE_ERROR(1013, "Json parse error", "JSON解析错误"),
    ILLEAGAL_STRING(1014, "Illegal string", "非法字符串"),
    CERTIFICATE_EXPIRED(1015, "Client certificate has expired or is not yet valid", "客户端证书过期或已无效"),
    CERTIFICATE_INVALID(1016, "Client certificate is untrusted or invalid.", "客户端证书不可信或无效"),
    SYSTEM_BASE_CODE(2000, "System Base Error Code", "系统基本错误码"),
    DO_NOT_OPERATE(10000, "Do not operate", "不操作"),
    THERE_ARE_STILL_PROCESSES_WITHOUT_MOUNT_PRODUCTIVITY_UNITS(10001, "There are still processes without mount productivity units", "未定义"),
    THE_PRODUCTIVITY_UNIT_HAS_BEEN_USED(10002, "The productivity unit has been used", "未定义"),
    NO_NEED_CONFIGURE(10003, "The process does not require configuration of a productivity unit", "未定义");

    private Integer code;
    private String msg;
    private String msgCh;

    private ResultCode(Integer code, String msg, String msgCh) {
        this.code = code;
        this.msg = msg;
        this.msgCh = msgCh;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getMsgCh() {
        return this.msgCh;
    }
}
