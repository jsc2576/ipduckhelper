package com.ipduckhelper.user;

import java.io.Serializable;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository("User")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7507833310162586607L;
	
	private String mem_id; // 유저 아이디
	private String mem_pwd; // 유저 비밀번호
	private String mem_nick; // 유저 닉네임
	private String mem_nm; // 유저 이름
	private Integer mem_stat; // 유저 상태 (0: 미인증 , 1: 회원, 2: 관리자)
	private boolean acvt = false; // 활성 상태
	
	private MultipartFile upload_img;
	private Integer file_idx; // 파일 인덱스
	private String file_nm;  // 파일 이름
	private String file_path; // 파일 경로
	
	private String pwd_key = null; // 서비스 부분에서 키 값을 입력할 것
	
	private Integer offset;
	
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pwd() {
		return mem_pwd;
	}
	public void setMem_pwd(String mem_pwd) {
		this.mem_pwd = mem_pwd;
	}
	public String getMem_nick() {
		return mem_nick;
	}
	public void setMem_nick(String mem_nick) {
		this.mem_nick = mem_nick;
	}
	public String getMem_nm() {
		return mem_nm;
	}
	public void setMem_nm(String mem_nm) {
		this.mem_nm = mem_nm;
	}
	public Integer getMem_stat() {
		return mem_stat;
	}
	public void setMem_stat(Integer mem_stat) {
		this.mem_stat = mem_stat;
	}
	public boolean isAcvt() {
		return acvt;
	}
	public void setAcvt(boolean acvt) {
		this.acvt = acvt;
	}
	public Integer getFile_idx() {
		return file_idx;
	}
	public void setFile_idx(Integer file_idx) {
		this.file_idx = file_idx;
	}
	public String getFile_nm() {
		return file_nm;
	}
	public void setFile_nm(String file_nm) {
		this.file_nm = file_nm;
	}
	public String getPwd_key() {
		return pwd_key;
	}
	public void setPwd_key(String pwd_key) {
		this.pwd_key = pwd_key;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public MultipartFile getUpload_img() {
		return upload_img;
	}
	public void setUpload_img(MultipartFile upload_img) {
		this.upload_img = upload_img;
	}
}
