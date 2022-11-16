package com.mm.dsmeta.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String SellerName;
  private int visited;
  private int deals;
  private Double amount;
  private LocalDate date;

  public Sale() {
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSellerName() {
    return this.SellerName;
  }

  public void setSellerName(String SellerName) {
    this.SellerName = SellerName;
  }

  public int getVisited() {
    return this.visited;
  }

  public void setVisited(int visited) {
    this.visited = visited;
  }

  public int getDeals() {
    return this.deals;
  }

  public void setDeals(int deals) {
    this.deals = deals;
  }

  public Double getAmount() {
    return this.amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public LocalDate getDate() {
    return this.date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

}
