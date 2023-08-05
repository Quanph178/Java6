package poly.shoptoy.Service.Impl;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poly.shoptoy.Entity.OrderdetailsEntity;
import poly.shoptoy.Repository.OrderDetailRepository;
import poly.shoptoy.Service.OrderDetailService;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailServiceImp implements OrderDetailService {
    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderdetailsEntity> getListOrder() {
        return orderDetailRepository.findAll();
    }

    @Override
    public Optional<OrderdetailsEntity> getOrderById(Integer id) {
        return orderDetailRepository.findById(id);
    }

    @Override
    public OrderdetailsEntity createOrder(OrderdetailsEntity orderdetailsEntity) {
        return orderDetailRepository.save(orderdetailsEntity);
    }

    @Override
    public OrderdetailsEntity updateOrder(OrderdetailsEntity orderdetailsEntity, Integer id) {
        Optional<OrderdetailsEntity> orderdetailsUpdate = orderDetailRepository.findById(id);
        if (orderdetailsUpdate.isPresent()) {
            BeanUtils.copyProperties(orderdetailsUpdate, orderdetailsEntity);
            return orderDetailRepository.save(orderdetailsEntity);
        }
        return null;
    }

    @Override
    public OrderdetailsEntity deleteOrder(Integer id) {
        Optional<OrderdetailsEntity> orderdetailsEntity = orderDetailRepository.findById(id);
        if (orderdetailsEntity.isPresent()) {
            orderDetailRepository.deleteById(id);
        }
        return null;
    }
}
