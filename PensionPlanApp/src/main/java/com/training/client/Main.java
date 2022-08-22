package com.training.client;

import com.training.model.Plan;
import com.training.service.IPlanService;
import com.training.service.PlanServiceImpl;

public class Main {

	public static void main(String[] args) {

		IPlanService iPlanService=new PlanServiceImpl();
		Plan plan=new Plan("Aditya Birla sunlife Empower Penson Plan", 1, 25, 80, 5, 18000, 0);
		iPlanService.addPlan(plan);
		iPlanService.getAll().forEach(System.out::println);
	}

}
