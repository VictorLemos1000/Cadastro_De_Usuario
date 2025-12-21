package com.cadastro.usuario.models;

import java.util.Calendar;
import java.util.Date;
/*
 * Lembrete as classe pojo(Plain Old Java Object) são as classes de modelo do sistema
 * em orientação a objetos com java para uma melhor organização de um projeto.
 */
import java.util.Objects;

/**
 * A classe usuário será a entidade chave/central na qual vai armazenar
 * informações básicas de identificação do indivíduo.
 */
public class Usuario {

	// O ID é a chave priméria do usuário
	private int id;
	private String nome;
	private String email;
	private Calendar dataNascimento;
	// Atributo para identificação única
	private String cpf;
	// Atributo para registrar data e hora que você(usuário) se cadastrou
	private Date dataCadastro;
	// Para a senha é necessário que seja comparada uma hash
	private String senha;	
	
	// Construtor implícito ou seja sem assinatura de método
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	// Construtor explícitor com assinatura do método
	public Usuario(int id, String nome, String email, Calendar dataNascimento, String cpf, Date dataCadastro,
			String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.dataCadastro = dataCadastro;
		this.senha = senha;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	public String getSenha() {
		return senha;
	}

	/*
	 * Apenas inclui métodos getters porque o construtor
	 * já está realizando o papel de armazenas os atributos
	 * do usuário, no qual os setters já fariam, mas isto é
	 * bom pois economiza mais linhas do código já se simplifica.
	 * 
	 * E para concluir esta classe como pojo(Plain Old Java Object)
	 * vou adicionar os método toString para que apresente os dados
	 * em forma de texto evitado que na saída do programa seja apresentado
	 * uma hash no qual para um cliente seria totalmente esquisito,
	 * também vou adicionar os métodos equals que serve para comparar
	 * instancias de obejetos e o hashCode ele gera um hash para o objeto
	 * para otimizar, performatizar e colecionar dados.
	 */
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", dataNascimento=" + dataNascimento
				+ ", cpf=" + cpf + ", dataCadastro=" + dataCadastro + ", senha=" + senha + "]";
	}

	/*
	 * Escolhi o atributo ID poeque ele é o identificador
	 * da entidade serve como chave estrangeira para Classe endereço e telefone
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}
}
