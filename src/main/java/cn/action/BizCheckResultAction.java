package cn.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.pojo.BizCheckResult;
import cn.service.BizCheckResultService;

@Controller("bizCheckResultAction")
public class BizCheckResultAction extends ActionSupport{

	private List<BizCheckResult> bizCheckResults;
	
	@Resource(name="bizCheckResultService")
	private BizCheckResultService bizCheckResultService;
	
	public List<BizCheckResult> getBizCheckResults() {
		return bizCheckResults;
	}

	public void setBizCheckResults(List<BizCheckResult> bizCheckResults) {
		this.bizCheckResults = bizCheckResults;
	}

	public BizCheckResultService getBizCheckResultService() {
		return bizCheckResultService;
	}

	public void setBizCheckResultService(BizCheckResultService bizCheckResultService) {
		this.bizCheckResultService = bizCheckResultService;
	}

	@Override
	public String execute() throws Exception{
		bizCheckResults=bizCheckResultService.getBizCheckResults();
		System.out.println(bizCheckResults.size());
		return SUCCESS;
	}
}
