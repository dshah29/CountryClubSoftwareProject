package com.ssdi.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name ="MemberActivity")
public class ActivityMember {
	@EmbeddedId
	private ActivityMemberPrimaryKey pk;

	public ActivityMemberPrimaryKey getPk() {
		return pk;
	}

	public void setPk(ActivityMemberPrimaryKey pk) {
		this.pk = pk;
	}
	
	
}
