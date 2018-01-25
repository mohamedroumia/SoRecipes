package persistence.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Utente;
import persistence.DataSource;
import persistence.PersistenceException;

public class UtenteConPassword extends Utente {
	
	private DataSource dataSource;
	
	public UtenteConPassword(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public String getPassword() {						
		Connection connection = this.dataSource.getConnection();
		try {
			PreparedStatement statement;
			String query = "select * from utente where email = ?";
			statement = connection.prepareStatement(query);
			statement.setString(1, this.getEmail());
			ResultSet result = statement.executeQuery();
			if (result.next()) {
				return result.getString("password");
			}
		} catch (SQLException e) {
			throw new PersistenceException(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new PersistenceException(e.getMessage());
			}
		}	
		return null;
	}

}