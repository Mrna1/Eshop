package cz.eshop.service;

import cz.eshop.entity.OrderItem;
import cz.eshop.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by frantisek.manak on 5.10.2016.
 */
@Service
public class OrderItemService {

    @Autowired
    OrderItemRepository orderItemRepository;


    public void createOrderItem(OrderItem orderItem) {
        orderItemRepository.save(orderItem);
    }
}
