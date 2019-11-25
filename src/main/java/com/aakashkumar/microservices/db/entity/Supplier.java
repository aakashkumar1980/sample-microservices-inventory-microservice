// Generated with g9.

package com.aakashkumar.microservices.db.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Supplier implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "id";


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private long id;
    
    @Column(nullable=false, length=25)
    private String name;
    
    @EqualsAndHashCode.Include
    @Column(nullable=false, length=10)
    private String code;
    
    @OneToMany(mappedBy="supplier")
    private Set<SupplierAddress> supplierAddress;
    
    @OneToMany(mappedBy="supplier")
    private Set<Inventory> inventory;


}
