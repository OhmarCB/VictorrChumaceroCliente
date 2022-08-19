package com.idat.pe.EFVICTORCHUMACEROCLIENTE.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.pe.EFKIRBYDAMASOCLIENTE.entity.Cliente;
import com.idat.pe.EFKIRBYDAMASOCLIENTE.service.ClienteService;

@RestController
@RequestMapping("/exa/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardarCliente(@RequestBody Cliente cliente) {
		service.guardarCliente(cliente);
	}
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> listarCliente(){
		return service.listarCliente();
	}
}
