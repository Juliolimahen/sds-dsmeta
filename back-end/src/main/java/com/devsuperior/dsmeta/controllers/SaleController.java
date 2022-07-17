package com.devsuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;

@RestController // Define como controller
@RequestMapping(value = "/sales") // Caminho para acessar
public class SaleController {

	@Autowired // Injetar uma instância
	private SaleService service;
	
	@GetMapping
	public List<Sale> findSales() {
		return service.findSales();
	}
}
