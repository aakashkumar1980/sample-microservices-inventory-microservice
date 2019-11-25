// Generated with g9.

package com.aakashkumar.microservices.db.entity;

import java.io.Serializable;
import java.sql.Timestamp;

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
public class Inventory implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private long id;
    
    @Column(name="product_id", nullable=false)
    private long productId;
    
    @Column(name="unit_cost", nullable=false, length=12)
    private float unitCost;
    
    @Column(name="unit_balance", nullable=false)
    private short unitBalance;
    
    @Column(name="transport_cost", nullable=false, length=12)
    private float transportCost;
    
    @Column(name="creation_date", nullable=false)
    private Timestamp creationDate;
    
    @Column(name="update_date")
    private Timestamp updateDate;
    
    @ManyToOne(optional=false)
    @JoinColumn(name="supplier_id", nullable=false)
    private Supplier supplier;


}
