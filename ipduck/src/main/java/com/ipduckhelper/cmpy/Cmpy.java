package com.ipduckhelper.cmpy;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository("Cmpy")
public class Cmpy implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3641899304496336362L;

	private String cmpy_nm; // 기획사 이름
	private String cmpy_rep; // 기획사 대표
	private String file_idx; // 로고 인덱스
	
	private String file_nm; // 파일 이름
	private String file_path; // 파일 경로
	
	private Integer offset; // offset
	
	public String getCmpy_nm() {
		return cmpy_nm;
	}
	public void setCmpy_nm(String cmpy_nm) {
		this.cmpy_nm = cmpy_nm;
	}
	public String getCmpy_rep() {
		return cmpy_rep;
	}
	public void setCmpy_rep(String cmpy_rep) {
		this.cmpy_rep = cmpy_rep;
	}
	public String getFile_idx() {
		return file_idx;
	}
	public void setFile_idx(String file_idx) {
		this.file_idx = file_idx;
	}
	public String getFile_nm() {
		return file_nm;
	}
	public void setFile_nm(String file_nm) {
		this.file_nm = file_nm;
	}
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
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
