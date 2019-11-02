package com.wzc.whattoeat.adapter;

import com.wzc.whattoeat.inceptor.UserLoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 88449524
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@SpringBootApplication
@EnableCaching
public class UserLoginAdapter implements WebMvcConfigurer {

    @Autowired
    private UserLoginInterceptor userLoginInterceptor;

    /*@Override
    public void addInterceptors(InterceptorRegistry registry) {

        //添加对用户是否登录的拦截器，并添加过滤项、排除项
        registry.addInterceptor(userLoginInterceptor).addPathPatterns("/**")
                //排除样式、脚本、图片等资源文件
                .excludePathPatterns("/css/**","/js/**","/img/**")
                //排除登录页面
                .excludePathPatterns("/login.html")
                //排除验证码
                //.excludePathPatterns("/wechatplatformuser/defaultKaptcha")
                //排除用户点击登录按钮
                .excludePathPatterns("/user/login");
    }*/

}
