package com.training.service;

import java.util.List;

import com.training.model.Plan;
import com.training.service.repository.IPlanRepository;
import com.training.service.repository.PlanRepositoryImpl;

public class PlanServiceImpl implements IPlanService {

	IPlanRepository iPlanRepository=new PlanRepositoryImpl();
	public void addPlan(Plan plan) {

		iPlanRepository.addPlan(plan);
	}

	public void deletePlan(int policyId) {
		// TODO Auto-generated method stub

	}

	public void updatePlan(int policyId, String plans) {
		// TODO Auto-generated method stub

	}

	public List<Plan> getAll() {
		return iPlanRepository.findAll();
	}

	public List<Plan> getByPlans(String plans) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Plan> getByPolicyId(int policyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Plan> getByAge(int Age) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Plan> getByVestingAge(int vestingAge) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Plan> getByPolicyTerm(int PolicyTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Plan> getByPremium(double Premium) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Plan> getBySumAssured(double sumAssured) {
		// TODO Auto-generated method stub
		return null;
	}

}
