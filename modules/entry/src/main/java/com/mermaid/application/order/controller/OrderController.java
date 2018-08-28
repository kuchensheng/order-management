package com.mermaid.application.order.controller;

import com.mermaid.application.constant.EnumOrderSource;
import com.mermaid.application.constant.EnumPayType;
import com.mermaid.application.order.service.OrderService;
import com.mermaid.framework.mvc.APIResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2018/8/28 16:53
 */
@RestController
@Api(value = "订单管理",tags = "订单管理")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "创建单个订单")
    @RequestMapping(value = "/app/order/{hostelId}/{roomId}",method = RequestMethod.POST)
    public APIResponse<String> createOrder(
            @ApiParam(required = true,name = "hostelId",value = "客栈Id") @PathVariable(value = "hostelId") Integer hostelId,
            @ApiParam(required = true,name = "roomId",value = "房间Id") @PathVariable(value = "roomId") Integer roomId,
            @ApiParam(required = true,name = "source",value = "订单来源") @RequestParam(value = "source") EnumOrderSource source,
            @ApiParam(required = true,name = "amount",value = "订单金额") @RequestParam(value = "amount") String amount,
            @ApiParam(required = false,name = "payType",value = "支付方式") @RequestParam(required = false,value = "payType") EnumPayType payType,
            @ApiParam(required = false,name = "payTime",value = "支付时间") @RequestParam(required = false,value = "payTime")Date payTime,
            @ApiParam(required = true,name = "customerIds",value = "客户编号数组") @RequestParam(value = "customerIds") Integer[] customerIds,
            @ApiParam(required = true,name = "creatorId",value = "创建人Id") @RequestParam(value = "creatorId") Integer creatorId,
            @ApiParam(required = true,name = "creatorName",value = "creatorName") @RequestParam(value = "creatorName") String creatorName
            ) {
        return APIResponse.success(orderService.createOrder(source,amount,payType,payTime,roomId,hostelId,customerIds,creatorId,creatorName));
    }
}
