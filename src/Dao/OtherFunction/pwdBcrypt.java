package Dao.OtherFunction;

import org.mindrot.jbcrypt.BCrypt;

public class pwdBcrypt {
	public static String pwdHash(String pwd) {
		pwd = BCrypt.hashpw(pwd, BCrypt.gensalt());
		return pwd;
	}

	public static boolean pwdCheck(String inputPwd, String sqlPwd) {
		boolean check = BCrypt.checkpw(inputPwd, sqlPwd);

		return check;
	}
}
