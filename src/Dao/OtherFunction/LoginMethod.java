package Dao.OtherFunction;

import Dao.member.ImplMember;
import Module.Member;

public class LoginMethod {
	public static boolean login(String username, String pwd) {
		Member m = new ImplMember().queryUsername(username);
		String mp = m.getPassword();
		boolean result = false;
		if (m != null && pwdBcrypt.pwdCheck(pwd, mp)) {
			result = pwdBcrypt.pwdCheck(pwd, mp);
		} else {
			System.out.println("p error2");
			System.out.println(m.getPassword());
		}

		System.out.println(result);
		return result;
	}
}
