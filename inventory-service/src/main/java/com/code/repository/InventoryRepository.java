package com.code.repository;

import com.code.model.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface InventoryRepository  extends JpaRepository<Inventory, UUID> {
    Optional<Inventory> findBySku(String sku);
    List<Inventory> findBySkuIn(List<String> skus);
}
