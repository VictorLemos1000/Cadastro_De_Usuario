package com.cadastro.usuario.models;

import java.util.Objects;

// Entidade multivalorada
public class Telefone {

	private int idTelefone;
	private int idUsuario;
	/*
	 * Uma boa ideia de utilizar o atributo ddd é
	 * fazer uma estrutura condicional por seleção
	 * com os ddd's brasileiros
	 */
	private String ddd; // Acrônimo para Discagem Direta a Distância
	private String numero;
	// Tipos de telefones celular ou residêncial
	private String tipoTelefone;
	public Telefone(int idTelefone, int idUsuario, String ddd, String numero, String tipoTelefone) {
		super();
		this.idTelefone = idTelefone;
		this.idUsuario = idUsuario;
		this.ddd = ddd;
		this.numero = numero;
		this.tipoTelefone = tipoTelefone;
	}
	
	public int getIdTelefone() {
		return idTelefone;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public String getDdd() {
		return ddd;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getTipoTelefone() {
		return tipoTelefone;
	}

	@Override
	public String toString() {
		return "Telefone [idTelefone=" + idTelefone + ", idUsuario=" + idUsuario + ", ddd=" + ddd + ", numero=" + numero
				+ ", tipoTelefone=" + tipoTelefone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTelefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return idTelefone == other.idTelefone;
	}
}
