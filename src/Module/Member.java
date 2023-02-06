package Module;

import Dao.OtherFunction.pwdBcrypt;

public class Member {
	private Integer id;
	private String username;
	private String password;
	private String email;
	private String name;
	private String phone;
	private String address;

	public Member() {
		super();
	}

	public Member(String username, String password, String email, String name, String phone, String address) {
		super();
		this.username = username;
		this.password = pwdBcrypt.pwdHash(password);
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = pwdBcrypt.pwdHash(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
