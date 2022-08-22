package com.training.model;

public class Plan {
	private String plans;
	private Integer policyId;
	private int age;
	private int vestingAge;
	private int policyTerm;
	private double premium;
	private double sumAssured;

	public Plan() {
		super();
	}

	public Plan(String plans, int policyId, int age, int vestingAge, int policyTerm, double premium,
			double sumAssured) {
		super();
		this.plans = plans;
		this.policyId = policyId;
		this.age = age;
		this.vestingAge = vestingAge;
		this.policyTerm = policyTerm;
		this.premium = premium;
		this.sumAssured = sumAssured;
	}

	public String getPlans() {
		return plans;
	}

	public void setPlans(String plans) {
		this.plans = plans;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getVestingAge() {
		return vestingAge;
	}

	public void setVestingAge(int vestingAge) {
		this.vestingAge = vestingAge;
	}

	public int getPolicyTerm() {
		return policyTerm;
	}

	public void setPolicyTerm(int policyTerm) {
		this.policyTerm = policyTerm;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public double getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}

	@Override
	public String toString() {
		return "Plan [plans=" + plans + ", policyId=" + policyId + ", age=" + age + ", vestingAge=" + vestingAge
				+ ", policyTerm=" + policyTerm + ", premium=" + premium + ", sumAssured=" + sumAssured + "]";
	}

}
