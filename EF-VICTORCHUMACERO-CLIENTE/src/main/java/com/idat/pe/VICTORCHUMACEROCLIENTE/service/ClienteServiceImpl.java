package com.idat.pe.EFKIRBYDAMASOCLIENTE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.EFKIRBYDAMASOCLIENTE.entity.Cliente;
import com.idat.pe.EFKIRBYDAMASOCLIENTE.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository repository;

	@Override
	public List<Cliente> listarCliente() {
		return repository.findAll();

	}
	@Override
	public void guardarCliente(Cliente cliente) {
		repository.save(cliente);
		
	}
	
	

}
