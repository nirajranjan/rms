package com.basic.rms.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.basic.rms.dao.util.HibernateUtil;
import com.basic.rms.pojo.AuthenticationPojo;

@Repository
public class AuthanticationDaoImpl implements AuthanticationDAO{

	private final Logger logger = Logger.getLogger(AuthanticationDaoImpl.class);
	
	public List<AuthenticationPojo> getAuthanticationData(String uname, String pwd) {
		List<Object[]> qList = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session =sessionFactory.openSession();
		List<AuthenticationPojo>resultList = null;
		try {
			String sql = "select * from authentication where log_pwd = ? and e_code= ?";
			Query query = session.createSQLQuery(sql).setString(0, pwd).setString(1, uname);
			qList = query.list();
			resultList = new ArrayList<AuthenticationPojo>();
			for(Object[] row : qList){
				AuthenticationPojo pojo = new AuthenticationPojo();
			    pojo.setRole(row[0].toString());
			    pojo.setCode(row[2].toString());
			    pojo.setPassword(row[1].toString());
			    resultList.add(pojo);
			}
			System.out.println("user List : " + resultList);
		} catch (Exception e) {
			logger.info("Error to get login list");
		} finally {
			if(session != null){
				session.close();
			}
		}
		
		return resultList;
	}

}
