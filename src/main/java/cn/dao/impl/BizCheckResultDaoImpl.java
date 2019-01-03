package cn.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import cn.dao.BizCheckResultDao;
import cn.pojo.BizCheckResult;

@Repository("bizCheckResultDao")
public class BizCheckResultDaoImpl extends HibernateDaoSupport implements BizCheckResultDao{

	@Autowired
	public BizCheckResultDaoImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory){
		this.setSessionFactory(sessionFactory);
	}
	
	/**
	 * 查询业务检查
	 */
	@Override
	public List<BizCheckResult> getBizCheckResults() {
		return this.getHibernateTemplate().find("from BizCheckResult ");
	}

}
