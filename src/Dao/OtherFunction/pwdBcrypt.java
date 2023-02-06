package Dao.OtherFunction;

import org.mindrot.jbcrypt.BCrypt;

public class pwdBcrypt {
	public static String pwdHash(String pwd) {
		pwd = BCrypt.hashpw(pwd, BCrypt.gensalt(11));
		return pwd;
	}

	public static boolean pwdCheck(String inputPwd, String outputPwd) {
		boolean check = BCrypt.checkpw(inputPwd, outputPwd);

		return check;
	}
}
