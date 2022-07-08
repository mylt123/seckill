package com.lt.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lt.seckill.pojo.Order;
import com.lt.seckill.pojo.User;
import com.lt.seckill.vo.GoodsVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lt
 * @since 2022-07-07
 */
public interface IOrderService extends IService<Order> {

    Order seckill(User user, GoodsVo goods);
}
