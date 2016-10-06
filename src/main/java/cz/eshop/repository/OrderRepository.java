package cz.eshop.repository;

import cz.eshop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
