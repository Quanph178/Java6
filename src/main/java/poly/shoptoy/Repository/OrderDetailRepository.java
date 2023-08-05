package poly.shoptoy.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poly.shoptoy.Entity.OrderdetailsEntity;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderdetailsEntity, Integer> {
}
