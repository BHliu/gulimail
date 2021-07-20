package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author Bohua
 * @email 2662940084@gmail.com
 * @date 2021-05-31 13:54:59
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

