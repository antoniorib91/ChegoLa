package br.feevale.model;

import java.sql.Timestamp;

import br.feevale.FevasDB.AlternateKey;
import br.feevale.FevasDB.PrimaryKey;
import br.feevale.FevasDB.TableInfo;

@TableInfo( tableName="Usuarios" )
public class Usuario {

	@PrimaryKey
	private Integer idUsuario;
	@AlternateKey("porNomeLogin")
	private String nomeLogin;
	private String infoSenha;
	private String nomeCompleto;
	private Timestamp dataNascimento;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeLogin() {
		return nomeLogin;
	}

	public void setNomeLogin(String nomeLogin) {
		this.nomeLogin = nomeLogin;
	}

	public String getInfoSenha() {
		return infoSenha;
	}

	public void setInfoSenha(String infoSenha) {
		this.infoSenha = infoSenha;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Timestamp getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Timestamp dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}