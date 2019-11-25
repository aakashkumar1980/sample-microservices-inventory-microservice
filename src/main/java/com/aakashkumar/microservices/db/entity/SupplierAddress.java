// Generated with g9.

package com.aakashkumar.microservices.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class SupplierAddress implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private long id;
    
    @Column(nullable=false, length=255)
    private String address1;
    
    @Column(nullable=false, length=255)
    private String address2;
    
    @Column(name="postal_code", nullable=false, length=25)
    private String postalCode;
    
    @Column(nullable=false, length=25)
    private String city;
    
    @Column(nullable=false, length=25)
    private String state;
    
    @Column(nullable=false, length=25)
    private String country;
    
    @ManyToOne(optional=false)
    @JoinColumn(name="supplier_id", nullable=false)
    private Supplier supplier;


}
