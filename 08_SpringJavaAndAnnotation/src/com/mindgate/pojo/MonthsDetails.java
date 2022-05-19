package com.mindgate.pojo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("monthsdetaiks")
@Scope("prototype")
public class MonthsDetails {
	private int monthsId;
	private LocalDate monthsStartDate;
	private LocalDate mothsEndDate;
	@Autowired
	private FinancialYearDetails financialYearDetails;
	
	public MonthsDetails() {
		// TODO Auto-generated constructor stub
	}

	public MonthsDetails(int monthsId, LocalDate monthsStartDate, LocalDate mothsEndDate,
			FinancialYearDetails financialYearDetails) {
		super();
		this.monthsId = monthsId;
		this.monthsStartDate = monthsStartDate;
		this.mothsEndDate = mothsEndDate;
		this.financialYearDetails = financialYearDetails;
	}

	public int getMonthsId() {
		return monthsId;
	}

	public void setMonthsId(int monthsId) {
		this.monthsId = monthsId;
	}

	public LocalDate getMonthsStartDate() {
		return monthsStartDate;
	}

	public void setMonthsStartDate(LocalDate monthsStartDate) {
		this.monthsStartDate = monthsStartDate;
	}

	public LocalDate getMothsEndDate() {
		return mothsEndDate;
	}

	public void setMothsEndDate(LocalDate mothsEndDate) {
		this.mothsEndDate = mothsEndDate;
	}

	public FinancialYearDetails getFinancialYearDetails() {
		return financialYearDetails;
	}

	public void setFinancialYearDetails(FinancialYearDetails financialYearDetails) {
		this.financialYearDetails = financialYearDetails;
	}

	@Override
	public String toString() {
		return "MonthsDetails [monthsId=" + monthsId + ", monthsStartDate=" + monthsStartDate + ", mothsEndDate="
				+ mothsEndDate + ", financialYearDetails=" + financialYearDetails + "]";
	}
	
	
}
