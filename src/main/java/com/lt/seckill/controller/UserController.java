package com.lt.seckill.controller;


import com.lt.seckill.pojo.User;
import com.lt.seckill.vo.RespBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lt
 * @since 2022-07-06
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/info")
    @ResponseBody
    public RespBean infi(User user){
        return RespBean.success(user);
    }

}
