package com.example.backend.mapper;


import com.example.backend.model.Order;
import com.example.backend.payload.CreateOrderRequest;
import com.example.backend.payload.OrderDto;
import org.springframework.stereotype.Service;

@Service
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order toOrder(CreateOrderRequest createOrderRequest) {
        if (createOrderRequest == null) {
            return null;
        }
        return new Order(createOrderRequest.getDescription());
    }

    @Override
    public OrderDto toOrderDto(Order order) {
        if (order == null) {
            return null;
        }
        OrderDto.UserDto userDto = new OrderDto.UserDto(order.getUser().getUsername());
        return new OrderDto(order.getId(), order.getDescription(), userDto, order.getCreatedAt());
    }
}
