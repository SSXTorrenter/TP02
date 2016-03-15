package oracle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/**
* Connexion à la base Oracle.
*
* @author Peter DAEHNE ‐ HEG‐Genève
* @version Version 2.1
*/
public class Outils {
/** Retourne une connexion avec une intstance d'Oracle. */
public static Connection connect (String nomInstance) throws ClassNotFoundException, SQLException { Class.forName("oracle.jdbc.OracleDriver");
Properties props = new Properties();
props.put("user", "system"); props.put("password", "manager");
return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:" + nomInstance, props); } // connect
} // Outils