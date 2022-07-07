package com.lt.seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lt.seckill.mapper.GoodsMapper;
import com.lt.seckill.pojo.Goods;
import com.lt.seckill.service.IGoodsService;
import com.lt.seckill.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lt
 * @since 2022-07-07
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<GoodsVo> findGoodsVo() {
        return goodsMapper.findGoodsVo();
    }

    @Override
    public GoodsVo findGoodsByGoodsId(Long goodsId) {
        return goodsMapper.findGoodsByGoodsId(goodsId);
    }
}
