package com.mermaid.application.order.dao.extension;

import com.mermaid.application.order.dao.basic.RelCustomerOrderDomainMapper;
import com.mermaid.application.order.model.RelCustomerOrderDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RelCustomerOrderDomainExtensionMapper extends RelCustomerOrderDomainMapper {

    /**
     * 创建客户与订单关系
     * @param relCustomerOrderDomainList
     * @return
     */
    Integer createRelCustomerOrder(@Param("relCustomerOrderDomainList") List<RelCustomerOrderDomain> relCustomerOrderDomainList);
}