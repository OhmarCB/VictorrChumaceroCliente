package com.idat.pe.EFVICTORCHUMACEROCLIENTE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.pe.EFKIRBYDAMASOCLIENTE.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
