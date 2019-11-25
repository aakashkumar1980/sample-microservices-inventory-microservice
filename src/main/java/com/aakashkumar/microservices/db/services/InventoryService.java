
package com.aakashkumar.microservices.db.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.aakashkumar.microservices.db.entity.Inventory;
import com.aakashkumar.microservices.db.repository.InventoryRepository;

@Service
public class InventoryService {

    @Value("${records-size}") Integer recordsSize;    
    @Autowired InventoryRepository inventoryRepository;

    public List<Inventory> getInventory(List<Long> productIds) {
        List<Inventory> data= inventoryRepository.findByProductIdIn(productIds);
        
        return (data!=null)? data: new ArrayList<>();
    }
}