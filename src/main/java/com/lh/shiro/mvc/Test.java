package com.lh.shiro.mvc;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.codec.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by linghu on 17/04/17.
 */
public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        String str = "测试";
        logger.info("str.getBytes()->{}", str);
        logger.info("编码->{}", Base64.encodeToString(str.getBytes()));
        logger.info("解码{}", Base64.decodeToString(Base64.encodeToString(str.getBytes())));

        String base64Encoded =Hex.encodeToString(str.getBytes());
        logger.info("编码->{}", base64Encoded);
        logger.info("解码{}",new String(Hex.decode(base64Encoded.getBytes())));
    }
}
