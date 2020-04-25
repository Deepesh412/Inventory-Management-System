package com.capgemini.inventorymanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagement.dao.RawMaterialOrderDaoImpl;
import com.capgemini.inventorymanagement.entities.RawMaterialOrderDetails;

@Service
@Transactional


public class RawMaterialOrderServiceImpl implements RawMaterialOrderService {
	
	@Autowired
	RawMaterialOrderDaoImpl dao;
	
	@Override
	public RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r) {
		// TODO Auto-generated method stub
		return dao.addRawMaterialOrder(r);
	}

	@Override
	public List<RawMaterialOrderDetails> getAllRawMaterialOrders() {
		// TODO Auto-generated method stub
		return dao.getAllRawMaterialOrders();
	}

	
	@Override
	public RawMaterialOrderDetails deleteRawMaterialOrder(int order_id) {
		// TODO Auto-generated method stub
		return dao.deleteRawMaterialOrder(order_id);
	}

	@Override
	public RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r) {
		// TODO Auto-generated method stub
		return dao.updateRawMaterialOrder(r);
	}

}