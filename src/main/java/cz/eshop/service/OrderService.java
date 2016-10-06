package cz.eshop.service;

import cz.eshop.entity.Order;
import cz.eshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by frantisek.manak on 5.10.2016.
 */
@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public void createOrder(Order order) {
        orderRepository.save(order);
    }

}
