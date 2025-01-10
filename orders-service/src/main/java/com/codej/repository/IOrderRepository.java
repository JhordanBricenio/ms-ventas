package com.codej.repository;

import com.codej.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IOrderRepository  extends JpaRepository<Order, UUID> {
}
