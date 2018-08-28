package com.mermaid.application.order.service.impl;

import com.mermaid.application.constant.EnumOrderSource;
import com.mermaid.application.constant.EnumPayType;
import com.mermaid.application.dto.OrderCreateParamDTO;
import com.mermaid.application.order.dao.extension.OrderDomainExtensionMapper;
import com.mermaid.application.order.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2018/8/28 16:33
 */
@Service
public class OrderServiceImpl implements OrderService {
    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    private OrderDomainExtensionMapper orderDomainExtensionMapper;

    @Override
    public String createOrder(EnumOrderSource orderSource, String amount, EnumPayType payType, Date payTime, Integer roomId, Integer hostelId, Integer[] customerIds) {
        logger.info("创建单个订单，订单来源={}，订单金额");
        return null;
    }

    @Override
    public Boolean updateOrder(Integer orderId, String amount, EnumPayType payType, Date payTime, Integer roomId, Integer[] customerIds) {
        return null;
    }

    @Override
    public List<String> createOrders(List<OrderCreateParamDTO> paramDTOList) {
        return null;
    }
}
