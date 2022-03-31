package com.gsxt.config;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CrowdUtil {
    /**
     * 对前端传入的密码进行加密
     * @param source
     * @return
     */
    public static String md5(String source){
        //判断source是否是有小的字段
        if (source == null || source.length() == 0){
            //如果不是有效的字符串就抛出异常
            throw new RuntimeException("字符串不合法！请不要传入空字符串");
        }
        //获取MessageDigest做加密的对象
        String algorithm = "md5";

        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            //做加密，获取明文字符串对应的字节数组
            byte[] bytes = source.getBytes();

            byte[] output = messageDigest.digest(bytes);

            //创建BigInteger
            int signum = 1;
            BigInteger bigInteger = new BigInteger(signum, output);

            //按照十六进制将bigInteger的值转换为字符串
            int radix = 16;
            String encoded = bigInteger.toString(radix).toUpperCase();
            return encoded;

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 判断当前请求是否是ajax请求
     * true：是ajax请求
     * false：是普通请求
     */
    public static boolean judgeRequestType(HttpServletRequest request){
        //获取请求消息头
        String accept = request.getHeader("Accept");
        String xRequestHeader = request.getHeader("X-Requested-with");

        //判断是否为ajax请求
        return (accept != null && accept.contains("application/json")) ||
                (xRequestHeader != null && xRequestHeader.equals("XHLHttpRequest"));

    }
}
