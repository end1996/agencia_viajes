package agenciaviajes;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public final class ConexionOracle {

    private Connection cn = null;
    private String url, user, pass;

   // public ConexionOracle() {
        //conectar();
    //}

    public Connection conectar() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            url = "jdbc:oracle:thin:@localhost:1521:XE";
            user = "\"user_agencia\"";
            pass = "123";
            cn = DriverManager.getConnection(url, user, pass);
            System.out.println("¡Conectado exitosamente!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error,no se pudo establecer la conexión" + e);
        }
        return cn;
    }
        
    public Connection desconectar() {
        try {
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al realizar la desconexión" + e);
        }
        return cn;
    }

}

