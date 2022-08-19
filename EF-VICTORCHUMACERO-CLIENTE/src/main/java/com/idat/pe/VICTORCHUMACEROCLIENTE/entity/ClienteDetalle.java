package com.idat.pe.EFVICTORCHUMACEROCLIENTE.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "detalle_cliente")
@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDetalle {
	private ClientePizzaFK fk =  new ClientePizzaFK();
}
