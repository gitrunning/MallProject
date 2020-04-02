package com.ldmall.common.result;

import com.google.gson.Gson;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/4/2 11:05
 **/
public class ResultUtil {
    private static ApiInfo basicInfo = new ApiInfo();

    public ResultUtil() {
    }

    public static ApiInfo getBasicInfo() {
        return basicInfo;
    }

    public static ApiResult setResult(Integer httpCode, ResultCode resultCode, Object object, String addiInfo) {
        ApiResult<Object> result = new ApiResult();
        result.setHttpCode(httpCode);
        result.setCode(resultCode.getCode());
        result.setMsg(resultCode.getMsg());
        result.setMsgCh(resultCode.getMsgCh());
        result.setData(object);
        result.setAddiInfo(addiInfo);
        result.setBasicInfo(basicInfo);
        return result;
    }

    public static ApiResult success(Object object, String addiInfo) {
        return setResult(HttpStatus.OK.value(), ResultCode.SUCCESS, object, addiInfo);
    }

    public static ApiResult success(ResultCode resultCode) {
        return setResult(HttpStatus.OK.value(), resultCode, (Object)null, (String)null);
    }

    public static ApiResult success(Object object) {
        return setResult(HttpStatus.OK.value(), ResultCode.SUCCESS, object, (String)null);
    }

    public static ApiResult success(Integer httpCode, Object object, String addiInfo) {
        return setResult(httpCode, ResultCode.SUCCESS, object, addiInfo);
    }

    public static ApiResult success() {
        return success((Object)null, (String)null);
    }

    public static ApiResult error(ResultCode resultCode) {
        return setResult(HttpStatus.BAD_REQUEST.value(), resultCode, (Object)null, (String)null);
    }

    public static ApiResult error(ResultCode resultCode, String addiInfo) {
        return setResult(HttpStatus.BAD_REQUEST.value(), resultCode, (Object)null, addiInfo);
    }

    public static ApiResult error(Integer httpCode, ResultCode resultCode, String addiInfo) {
        return setResult(httpCode, resultCode, (Object)null, addiInfo);
    }

    public static ApiResult error(ResultCode resultCode, String msgEn, String msgCh) {
        ApiResult result = new ApiResult();
        result.setHttpCode(HttpStatus.BAD_REQUEST.value());
        result.setCode(resultCode.getCode());
        result.setMsg(msgEn);
        result.setMsgCh(msgCh);
        return result;
    }

    public static ApiResult handleApiException(Exception e) {
        if (e instanceof ApiException) {
            ApiException apiException = (ApiException)e;
            return apiException.getApiResult();
        } else {
            return error(ResultCode.UNKONW_ERROR, e.toString());
        }
    }

    public static ApiResult<Object> getApiResult(String JsonStr) {
        ApiResult<Object> result = new ApiResult();
        JSONObject jsonObject = new JSONObject(JsonStr);
        ApiInfo apiInfo = new ApiInfo();
        Object object = jsonObject.get("basicInfo");
        if (null != object) {
            Gson gson = new Gson();
            apiInfo = (ApiInfo)gson.fromJson(object.toString(), ApiInfo.class);
        }

        result.setBasicInfo(apiInfo);
        result.setCode(jsonObject.getInt("code"));
        result.setMsg(jsonObject.getString("msg"));
        result.setMsgCh(jsonObject.getString("msgCh"));
        Object addInfo = jsonObject.get("addiInfo");
        if (addInfo != null) {
            result.setAddiInfo(addInfo.toString());
        }

        object = jsonObject.get("data");
        if (null != object) {
            result.setData(object);
        }

        return result;
    }

    public static String getCodeInfo() {
        boolean ifStart = true;
        String jsonStr = "{[";
        ResultCode[] var2 = ResultCode.values();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            ResultCode resultCode = var2[var4];
            if (ifStart) {
                jsonStr = jsonStr + "{";
                ifStart = false;
            } else {
                jsonStr = jsonStr + ",{";
            }

            jsonStr = jsonStr + "\"code\":" + resultCode.getCode() + ",";
            jsonStr = jsonStr + "\"msg\":\"" + resultCode.getMsg() + "\",";
            jsonStr = jsonStr + "\"msgCh\":\"" + resultCode.getMsgCh() + "\"}";
        }

        jsonStr = "]}";
        return jsonStr;
    }
}