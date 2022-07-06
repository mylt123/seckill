package com.lt.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lt.seckill.pojo.User;
import com.lt.seckill.vo.LoginVo;
import com.lt.seckill.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lt
 * @since 2022-07-06
 */
public interface IUserService extends IService<User> {
    RespBean doLogin(LoginVo loginvo, HttpServletRequest request, HttpServletResponse response);

    User getUserByCookie(String userTicket,HttpServletRequest request, HttpServletResponse response);

}
