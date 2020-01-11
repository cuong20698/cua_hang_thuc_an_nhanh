package com.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.dao.TaiKhoanDAO;
import com.springmvc.entity.TaiKhoan;
import com.springmvc.service.TaiKhoanService;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService{

	@Autowired
	private TaiKhoanDAO dao;
	
	@Transactional
	public boolean add(TaiKhoan tk) {
		dao.add(tk);
		return true;
	}

	@Transactional
	public boolean edit(TaiKhoan tk) {
		dao.edit(tk);
		return true;
	}

	@Transactional
	public boolean delete(TaiKhoan tk) {
		dao.delete(tk);
		return true;
	}

	@Transactional
	public TaiKhoan getTaiKhoan(String username) {
		return dao.getTaiKhoan(username);
	}

	@Transactional
	public List<TaiKhoan> getAll() {
		return dao.getAll();
	}

}
