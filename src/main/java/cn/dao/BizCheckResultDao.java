package cn.dao;

import java.util.List;

import cn.pojo.BizCheckResult;

public interface BizCheckResultDao {

	/**
	 * 查询业务检查
	 * @return
	 */
	public List<BizCheckResult> getBizCheckResults();
}
