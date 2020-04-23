package com.capgemini.inventorymanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inventorymanagement.dao.SupplierDaoImpl;
import com.capgemini.inventorymanagement.entities.SupplierDetails;


@Service
@Transactional

public class SupplierServiceImpl implements SupplierService{
	
	@Autowired
	SupplierDaoImpl dao;
	
	@Override
	public SupplierDetails addSupplier(SupplierDetails s) {
		// TODO Auto-generated method stub
		return dao.addSupplier(s);
	}

	@Override
	public List<SupplierDetails> getAllSuppliers() {
		// TODO Auto-generated method stub
		return dao.getAllSuppliers();
	}

	@Override
	public SupplierDetails deleteSupplier(int s_id) {
		// TODO Auto-generated method stub
		return dao.deleteSupplier(s_id);
	}

	@Override
	public SupplierDetails updateSupplier(SupplierDetails s) {
		// TODO Auto-generated method stub
		return dao.updateSupplier(s);
	}
	
	/*@Override
	public Boolean loginUser(Userdata u) {
		// TODO Auto-generated method stub
		return dao.loginUser(u);
	} */

}


	


