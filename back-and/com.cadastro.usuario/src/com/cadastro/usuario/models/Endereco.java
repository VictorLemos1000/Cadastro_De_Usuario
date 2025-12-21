package com.cadastro.usuario.models;

import java.util.Objects;

/**
 * Endereço é uma entidade multivalorada pois um usuário
 * pode ter nenhuma ou muitas residências.
 */
public class Endereco {

	private int idEndereco;
	private int idUsuario;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String estado;
	private String cep;
	private String tipoEndereco;
	
	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public Endereco(int idEndereco, int idUsuario, String logradouro, String numero, String complemento, String bairro,
			String estado, String cep, String tipoEndereco) {
		this.idEndereco = idEndereco;
		this.idUsuario = idUsuario;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.estado = estado;
		this.cep = cep;
		this.tipoEndereco = tipoEndereco;
	}
	
	public int getIdEndereco() {
		return idEndereco;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public String getCep() {
		return cep;
	}
	
	public String getTipoEndereco() {
		return tipoEndereco;
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", idUsuario=" + idUsuario + ", logradouro=" + logradouro
				+ ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", estado=" + estado
				+ ", cep=" + cep + ", tipoEndereco=" + tipoEndereco + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEndereco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return idEndereco == other.idEndereco;
	}
}
