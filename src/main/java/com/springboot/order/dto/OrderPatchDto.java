package com.springboot.order.dto;

import com.springboot.order.entity.Order;
import lombok.Getter;

// TODO OrderPatchDto 추가
@Getter
public class OrderPatchDto {
    private long orderId;
    private Order.OrderStatus orderStatus;

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
}
