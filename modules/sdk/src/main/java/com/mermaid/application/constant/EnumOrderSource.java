package com.mermaid.application.constant;

public enum EnumOrderSource {
    WEBSITE(1,"网站订单"),
    APP(2,"APP订单"),
    WECHAt(3,"微信订单"),
    PHONE(4,"电话订单"),
    NORMAL(5,"门店订单"),
    BRIDGE(6,"旅委订单")
    ;
    private Integer code;
    private String value;

    EnumOrderSource(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
