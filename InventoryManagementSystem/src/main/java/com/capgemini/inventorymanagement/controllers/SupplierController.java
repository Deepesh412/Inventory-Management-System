package com.capgemini.inventorymanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagement.entities.SupplierDetails;
import com.capgemini.inventorymanagement.exceptions.IdNotFoundException;
import com.capgemini.inventorymanagement.service.SupplierService;

@RestController
@RequestMapping("/supplier")


public class SupplierController {
	
	@Autowired
	SupplierService serviceobj;
	
	//Add supplier
	@PostMapping("/addSupplier")
	public ResponseEntity<String>addSupplier(@RequestBody SupplierDetails s )
	{
		SupplierDetails e = serviceobj.addSupplier(s);
		if(e == null)
		{
			throw new IdNotFoundException("Enter Valid Id");
		}
		else {
			return new ResponseEntity<String>("Supplier created successfully",new HttpHeaders(),HttpStatus.OK);		
		}
	}

	//Get all suppliers
	@GetMapping("/GetAllSuppliers")
	private ResponseEntity<List<SupplierDetails>> getAllSuppliers() 
	    {
		List<SupplierDetails> supplierlist = serviceobj.getAllSuppliers();
		return new ResponseEntity<List<SupplierDetails>>(supplierlist, new HttpHeaders(), HttpStatus.OK);
        }
	
    //Update Supplier
    @PutMapping("/UpdateSupplier")
	public ResponseEntity<String> updateSupplier(@RequestBody SupplierDetails s)
		{
			SupplierDetails e = serviceobj.updateSupplier(s);
			if (e == null) {
				throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
			} else {
				return new ResponseEntity<String>("Supplier updated successfully", new HttpHeaders(), HttpStatus.OK);
			}
		}
		
	// Delete Supplier
	@DeleteMapping("/DeleteSupplier/{s_id}")
	private ResponseEntity<String> deleteSupplier(@PathVariable("s_id") int s_id)
		{
			SupplierDetails e = serviceobj.deleteSupplier(s_id);
			if (e == null) {
				throw new IdNotFoundException("Delete Operation Unsuccessful,Provided Id does not exist");
			} else {
				return new ResponseEntity<String>("Supplier deleted successfully", new HttpHeaders(), HttpStatus.OK);
			}
		}
	
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> userNotFound(IdNotFoundException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	
}
 