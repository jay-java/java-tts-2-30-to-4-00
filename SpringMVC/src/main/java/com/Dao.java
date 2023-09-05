package com;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class Dao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void insertUpdteUser(User u) {
		this.hibernateTemplate.saveOrUpdate(u);
	}
	
	public User getUserById(int id) {
		User u = this.hibernateTemplate.get(User.class, id);
		return u;
	}
	
	public List<User> getAllUser(){
		return this.hibernateTemplate.loadAll(User.class);
	}
	
	@Transactional
	public void deleteUser(int id) {
		User u = this.hibernateTemplate.get(User.class, id);
		this.hibernateTemplate.delete(u);
	}
}
