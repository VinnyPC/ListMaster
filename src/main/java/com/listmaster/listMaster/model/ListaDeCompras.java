package com.listmaster.listMaster.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_ListaDeCompras")
public class ListaDeCompras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo nome é obrigatório")
	@Size(min = 2, max = 100, message = "O atributo nome deve conter entre 2 e 100 caracteres")
	private String nomeLista;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "listaDeCompras", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("ListaDeCompras")
	private List<Produto> produto;

}
