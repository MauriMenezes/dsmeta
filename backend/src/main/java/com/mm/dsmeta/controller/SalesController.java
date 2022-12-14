package com.mm.dsmeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mm.dsmeta.model.Sale;
import com.mm.dsmeta.services.SaleService;
import com.mm.dsmeta.services.SmsService;

@RestController
@RequestMapping(value = "/sales")
public class SalesController {

  @Autowired
  private SaleService service;

  @Autowired
  private SmsService smsService;

  @GetMapping
  public Page<Sale> findSales(
      @RequestParam(value = "minDate", defaultValue = "") String minDate,
      @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
      Pageable pageable) {

    return service.findSales(minDate, maxDate, pageable);
  }

  @GetMapping("/notification")
  public void notifySms() {

    smsService.sendSms();
  }
}
