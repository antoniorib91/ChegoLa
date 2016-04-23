package br.feevale.model;

import java.sql.Timestamp;

/**
 * Esta classe tem como objetivo transportar os dados de um registro da tabela
 * Pessoa do Banco de Dados.
 * 
 * @author Carlos
 */
public class Pessoa {

	private Integer idPessoa;
	private String nmPessoa;
	private Timestamp dtNascimento;
	private String dsCpf;
	private Boolean idAtivo;
	private String tpSexo;
	private Double vlSalario;
	private byte[] imagem;

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNmPessoa() {
		return nmPessoa;
	}

	public void setNmPessoa(String nmPessoa) {
		this.nmPessoa = nmPessoa;
	}

	public Timestamp getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Timestamp dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getDsCpf() {
		return dsCpf;
	}

	public void setDsCpf(String dsCpf) {
		this.dsCpf = dsCpf;
	}

	public Boolean getIdAtivo() {
		return idAtivo;
	}

	public void setIdAtivo(Boolean idAtivo) {
		this.idAtivo = idAtivo;
	}

	public String getTpSexo() {
		return tpSexo;
	}

	public void setTpSexo(String tpSexo) {
		this.tpSexo = tpSexo;
	}

	public Double getVlSalario() {
		return vlSalario;
	}

	public void setVlSalario(Double vlSalario) {
		this.vlSalario = vlSalario;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
}
