package com.idat.pe.EFKIRBYDAMASOCLIENTE.service;

import java.util.List;

import com.idat.pe.EFKIRBYDAMASOCLIENTE.entity.Cliente;

public interface ClienteService {
	public List<Cliente> listarCliente();
	public void guardarCliente(Cliente cliente);

}
