package com.aakashkumar.microservices.controllers.dto;

import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class InventoryDto {

	private long id;
	private long productId;
	private float unitCost;
	private short unitBalance;
	private float transportCost;
	private Timestamp creationDate;
	private Timestamp updateDate;

	private SupplierDto supplier;
    
}