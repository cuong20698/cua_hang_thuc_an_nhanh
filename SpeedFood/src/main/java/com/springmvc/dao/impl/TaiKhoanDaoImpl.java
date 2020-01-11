package com.springmvc.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.hql.ast.tree.SessionFactoryAwareNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.dao.TaiKhoanDAO;
import com.springmvc.entity.TaiKhoan;

@Repository
public class TaiKhoanDaoImpl implements TaiKhoanDAO{

	@Autowired
	private SessionFactory session;
	
	@Override
	public boolean add(TaiKhoan tk) {
		session.getCurrentSession().save(tk);
		return true;
	}

	@Override
	public boolean edit(TaiKhoan tk) {
		session.getCurrentSession().update(tk);
		return true;
	}

	@Override
	public boolean delete(TaiKhoan tk) {
		session.getCurrentSession().delete(tk);
		return true;
	}

	@Override
	public TaiKhoan getTaiKhoan(String username) {
		List<TaiKhoan> list = session.getCurrentSession().createQuery("from TaiKhoan where username= ?").setParameter(0,username).list();
		TaiKhoan tk = new TaiKhoan();
		if(list.size() > 0) {
			tk = list.get(0);
		}
		return tk;
	}

	@Override
	public List<TaiKhoan> getAll() {
		return session.getCurrentSession().createQuery("from TaiKhoan").list();
	}
	
	
}
