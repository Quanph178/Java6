package poly.shoptoy.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poly.shoptoy.Entity.OrdersEntity;
import poly.shoptoy.Service.OrderService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrdersEntity>> getListOrder() {
        return ResponseEntity.ok(orderService.getListOrder());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<OrdersEntity>> getListOrderById(@PathVariable Integer id) {
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    @PostMapping
    public ResponseEntity<OrdersEntity> createOrder(@RequestBody OrdersEntity ordersEntity) {
        return ResponseEntity.ok(orderService.createOrder(ordersEntity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrdersEntity> updateOrder(@RequestBody OrdersEntity ordersEntity, @PathVariable Integer id) {
        return ResponseEntity.ok(orderService.updateOrder(ordersEntity, id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<OrdersEntity> deleteOrder(@PathVariable Integer id) {
        return ResponseEntity.ok(orderService.deleteOrder(id));
    }
}
