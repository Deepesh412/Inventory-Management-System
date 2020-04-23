package com.capgemini.inventorymanagement.service;

import java.util.List;

import com.capgemini.inventorymanagement.entities.SupplierDetails;

public interface SupplierService {

	SupplierDetails addSupplier(SupplierDetails s);

	List<SupplierDetails> getAllSuppliers();

	SupplierDetails deleteSupplier(int s_id);

	SupplierDetails updateSupplier(SupplierDetails s);

}
