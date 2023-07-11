package com.example.backend.mapper;


import com.example.backend.model.Order;
import com.example.backend.payload.CreateOrderRequest;
import com.example.backend.payload.OrderDto;

public interface OrderMapper {

    Order toOrder(CreateOrderRequest createOrderRequest);

    OrderDto toOrderDto(Order order);
}