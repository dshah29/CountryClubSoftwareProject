package com.ssdi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssdi.model.ActivityMember;
import com.ssdi.model.Member;
import com.ssdi.model.MemberLogin;
@Repository("memberLoginDao")
public interface MemberLoginDao extends JpaRepository<MemberLogin, String>{
	public boolean existsByToken(String token);
	 MemberLogin findByToken(String token);
}
