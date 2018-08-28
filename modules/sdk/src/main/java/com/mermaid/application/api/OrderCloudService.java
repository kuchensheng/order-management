package com.mermaid.application.api;

import com.mermaid.application.constant.EnumOrderSource;
import com.mermaid.application.constant.EnumPayType;
import com.mermaid.framework.mvc.APIResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * @author Chensheng.Ku
 * 创建时间 2018-08-28 17:34
 * 描述：订单管理服务云接口
 */
@FeignClient("order-management")
public interface OrderCloudService {
    @ApiOperation(value = "创建单个订单")
    @RequestMapping(value = "/app/order/{hostelId}/{roomId}",method = RequestMethod.POST)
    APIResponse<String> createOrder(
            @ApiParam(required = true,name = "hostelId",value = "客栈Id") @PathVariable(value = "hostelId") Integer hostelId,
            @ApiParam(required = true,name = "roomId",value = "房间Id") @PathVariable(value = "roomId") Integer roomId,
            @ApiParam(required = true,name = "source",value = "订单来源") @RequestParam(value = "source") EnumOrderSource source,
            @ApiParam(required = true,name = "amount",value = "订单金额") @RequestParam(value = "amount") String amount,
            @ApiParam(required = false,name = "payType",value = "支付方式") @RequestParam(required = false,value = "payType") EnumPayType payType,
            @ApiParam(required = false,name = "payTime",value = "支付时间") @RequestParam(required = false,value = "payTime")Date payTime,
            @ApiParam(required = true,name = "customerIds",value = "客户编号数组") @RequestParam(value = "customerIds") Integer[] customerIds,
            @ApiParam(required = true,name = "creatorId",value = "创建人Id") @RequestParam(value = "creatorId") Integer creatorId,
            @ApiParam(required = true,name = "creatorName",value = "creatorName") @RequestParam(value = "creatorName") String creatorName
    );
}
