package poly.shoptoy.Service.Impl;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poly.shoptoy.Entity.OrdersEntity;
import poly.shoptoy.Repository.OrderRepository;
import poly.shoptoy.Service.OrderService;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<OrdersEntity> getListOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<OrdersEntity> getOrderById(Integer id) {
        Optional<OrdersEntity> ordersEntity = orderRepository.findById(id);
        if (ordersEntity.isPresent()) {
            return ordersEntity;
        }
        return null;
    }

    @Override
    public OrdersEntity createOrder(OrdersEntity ordersEntity) {
        return orderRepository.save(ordersEntity);
    }

    @Override
    public OrdersEntity updateOrder(OrdersEntity ordersEntity, Integer id) {
        Optional<OrdersEntity> orderUpdate = orderRepository.findById(id);
        if (orderUpdate.isPresent()) {
            BeanUtils.copyProperties(orderUpdate, ordersEntity);
            return orderRepository.save(ordersEntity);
        }
        return null;
    }

    @Override
    public OrdersEntity deleteOrder(Integer id) {
        Optional<OrdersEntity> ordersEntity = orderRepository.findById(id);
        if (ordersEntity.isPresent()) {
            orderRepository.deleteById(id);
        }
        return null;
    }
}
