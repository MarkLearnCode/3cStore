package Dao.member;

import java.util.List;

import Module.Member;

public interface MemberDaO {
	// create
	void add(Member m);

	// read
	String queryAll();

	List<Member> queryAllList();

	Member queryUsername(String username);
	
	boolean ckeckUsername(String username);

	// update
	void update(Member m);

	void updatePwd(Member m);

	// delete
	void delete(String username);
}
