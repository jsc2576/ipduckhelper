package com.ipduckhelper.tag;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository("Tag")
public class Tag implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7410666715551436454L;

	
	private String tag_nm;


	public String getTag_nm() {
		return tag_nm;
	}


	public void setTag_nm(String tag_nm) {
		this.tag_nm = tag_nm;
	}
	
	
}
