package com.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Generated Jan 10, 2020 11:43:09 PM by Hibernate Tools 5.4.7.Final

/**
 * Nguoidung generated by hbm2java
 */
@Entity
@Table(name = "nguoidung")
public class Nguoidung implements java.io.Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "tendn")
	private String tenNd;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "diachi")
	private String diaChi;
	
	@Column(name = "sdt")
	private String sdt;
	
	@Column(name = "idgroup")
	private Integer idgroup;
	
	@Column(name = "hoatdong")
	private Boolean hoatDong;

	public Nguoidung() {
	}

	public Nguoidung(String userName, String password, String tenNd, String email, String diaChi, String sdt,
			Integer idgroup, Boolean hoatDong) {
		this.userName = userName;
		this.password = password;
		this.tenNd = tenNd;
		this.email = email;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.idgroup = idgroup;
		this.hoatDong = hoatDong;
	}

	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getTenNd() {
		return this.tenNd;
	}

	public void setTenNd(String tenNd) {
		this.tenNd = tenNd;
	}

	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	
	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	
	public Integer getIdgroup() {
		return this.idgroup;
	}

	public void setIdgroup(Integer idgroup) {
		this.idgroup = idgroup;
	}

	
	public Boolean getHoatDong() {
		return this.hoatDong;
	}

	public void setHoatDong(Boolean hoatDong) {
		this.hoatDong = hoatDong;
	}

}
