package com.odwallet.common.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cc on 16/10/11.
 */
public class FailResponse extends ResponseValue implements Serializable{

    private static final long serialVersionUID = 312341023973568076L;

    public FailResponse(int code, String message, Object object) {
        setSuccess(false);

        Map map = new HashMap<>();
        map.put("code",code);
        map.put("error",message);
        map.put("errorData", object);

        setData(map);
    }

    public FailResponse(int code, String message) {
        setSuccess(false);
        setErrorCode(400);
        Map map = new HashMap<>();
        map.put("code",code);
        map.put("error",message);

        setData(map);
    }

    /**
     * 微服务使用
     * @param errorCode
     * @param code
     * @param message
     */
    public FailResponse(int errorCode,int code, String message) {

        setSuccess(false);

        Map map = new HashMap<>();
        map.put("code",code);
        map.put("error",message);

        setData(map);
        setErrorCode(errorCode);

    }
}