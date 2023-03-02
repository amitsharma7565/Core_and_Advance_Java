package springWebMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springWebMVC.Model.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional //for dml operations on database
	public void addUser(User user) {
		this.hibernateTemplate.saveOrUpdate(user);
	}
	
	public List<User> getAllUsers(){
		List<User> list=new ArrayList<User>();
		list=this.hibernateTemplate.loadAll(User.class);
		return list;
	}
	public User getUserById(int id){
		
		User u=this.hibernateTemplate.get(User.class, id);
		return u;
	}
	
	@Transactional //for dml operations on database
	public void delete(int id) {
		User u=this.hibernateTemplate.get(User.class, id);
		this.hibernateTemplate.delete(u);
	}
	@Transactional //for dml operations on database
	public void update(User user) {
		
		this.hibernateTemplate.update(user);
	}
	
	
	
	
}
