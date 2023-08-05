package poly.shoptoy.Service;

import poly.shoptoy.Entity.OrderdetailsEntity;

import java.util.List;
import java.util.Optional;

public interface OrderDetailService {
    List<OrderdetailsEntity> getListOrder();

    Optional<OrderdetailsEntity> getOrderById(Integer id);

    OrderdetailsEntity createOrder(OrderdetailsEntity orderdetailsEntity);

    OrderdetailsEntity updateOrder(OrderdetailsEntity orderdetailsEntity, Integer id);

    OrderdetailsEntity deleteOrder(Integer id);
}
