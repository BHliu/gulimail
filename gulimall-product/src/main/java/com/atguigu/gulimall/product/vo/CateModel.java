package com.atguigu.gulimall.product.vo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

/**
 * @Author 刘波华
 * @Data 2021/6/25 15:04
 * @Description
 **/
@Data
public class CateModel {

    private Long catId;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 父分类id
     */
    private Long parentCid;
    /**
     * 层级
     */
    private Integer catLevel;
    /**
     * 是否显示[0-不显示，1显示]
     */
    @TableLogic(value = "1",delval = "0")
    private Integer showStatus;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 图标地址
     */
    private String icon;
    /**
     * 计量单位
     */
    private String productUnit;
    /**
     * 商品数量
     */
    private Integer productCount;
}
