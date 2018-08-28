package com.mermaid.application.order.model;

import java.util.Date;

public class OrderDomain {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 订单号
     */
    private String orderCode;

    /**
     * 订单生成时间
     */
    private Date orderTime;

    /**
     * 订单来源，1-电话预约，2-网站订单，3-手机端，4-微信端，5-旅委订单
     */
    private Integer orderSource;

    /**
     * 金额
     */
    private String amount;

    /**
     * 支付方式，1-现金，2-微信，3-支付宝,0-未支付
     */
    private String payType;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 客房Id
     */
    private Integer roomId;

    /**
     * 客栈Id
     */
    private Integer hostelId;

    /**
     * 用户Id
     */
    private Integer customerId;

    /**
     * 订单状态，1-已预约，2-已入住，3-已支付，4-已完成
     */
    private String orderStatus;

    /**
     * 订单完成时间
     */
    private Date finishTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getHostelId() {
        return hostelId;
    }

    public void setHostelId(Integer hostelId) {
        this.hostelId = hostelId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
}