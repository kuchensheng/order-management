package com.mermaid.application.order.service;

import com.mermaid.application.constant.EnumOrderSource;
import com.mermaid.application.constant.EnumPayType;
import com.mermaid.application.dto.OrderCreateParamDTO;

import java.util.Date;
import java.util.List;

/**
 * @author Chensheng.Ku
 * 创建时间 2018-08-28 15:45
 * 描述：订单接口
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderSource 订单来源
     * @param amount 金额
     * @param payType 支付方式
     * @param payTime 支付时间
     * @param roomId 客房Id
     * @param hostelId 客栈Id
     * @param customerIds 客户Id数组
     * @param creatorId 创建人id
     * @param creatorName 创建人姓名
     * @return 订单编号
     */
    String createOrder(EnumOrderSource orderSource, String amount, EnumPayType payType, Date payTime, Integer roomId, Integer hostelId, Integer[] customerIds, Integer creatorId, String creatorName);

    /**
     * 修改订单
     * @param orderId 订单Id
     * @param amount 金额
     * @param payType 支付方式
     * @param payTime 支付时间
     * @param roomId 客房
     * @param customerIds 客户Id数组
     * @return
     */
    Boolean updateOrder(Integer orderId,String amount,EnumPayType payType,Date payTime,Integer roomId,Integer[] customerIds);

    /**
     * 批量创建订单
     * @param paramDTOList 创建订单参数
     * @return 订单编号列表
     */
    List<String> createOrders(List<OrderCreateParamDTO> paramDTOList);

}
