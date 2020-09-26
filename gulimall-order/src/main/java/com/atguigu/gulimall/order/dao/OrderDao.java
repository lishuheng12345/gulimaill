package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lish
 * @email 1458303034@gmail.com
 * @date 2020-09-26 15:55:41
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
