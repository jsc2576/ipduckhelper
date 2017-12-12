package com.ipduckhelper.star;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository("Star")
public class Star implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7287598313606673342L;
	
	private String mem_id; // 회원 아이디
	
	private Integer star_idx; // 연예인 인덱
	private String star_nm; // 연예인 이름
	private Integer star_typ; // 0: GRP, 1: STAR
	private String star_dbt_date; // 연예인 데뷔 날짜
	private String cmpy_nm; // 소속사 이름
	private Integer file_idx; // 대표 사진 인덱스
	
	private MultipartFile upload_img; // 업로드 이미지
	private String file_nm; // 사진 이름
	private String file_path; // 사진 경로
	
	private Integer star_mem_idx; // 연예인 멤버 인덱
	private Integer star_mem_hght; // 연예인 멤버 키
	private Integer star_mem_bld;  // 연예인 혈액형 (0: A, 1: AB, 2: B, 3: O)
	private Integer star_mem_wght; // 연예인 멤버 몸무게
	private String star_mem_birth; // 연예인 멤버 생일
	
	private Integer grp_idx; // 그룹 인덱스
	private String clb_site; // 팬클럽 사이트
	
	private Integer offset;
	
	private String tag_nm;
	private List<String> tag_nm_list;
	
	public Integer getStar_mem_idx() {
		return star_mem_idx;
	}
	public void setStar_mem_idx(Integer star_mem_idx) {
		this.star_mem_idx = star_mem_idx;
	}
	public Integer getStar_mem_hght() {
		return star_mem_hght;
	}
	public void setStar_mem_hght(Integer star_mem_hght) {
		this.star_mem_hght = star_mem_hght;
	}
	public Integer getStar_mem_bld() {
		return star_mem_bld;
	}
	public void setStar_mem_bld(Integer star_mem_bld) {
		this.star_mem_bld = star_mem_bld;
	}
	public Integer getStar_mem_wght() {
		return star_mem_wght;
	}
	public void setStar_mem_wght(Integer star_mem_wght) {
		this.star_mem_wght = star_mem_wght;
	}
	public String getStar_mem_birth() {
		return star_mem_birth;
	}
	public void setStar_mem_birth(String star_mem_birth) {
		this.star_mem_birth = star_mem_birth;
	}
	public Integer getGrp_idx() {
		return grp_idx;
	}
	public void setGrp_idx(Integer grp_idx) {
		this.grp_idx = grp_idx;
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
	public Integer getStar_idx() {
		return star_idx;
	}
	public void setStar_idx(Integer star_idx) {
		this.star_idx = star_idx;
	}
	public String getStar_nm() {
		return star_nm;
	}
	public void setStar_nm(String star_nm) {
		this.star_nm = star_nm;
	}
	public Integer getStar_typ() {
		return star_typ;
	}
	public void setStar_typ(Integer star_typ) {
		this.star_typ = star_typ;
	}
	public String getStar_dbt_date() {
		return star_dbt_date;
	}
	public void setStar_dbt_date(String star_dbt_date) {
		this.star_dbt_date = star_dbt_date;
	}
	public String getCmpy_nm() {
		return cmpy_nm;
	}
	public void setCmpy_nm(String cmpy_nm) {
		this.cmpy_nm = cmpy_nm;
	}
	public Integer getFile_idx() {
		return file_idx;
	}
	public void setFile_idx(Integer file_idx) {
		this.file_idx = file_idx;
	}
	public String getClb_site() {
		return clb_site;
	}
	public void setClb_site(String clb_site) {
		this.clb_site = clb_site;
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
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public List<String> getTag_nm_list() {
		return tag_nm_list;
	}
	public void setTag_nm_list(List<String> tag_nm_list) {
		this.tag_nm_list = tag_nm_list;
	}
}
