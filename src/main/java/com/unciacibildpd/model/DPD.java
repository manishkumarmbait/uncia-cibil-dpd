package com.unciacibildpd.model;

import java.util.Date;

public class DPD {

	private Integer defaultDays;
	private Date reportingDate;
	private Boolean ruleValidation;

	public DPD() {
	}

	public DPD(Integer defaultDays, Date reportingDate, Boolean ruleValidation) {
		this.defaultDays = defaultDays;
		this.reportingDate = reportingDate;
		this.ruleValidation = ruleValidation;
	}

	public Integer getDefaultDays() {
		return defaultDays;
	}

	public void setDefaultDays(Integer defaultDays) {
		this.defaultDays = defaultDays;
	}

	public Date getReportingDate() {
		return reportingDate;
	}

	public void setReportingDate(Date reportingDate) {
		this.reportingDate = reportingDate;
	}

	public Boolean getRuleValidation() {
		return ruleValidation;
	}

	public void setRuleValidation(Boolean ruleValidation) {
		this.ruleValidation = ruleValidation;
	}

}
