package com.mermaid.application.order.dao.basic;

import com.mermaid.application.order.model.RelCustomerOrderDomain;

public interface RelCustomerOrderDomainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelCustomerOrderDomain record);

    int insertSelective(RelCustomerOrderDomain record);

    RelCustomerOrderDomain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RelCustomerOrderDomain record);

    int updateByPrimaryKey(RelCustomerOrderDomain record);
}