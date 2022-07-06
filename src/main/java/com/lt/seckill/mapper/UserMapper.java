package com.lt.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lt.seckill.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lt
 * @since 2022-07-06
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
