package access;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/**
* Connexion à la base ODBC (Access).
*
* @author Peter DAEHNE ‐ HEG‐Genève
* @version Version 2.1
*/
public class Outils {
/** Retourne une connexion avec une source de données ODBC. */
public static Connection connect (String nomSource) throws ClassNotFoundException, SQLException { Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Properties props = new Properties();
props.put("user", "Administrateur"); props.put("password", ""); props.put("charSet", "ISO‐8859‐1"); return DriverManager.getConnection("jdbc:odbc:" + nomSource, props);
  } // connect
} // Outils