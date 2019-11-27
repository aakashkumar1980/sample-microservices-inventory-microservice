package com.aakashkumar.microservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aakashkumar.microservices.controllers.dto.InventoryDto;
import com.aakashkumar.microservices.controllers.utils.ModelMapperUtils;
import com.aakashkumar.microservices.db.services.InventoryService;

@CrossOrigin
@RestController
@RequestMapping("/v1/inventory")
public class InventoryController {

	@Autowired ModelMapperUtils modelMapperUtils;
	@Autowired InventoryService inventoryService;

	@RequestMapping("/")
	public List<InventoryDto> getInventory(@RequestParam List<Long> productIds) {
		return modelMapperUtils.mapEntityToDto(inventoryService.getInventory(productIds), InventoryDto.class);
	}
}
