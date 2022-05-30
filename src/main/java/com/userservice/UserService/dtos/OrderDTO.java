package com.userservice.UserService.dtos;

public class OrderDTO {

    private String id;
    private String orderId;
    private String userId;

    public OrderDTO() {
    }

    public OrderDTO(String id, String orderId, String userId) {
        this.id = id;
        this.orderId = orderId;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
