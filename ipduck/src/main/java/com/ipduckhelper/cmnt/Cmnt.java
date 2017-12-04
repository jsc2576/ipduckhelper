package com.ipduckhelper.cmnt;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository("Cmnt")
public class Cmnt implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3036171478458610773L;

	private Integer cmnt_idx;
	private String cmnt_con;
	private String cmnt_date;
	private Integer post_idx;
	private String mem_id;
	private Integer high_cmnt_idx;
	
	private Integer offset;
	
	public Integer getCmnt_idx() {
		return cmnt_idx;
	}
	public void setCmnt_idx(Integer cmnt_idx) {
		this.cmnt_idx = cmnt_idx;
	}
	public String getCmnt_con() {
		return cmnt_con;
	}
	public void setCmnt_con(String cmnt_con) {
		this.cmnt_con = cmnt_con;
	}
	public String getCmnt_date() {
		return cmnt_date;
	}
	public void setCmnt_date(String cmnt_date) {
		this.cmnt_date = cmnt_date;
	}
	public Integer getPost_idx() {
		return post_idx;
	}
	public void setPost_idx(Integer post_idx) {
		this.post_idx = post_idx;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public Integer getHigh_cmnt_idx() {
		return high_cmnt_idx;
	}
	public void setHigh_cmnt_idx(Integer high_cmnt_idx) {
		this.high_cmnt_idx = high_cmnt_idx;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	
}
