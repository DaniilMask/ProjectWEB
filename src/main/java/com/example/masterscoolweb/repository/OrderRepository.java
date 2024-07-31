package com.example.masterscoolweb.repository;

import com.example.masterscoolweb.order.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {
}
