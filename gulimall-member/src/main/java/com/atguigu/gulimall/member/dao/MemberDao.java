package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Bohua
 * @email 2662940084@gmail.com
 * @date 2021-05-31 13:54:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
