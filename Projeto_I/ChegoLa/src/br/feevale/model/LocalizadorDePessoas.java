package br.feevale.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import br.feevale.FevasDB.Conexao;
import br.feevale.FevasDB.FevasDBException;
import br.feevale.FevasDB.PoolDeConexoes;

public class LocalizadorDePessoas {

	public static void main(String[] args) throws SQLException {
		
		String cmd = "Select idPessoa, nmPessoa from pessoa where tpSexo = 'M'";
		
		Conexao cnx = PoolDeConexoes.getInstance().getConexao();
		
		try {
			LocalizadorDePessoas lp = new LocalizadorDePessoas();
			Pessoa p = lp.buscaPessoa( 17 );
			
			if( p != null ) {
				System.out.println( "Encontrei: " + p.getNmPessoa() );
			} else {
				System.out.println( "Não encontrei a pessoa" );
			}
			
//			Statement sts = cnx.getConnection().createStatement();
//			sts.execute( "select * from pessoa" );
//			
//			ResultSet rs = sts.getResultSet();
//			
//			if( rs.next() ) {
//				
//				while( !rs.isAfterLast() ) {
//					Integer id = rs.getInt( 1 );
//					String nome = rs.getString( 2 );
//					
//					System.out.println( id + ": " + nome );
//					rs.next();
//				}
//				
//				
//
//			} else {
//				System.out.println( "Sem registros no select");
//			}
//			
			
		} finally {
			cnx.libera();
		}
	}
	
	public Pessoa buscaPessoa( Integer idPessoa ) throws SQLException {
		
		String cmd = "Select idPessoa, nmPessoa, dtNascimento, dsCpf, idAtivo, tpSexo, vlSalario, imagem from pessoa where idPessoa = ?";
		
		Conexao cnx = PoolDeConexoes.getInstance().getConexao();
		
		try {
			PreparedStatement st = cnx.getConnection().prepareStatement( cmd );
			st.setInt( 1, idPessoa );
			st.execute();
			
			ResultSet rs = st.getResultSet();
			
			if( rs.next() ) {
				
				Pessoa p = new Pessoa();
				p.setIdPessoa( rs.getInt( 1 ) );
				p.setNmPessoa( rs.getString( 2 ) );
				p.setDtNascimento( rs.getTimestamp( 3 ) );
				p.setDsCpf( rs.getString( 4 ) );
				p.setIdAtivo( rs.getBoolean( 5 ) );
				p.setTpSexo( rs.getString( 6 ) );
				p.setVlSalario( rs.getDouble( 7 ) );
				p.setImagem( rs.getBytes( 8 ) );
				
				return p;
			} else {
				return null;
			}
			
			
		} finally {
			cnx.libera();
		}
	}

	public Pessoa buscaPessoaOrThrow( Integer idPessoa ) throws FevasDBException, SQLException {
		
		Pessoa result = buscaPessoa( idPessoa );
		
		if( result != null ) {
			return result;
		}
		
		throw new FevasDBException( "Não Encontrei Pessoa com id: " + idPessoa );
	}
	
	public List<Pessoa> getPessoas( String condicao ) {
		Vector<Pessoa> lista= new Vector<Pessoa>();

		String cmd = "Select idPessoa, nmPessoa, dtNascimento, dsCpf, idAtivo, tpSexo, vlSalario, imagem from pessoa where " + condicao;
		
		return lista;
	}
}





























