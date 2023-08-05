package poly.shoptoy.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poly.shoptoy.Entity.UsersEntity;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity, String> {
}
