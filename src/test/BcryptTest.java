package test;

import Dao.OtherFunction.pwdBcrypt;

public class BcryptTest {

	public static void main(String[] args) {
		String pwd = "aaa";
		String hp = pwdBcrypt.pwdHash(pwd);
		System.out.println(pwdBcrypt.pwdHash(pwd));

		System.out.println(pwdBcrypt.pwdCheck("ccc", hp));
	}

}
