package com.qiang.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiang.modules.sys.entity.FriendLinkEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: qiang
 * @Description:
 * @Date: 2019/8/19 0019 20:26
 */
@Repository
@Mapper
public interface FriendlinkDao extends BaseMapper<FriendLinkEntity> {

    List<FriendLinkEntity> getAllGuest();

    @Update("update friendlink set likes = likes - 1 where id = #{arg0}")
    int updDesRepGuest(Long id);

    @Update("update friendlink set likes = likes + 1 where id = #{arg0}")
    int updInsRepGuest(Long id);

}
