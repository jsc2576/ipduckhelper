package com.ipduckhelper.meme;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("Meme")
public class Meme implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2839667744380797085L;

	private Integer mm_idx; // 밈 인덱스
	private Integer mm_hit_cnt; // 밈 조회수
	private Integer file_idx; // 파일 인덱스
	private String mem_id; // 작성자 아이디
	
	private String file_nm; // 파일 이름
	private String file_path; // 파일 경로
	private String file_crt_date;
	
	private List<String> star_idx_list; // 연예인 인덱스 리스트

	private String tag_nm; // 태그 이름
	
	private Integer offset;
	
	public Integer getMm_idx() {
		return mm_idx;
	}

	public void setMm_idx(Integer mm_idx) {
		this.mm_idx = mm_idx;
	}

	public Integer getMm_hit_cnt() {
		return mm_hit_cnt;
	}

	public void setMm_hit_cnt(Integer mm_hit_cnt) {
		this.mm_hit_cnt = mm_hit_cnt;
	}

	public Integer getFile_idx() {
		return file_idx;
	}

	public void setFile_idx(Integer file_idx) {
		this.file_idx = file_idx;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
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

	public List<String> getStar_idx_list() {
		return star_idx_list;
	}

	public void setStar_idx_list(List<String> star_idx_list) {
		this.star_idx_list = star_idx_list;
	}

	public String getTag_nm() {
		return tag_nm;
	}

	public void setTag_nm(String tag_nm) {
		this.tag_nm = tag_nm;
	}

	public String getFile_crt_date() {
		return file_crt_date;
	}

	public void setFile_crt_date(String file_crt_date) {
		this.file_crt_date = file_crt_date;
	}
}
