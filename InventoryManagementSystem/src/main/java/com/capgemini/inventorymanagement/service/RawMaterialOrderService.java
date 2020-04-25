package com.capgemini.inventorymanagement.service;

import java.util.List;

import com.capgemini.inventorymanagement.entities.RawMaterialOrderDetails;

public interface RawMaterialOrderService {

	RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r);

	List<RawMaterialOrderDetails> getAllRawMaterialOrders();

	RawMaterialOrderDetails deleteRawMaterialOrder(int order_id);

	RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r);

}
