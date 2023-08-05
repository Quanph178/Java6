package poly.shoptoy.Service;

import poly.shoptoy.Entity.OrdersEntity;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<OrdersEntity> getListOrder();

    Optional<OrdersEntity> getOrderById(Integer id);

    OrdersEntity createOrder(OrdersEntity ordersEntity);

    OrdersEntity updateOrder(OrdersEntity ordersEntity, Integer id);

    OrdersEntity deleteOrder(Integer id);
}
