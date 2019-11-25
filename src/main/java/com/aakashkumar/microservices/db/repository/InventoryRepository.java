
package com.aakashkumar.microservices.db.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.aakashkumar.microservices.db.entity.Inventory;

public interface InventoryRepository extends CrudRepository<Inventory, Float> {

    List<Inventory> findByProductIdIn(List<Long> productIds);
}
