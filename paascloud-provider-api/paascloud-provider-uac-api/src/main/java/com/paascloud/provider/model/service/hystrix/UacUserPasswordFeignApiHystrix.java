/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：UacUserPasswordController.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.model.service.hystrix;


import com.paascloud.provider.model.dto.user.AuthUserDTO;
import com.paascloud.provider.model.dto.user.HandlerLoginDTO;
import com.paascloud.provider.model.service.UacAuthUserFeignApi;
import com.paascloud.wrapper.Wrapper;
import org.springframework.stereotype.Component;


/**
 * 用户密码.
 *
 * @author paascloud.net@gmail.com
 */
@Component
public class UacUserPasswordFeignApiHystrix implements UacAuthUserFeignApi {

    @Override
    public Wrapper<AuthUserDTO> getAuthUserDTO(String loginName) {
        return null;
    }

    @Override
    public void handlerLoginData(HandlerLoginDTO handlerLoginDTO) {

    }
}
