package com.springmvc.dao;

import java.util.List;

import com.springmvc.entity.TaiKhoan;

public interface TaiKhoanDAO {
	public boolean add(TaiKhoan tk);
	public boolean edit(TaiKhoan tk);
	public boolean delete(TaiKhoan tk);
	public TaiKhoan getTaiKhoan(String username);
	public List<TaiKhoan> getAll();
}
