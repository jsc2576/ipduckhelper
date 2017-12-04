package com.ipduckhelper.sche;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository("Sche")
public class Sche implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2840624353799506515L;

	private Integer sche_idx;
	private String sche_nm;
	private String sche_date;
	private Integer sche_trm;
	private Integer star_idx;
	private String mem_id;
	
	public Integer getSche_idx() {
		return sche_idx;
	}
	public void setSche_idx(Integer sche_idx) {
		this.sche_idx = sche_idx;
	}
	public String getSche_nm() {
		return sche_nm;
	}
	public void setSche_nm(String sche_nm) {
		this.sche_nm = sche_nm;
	}
	public String getSche_date() {
		return sche_date;
	}
	public void setSche_date(String sche_date) {
		this.sche_date = sche_date;
	}
	public Integer getSche_trm() {
		return sche_trm;
	}
	public void setSche_trm(Integer sche_trm) {
		this.sche_trm = sche_trm;
	}
	public Integer getStar_idx() {
		return star_idx;
	}
	public void setStar_idx(Integer star_idx) {
		this.star_idx = star_idx;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
