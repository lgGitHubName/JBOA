package cn.service;

import java.util.List;

import cn.pojo.BizCheckResult;

public interface BizCheckResultService {

	/**
	 * 查询业务检查
	 * @return
	 */
	public List<BizCheckResult> getBizCheckResults();
}
