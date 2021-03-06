package com.ipduckhelper.post;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository("Post")
public class Post implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1178571964923647782L;

	private Integer post_idx;
	private String mem_id;
	private Integer star_idx;
	private String post_ttl;
	private String post_date;
	private String post_con;
	private Integer post_hit_cnt;
	
	private List<String> tag_nm_list;
	private String tag_nm;
	
	private MultipartFile upload_img;
	
	private String file_nm;
	private String file_path;
	private String file_crt_date;
	
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
	public String getFile_crt_date() {
		return file_crt_date;
	}
	public void setFile_crt_date(String file_crt_date) {
		this.file_crt_date = file_crt_date;
	}
	private Integer offset;
	
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
	public Integer getStar_idx() {
		return star_idx;
	}
	public void setStar_idx(Integer star_idx) {
		this.star_idx = star_idx;
	}
	public String getPost_ttl() {
		return post_ttl;
	}
	public void setPost_ttl(String post_ttl) {
		this.post_ttl = post_ttl;
	}
	public String getPost_date() {
		return post_date;
	}
	public void setPost_date(String post_date) {
		this.post_date = post_date;
	}
	public String getPost_con() {
		return post_con;
	}
	public void setPost_con(String post_con) {
		this.post_con = post_con;
	}
	public Integer getPost_hit_cnt() {
		return post_hit_cnt;
	}
	public void setPost_hit_cnt(Integer post_hit_cnt) {
		this.post_hit_cnt = post_hit_cnt;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<String> getTag_nm_list() {
		return tag_nm_list;
	}
	public void setTag_nm_list(List<String> tag_nm_list) {
		this.tag_nm_list = tag_nm_list;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public String getTag_nm() {
		return tag_nm;
	}
	public void setTag_nm(String tag_nm) {
		this.tag_nm = tag_nm;
	}
	public MultipartFile getUpload_img() {
		return upload_img;
	}
	public void setUpload_img(MultipartFile upload_img) {
		this.upload_img = upload_img;
	}
}
