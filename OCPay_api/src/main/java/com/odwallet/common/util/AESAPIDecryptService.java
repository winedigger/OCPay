package com.odwallet.common.util;import com.odwallet.common.exception.InvalidArgumentException;import com.odwallet.common.web3j.utils.HttpRequestUtil;import org.springframework.stereotype.Service;import javax.servlet.http.HttpServletRequest;import java.security.DigestException;/** * Created by luyangjian on 2017/9/26. */@Servicepublic class AESAPIDecryptService {    public String getAESDecodeStr(AesReq aesReq, HttpServletRequest request) throws DigestException, InvalidArgumentException {        String version = HttpRequestUtil.getVersion(request).toString();        String platform = HttpRequestUtil.getPlatform(request);        String versionAfterThree = version.substring(version.length() - 3, version.length());        APIEncryptHelper apiEncryptHelper = new APIEncryptHelper(version, platform);        String[] aesStr = apiEncryptHelper.decode(aesReq.getValue()).split("&");//AES解密        String aesReqStr = aesStr[0];       String sign = aesStr[1];       if (!sign.equalsIgnoreCase(Sha1.SHA1(aesReqStr, versionAfterThree, platform)))//判断签名合法            throw new InvalidArgumentException("sign error");        return aesReqStr;    }}