package com.mm.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.dsmeta.model.Sale;
import com.mm.dsmeta.repository.SaleRepository;

@Service
public class SaleService {

  @Autowired
  private SaleRepository repository;

  public List<Sale> findSales() {

    return repository.findAll();

  }
}
