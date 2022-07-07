package com.lt.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lt.seckill.pojo.Goods;
import com.lt.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lt
 * @since 2022-07-07
 */
public interface IGoodsService extends IService<Goods> {

    List<GoodsVo> findGoodsVo();

    GoodsVo findGoodsByGoodsId(Long goodsId);
}
