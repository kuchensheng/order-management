package com.mermaid.application.order.model;

import java.util.Date;

public class RelCustomerOrderDomain {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 订单Id
     */
    private Integer orderId;

    /**
     * 房间Id
     */
    private Integer roomId;

    /**
     * 客户Id
     */
    private Integer customerId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人编号
     */
    private Integer creatorId;

    /**
     * 创建人姓名
     */
    private String creatorName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }
}