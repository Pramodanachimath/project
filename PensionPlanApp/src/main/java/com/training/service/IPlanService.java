package com.training.service;

import java.util.List;

import com.training.model.Plan;

public interface IPlanService {

	void addPlan(Plan plan);
	void deletePlan(int policyId);
	void updatePlan(int policyId,String plans);
	
	List<Plan> getAll();
	List<Plan> getByPlans(String plans);
	List<Plan> getByPolicyId(int policyId);
	List<Plan> getByAge(int Age);
	List<Plan> getByVestingAge(int vestingAge);
	List<Plan> getByPolicyTerm(int PolicyTerm);
	List<Plan> getByPremium(double Premium);
	List<Plan> getBySumAssured(double sumAssured);
}
