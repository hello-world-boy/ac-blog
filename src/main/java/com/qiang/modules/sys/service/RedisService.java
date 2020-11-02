package com.qiang.modules.sys.service;

import com.qiang.modules.sys.entity.VO.BlogMessageVOEntity;

/**
 * @Author: qiang
 * @Description:
 * @Date: 2019/8/17 0017 12:15
 */
public interface RedisService {

    /**
     * 手机号和用户名存入缓存
     *
     * @param phone
     * @param username
     */
    void SavePhoneAndUsername(String phone, String username);


    /**
     * 保存博客发布信息
     *
     * @param blogMessageVOEntity
     */
    void SaveEditBlog(BlogMessageVOEntity blogMessageVOEntity);

}
