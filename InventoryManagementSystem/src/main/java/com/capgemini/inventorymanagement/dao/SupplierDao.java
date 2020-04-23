package com.capgemini.inventorymanagement.dao;

import java.util.List;

import com.capgemini.inventorymanagement.entities.SupplierDetails;

public interface SupplierDao {

	SupplierDetails addSupplier(SupplierDetails s);

	List<SupplierDetails> getAllSuppliers();

	SupplierDetails deleteSupplier(int s_id);

	SupplierDetails updateSupplier(SupplierDetails s);

}
