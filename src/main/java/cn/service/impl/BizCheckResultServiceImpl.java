package cn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.BizCheckResultDao;
import cn.pojo.BizCheckResult;
import cn.service.BizCheckResultService;

@Service("bizCheckResultService")
public class BizCheckResultServiceImpl implements BizCheckResultService{
	
	@Resource(name="bizCheckResultDao")
	private BizCheckResultDao bizCheckResultDao;
	
	public BizCheckResultDao getBizCheckResultDao() {
		return bizCheckResultDao;
	}

	public void setBizCheckResultDao(BizCheckResultDao bizCheckResultDao) {
		this.bizCheckResultDao = bizCheckResultDao;
	}

	/**
	 *  查询业务检查
	 */
	@Override
	public List<BizCheckResult> getBizCheckResults() {
		return bizCheckResultDao.getBizCheckResults();
	}

}
