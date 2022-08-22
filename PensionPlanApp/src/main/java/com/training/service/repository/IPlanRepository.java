package com.training.service.repository;

import java.util.List;

import com.training.model.Plan;

public interface IPlanRepository {

	void addPlan(Plan plan);
	void deletePlan(int policyId);
	void updatePlan(int policyId,String plans);
	
	List<Plan> findAll();
	List<Plan> findByPlans(String plans);
	List<Plan> findByPolicyId(int policyId);
	List<Plan> findByAge(int Age);
	List<Plan> findByVestingAge(int vestingAge);
	List<Plan> findByPolicyTerm(int PolicyTerm);
	List<Plan> findByPremium(double Premium);
	List<Plan> findBySumAssured(double sumAssured);
	
}
