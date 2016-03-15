package base;
import java.sql.Connection;

/**
 * Outil de connexion à la base de données
 *
 * @author Peter DAEHNE ‐ HEG‐Genève
 * @version Version 2.2
*/
public class Bases {
/* Effectue la connexion et la retourne en fonction de nomBase:
    . MYSQL  : base de données MySQL "EmplDept"
    . ORACLE : base Oracle HEGLOCAL
    Par défaut: MYSQL  */
public static Connection connect(String nomBase) throws Exception { Connection con;
nomBase = nomBase.toUpperCase();
if (nomBase.startsWith("MY")) {
con = mysql.Outils.connect("EmplDept"); System.out.println("Base de données MySQL \"EmplDept\""); } else if (nomBase.startsWith("OR")) {
con = oracle.Outils.connect("HEGLOCAL"); System.out.println("Base de données Oracle de l'instance \"HEGLOCAL\""); } else {
con = mysql.Outils.connect("EmplDept"); System.out.println("Base de données MySQL \"EmplDept\""); }
  return con;
} // connect
} // Bases