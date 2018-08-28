package com.mermaid.application.dto;

import com.mermaid.application.constant.EnumOrderSource;
import com.mermaid.application.constant.EnumPayType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2018/8/28 16:25
 * 批量创建订单参数
 */
@ApiModel("批量创建订单参数")
@Data
public class OrderCreateParamDTO {

    @ApiModelProperty(name = "enumOrderSource",value = "订单来源")
    private EnumOrderSource enumOrderSource;

    @ApiModelProperty(name = "amount",value = "金额")
    private String amount;

    @ApiModelProperty(name = "enumPayType",value = "支付方式")
    private EnumPayType enumPayType;

    @ApiModelProperty(name = "payTime",value = "支付时间")
    private Date payTime;

    @ApiModelProperty(name = "roomId",value = "客房Id")
    private Integer roomId;

    @ApiModelProperty(name = "customerIds",value = "客户Id数组")
    private Integer[] customerIds;

    @ApiModelProperty(name = "hostelId",value = "客栈Id")
    private Integer hostelId;




}
