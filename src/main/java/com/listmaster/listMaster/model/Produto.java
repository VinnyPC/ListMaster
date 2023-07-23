package com.listmaster.listMaster.model;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.URL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

	@Entity
	@Table(name = "tb_produtos")
	public class Produto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O atributo nome é obrigatório")
		@Size(min = 2, max = 100, message = "O atributo nome deve conter entre 2 e 100 caracteres")
		private String nome;
		
		@Size(min = 2, max = 1000, message = "O atributo descricao deve ter entre 2 e 1000 caracteres")
		private String descricao;
		
		@Digits(integer = 10, fraction = 2)
		@Positive(message = "O valor deve ser positivo")
		private BigDecimal valor;
		
		@URL
		private String foto;
		
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;
		
		@ManyToOne
	    @JoinColumn(name = "lista_id")
	    private ListaDeCompras listaDeCompras;
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}


		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public BigDecimal getValor() {
			return valor;
		}

		public void setValor(BigDecimal valor) {
			this.valor = valor;
		}

		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		
		
	}


