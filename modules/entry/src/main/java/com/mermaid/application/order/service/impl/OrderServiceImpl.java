package com.mermaid.application.order.service.impl;

import com.mermaid.application.constant.EnumOrderSource;
import com.mermaid.application.constant.EnumPayType;
import com.mermaid.application.dto.OrderCreateParamDTO;
import com.mermaid.application.order.dao.extension.OrderDomainExtensionMapper;
import com.mermaid.application.order.dao.extension.RelCustomerOrderDomainExtensionMapper;
import com.mermaid.application.order.model.OrderDomain;
import com.mermaid.application.order.model.RelCustomerOrderDomain;
import com.mermaid.application.order.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    @Autowired
    private RelCustomerOrderDomainExtensionMapper relCustomerOrderDomainExtensionMapper;


    @Override
    public String createOrder(EnumOrderSource orderSource, String amount, EnumPayType payType, Date payTime, Integer roomId, Integer hostelId, Integer[] customerIds, Integer creatorId, String creatorName) {
        OrderDomain orderDomain = new OrderDomain();
        orderDomain.setAmount(amount);
        orderDomain.setHostelId(hostelId);
        Date orderDate = new Date();
        String orderCode = productOrderCode(hostelId,roomId,orderDate);
        orderDomain.setOrderCode(orderCode);
        orderDomain.setOrderSource(orderSource.getCode());
        orderDomain.setOrderTime(orderDate);
        orderDomain.setPayTime(payTime);
        orderDomain.setPayType(payType.name());
        orderDomain.setRoomId(roomId);
        orderDomainExtensionMapper.insertSelective(orderDomain);
        logger.info("订单生成成功,orderId={}，开始生成订单与客户关系",orderDomain.getId());
        List<RelCustomerOrderDomain> relCustomerOrderDomainList = new ArrayList<>(customerIds.length);
        for (Integer cusomerId:customerIds) {
            RelCustomerOrderDomain domain = new RelCustomerOrderDomain();
            domain.setOrderId(orderDomain.getId());
            domain.setRoomId(roomId);
            domain.setCustomerId(cusomerId);
            domain.setCreateTime(orderDate);
            domain.setCreatorId(creatorId);
            domain.setCreatorName(creatorName);
        }
        relCustomerOrderDomainExtensionMapper.createRelCustomerOrder(relCustomerOrderDomainList);
        logger.info("订单客户关系创建成功");
        return orderCode;
    }

    private String productOrderCode(Integer hostelId, Integer roomId, Date orderDate) {
        logger.info("创建订单编号，hostelId={},roomId={},创建时间={}",orderDate.getTime());
        int random = (int) ((Math.random()*9 + 1) * 100000);
        StringBuilder orderCode = new StringBuilder(hostelId);
        orderCode.append(roomId).append(orderDate.getTime()).append(random);
        logger.info("生成订单号={}",orderCode.toString());
        return orderCode.toString();
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
