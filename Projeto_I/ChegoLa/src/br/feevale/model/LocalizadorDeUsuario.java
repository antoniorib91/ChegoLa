package br.feevale.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.feevale.FevasDB.Conexao;
import br.feevale.FevasDB.FevasDBException;
import br.feevale.FevasDB.PoolDeConexoes;

public class LocalizadorDeUsuario {
	
	public Usuario buscaUsuario( String nomeLogin ) throws SQLException {
		
		String cmd = "Select idUsuario, nomeLogin, infoSenha, nomeCompleto, dataNascimento from progiii.usuarios where nomeLogin = ?";
		Conexao cnx = PoolDeConexoes.getInstance().getConexao();
		
		try {
			PreparedStatement st = cnx.getConnection().prepareStatement( cmd );
			st.setString( 1, nomeLogin );
			st.execute();
			
			ResultSet rs = st.getResultSet();
			
			if( rs.next() ) {
				return carregaUsuario( rs );
			} else {
				return null;
			}
		} finally {
			cnx.libera();
		}
	}

	public Usuario buscaUsuario( Integer idUsuario ) throws SQLException {
		
		String cmd = "Select idUsuario, nomeLogin, infoSenha, nomeCompleto, dataNascimento from progiii.usuarios where idUsuario = ?";
		Conexao cnx = PoolDeConexoes.getInstance().getConexao();
		
		try {
			PreparedStatement st = cnx.getConnection().prepareStatement( cmd );
			st.setInt( 1, idUsuario );
			st.execute();
			
			ResultSet rs = st.getResultSet();
			
			if( rs.next() ) {
				return carregaUsuario( rs );
			} else {
				return null;
			}
		} finally {
			cnx.libera();
		}
	}

	private Usuario carregaUsuario( ResultSet rs ) throws SQLException {

		Usuario u = new Usuario();
		u.setIdUsuario( rs.getInt( 1 ) );
		u.setNomeLogin( rs.getString( 2 ) );
		u.setInfoSenha( rs.getString( 3 ) );
		u.setNomeCompleto( rs.getString( 4 ) );
		u.setDataNascimento( rs.getTimestamp( 5 ) );
		
		return u;
	}

	public Usuario buscaUsuarioOrThrow( Integer idUsuario ) throws FevasDBException, SQLException {
		
		Usuario result = buscaUsuario( idUsuario );
		
		if( result != null ) {
			return result;
		}
		
		throw new FevasDBException( "Não Encontrei Usuario com id: " + idUsuario );
	}
	
	public List<Usuario> getUsuarios( String condicao ) throws SQLException {

		ArrayList<Usuario> lista= new ArrayList<Usuario>();
		String cmd = "Select idUsuario, nomeLogin, infoSenha, nomeCompleto, dataNascimento from progiii.usuarios where " + condicao;
		
		Conexao cnx = PoolDeConexoes.getInstance().getConexao();
		
		try {
			PreparedStatement ps = cnx.getConnection().prepareStatement( cmd );
			ResultSet rs = ps.executeQuery();
			
			while( rs.next() ) {
				lista.add( carregaUsuario( rs ) );
			}
			
		} finally {
			cnx.libera();
		}
		
		return lista;
	}

}