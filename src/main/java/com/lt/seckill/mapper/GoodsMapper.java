package com.lt.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lt.seckill.pojo.Goods;
import com.lt.seckill.vo.GoodsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lt
 * @since 2022-07-07
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {

    List<GoodsVo> findGoodsVo();

    GoodsVo findGoodsByGoodsId(Long goodsId);
}
