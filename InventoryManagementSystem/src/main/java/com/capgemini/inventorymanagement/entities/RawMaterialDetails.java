package com.capgemini.inventorymanagement.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "RawMaterialStock")
public class RawMaterialDetails {

	    @Id
	    @NotNull(message = "id cannot be empty ")
		private int rm_id;
	    
	    @NotBlank(message = "item name cannot be empty")
		private String item_name;
	
	    @Min(value = 1,message = "must be greater or equal to 1")
	    @NotNull(message = "unit cannot be empty")
		private int quantity_unit;
		
	    @Min(value = 10,message = "must be greater or equal to 10")
	    @NotNull(message = "price cannot be empty")
		private double price_per_unit;
		
	    @NotNull(message = "date cannot be empty")
		@DateTimeFormat(pattern = "dd/MM/yyyy")
		private Date manufacturing_date;
	    
	    @NotNull(message = "date cannot be empty")
		@DateTimeFormat(pattern = "dd/MM/yyyy")
	    private Date expiry_date;

		public int getRm_id() {
			return rm_id;
		}

		public void setRm_id(int rm_id) {
			this.rm_id = rm_id;
		}

		public String getItem_name() {
			return item_name;
		}

		public void setItem_name(String item_name) {
			this.item_name = item_name;
		}

		public int getQuantity_unit() {
			return quantity_unit;
		}

		public void setQuantity_unit(int quantity_unit) {
			this.quantity_unit = quantity_unit;
		}

		public double getPrice_per_unit() {
			return price_per_unit;
		}

		public void setPrice_per_unit(double price_per_unit) {
			this.price_per_unit = price_per_unit;
		}

		public Date getManufacturing_date() {
			return manufacturing_date;
		}

		public void setManufacturing_date(Date manufacturing_date) {
			this.manufacturing_date = manufacturing_date;
		}

		public Date getExpiry_date() {
			return expiry_date;
		}

		public void setExpiry_date(Date expiry_date) {
			this.expiry_date = expiry_date;
		} 
		
		
}
