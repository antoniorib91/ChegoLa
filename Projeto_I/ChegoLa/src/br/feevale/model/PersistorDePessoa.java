package br.feevale.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.feevale.FevasDB.Conexao;
import br.feevale.FevasDB.PoolDeConexoes;

public class PersistorDePessoa {
	
	private Pessoa pessoa;
	
	public PersistorDePessoa( Pessoa pessoa ) {
		this.pessoa = pessoa;
	}
	
	public void insere() throws SQLException {

		Conexao con = PoolDeConexoes.getInstance().getConexao();

		try {

			StringBuilder cmd = new StringBuilder();
			cmd.append( "insert into Pessoa " );
			cmd.append( "( idPessoa, nmPessoa, dtNascimento, dsCPF, idAtivo, tpSexo, vlSalario )" );
			cmd.append( " values " );
			cmd.append( "( ?, ?, ?, ?, ?, ?, ? );" );
			
			PreparedStatement ps = con.getConnection().prepareStatement( cmd.toString() );
			ps.setInt( 1, pessoa.getIdPessoa() );
			ps.setString( 2, pessoa.getNmPessoa() );
			ps.setTimestamp( 3, pessoa.getDtNascimento() );
			ps.setString( 4, pessoa.getDsCpf() );
			ps.setBoolean( 5, pessoa.getIdAtivo() );
			ps.setString( 6, pessoa.getTpSexo() );
			ps.setDouble( 7, pessoa.getVlSalario() );
			
			ps.execute();
			
		} finally {
			con.libera();
		}
	}
	
	public void altera() {
		
	}
	
	public void exclui() {
		
	}
}