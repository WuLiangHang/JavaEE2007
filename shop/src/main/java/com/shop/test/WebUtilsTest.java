package com.shop.test;

import com.shop.bean.User;
import com.shop.utils.WebUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WebUtilsTest {

    @Test
    public void test() {
        Map<String, Object> object = new HashMap<>();
        object.put("id", "1");
        object.put("username", "admin");
        object.put("password", "123");
        object.put("email", "123@qq.com");
        User user = new User();
        System.out.println(WebUtils.copyParamToBean(object, user));
    }
}
