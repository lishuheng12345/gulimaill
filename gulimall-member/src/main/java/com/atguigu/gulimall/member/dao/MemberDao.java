package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lish
 * @email 1458303034@gmail.com
 * @date 2020-09-26 16:01:13
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
