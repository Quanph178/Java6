package poly.shoptoy.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poly.shoptoy.Entity.OrdersEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrdersEntity, Integer> {
}
