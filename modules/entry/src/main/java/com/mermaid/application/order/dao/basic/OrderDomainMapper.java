package com.mermaid.application.order.dao.basic;

import com.mermaid.application.order.model.OrderDomain;

public interface OrderDomainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderDomain record);

    int insertSelective(OrderDomain record);

    OrderDomain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderDomain record);

    int updateByPrimaryKey(OrderDomain record);
}