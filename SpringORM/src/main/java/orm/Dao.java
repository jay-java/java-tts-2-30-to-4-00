package orm;

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
	public void insertUser(Model m) {
		this.hibernateTemplate.saveOrUpdate(m);
	}
	
	public Model getModelById(int id) {
		return this.hibernateTemplate.get(Model.class, id);
	}

	public List<Model> getAllModel(){
		return this.hibernateTemplate.loadAll(Model.class);
	}
	@Transactional
	public void deleteModel(int id) {
		Model m = this.hibernateTemplate.get(Model.class, id);
		this.hibernateTemplate.delete(m);
	}
}
