package com.atguigu.gulimall.product.service;

import com.atguigu.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author Bohua
 * @email 2662940084@gmail.com
 * @date 2021-05-28 11:36:06
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

