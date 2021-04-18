package com.wzc.whattoeat.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 20022335
 * @date 2021/4/18
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Data
public class DiningHallDto implements Serializable {

    private static final long serialVersionUID = -3363719400748203370L;

    /**
     * 餐厅编码
     */
    private String diningHallCode;
    /**
     * 餐厅名称
     */
    private String diningHallName;
}
