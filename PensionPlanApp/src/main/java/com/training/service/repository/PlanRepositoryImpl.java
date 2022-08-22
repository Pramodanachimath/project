package com.training.service.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;
import com.policyapp.util.DbConnection;
import com.training.model.Plan;

public class PlanRepositoryImpl implements IPlanRepository {

	public void addPlan(Plan plan) {
		String sql="insert into Plan values(?,?,?,?,?,?,?)";
		Connection connection=DbConnection.openConnection();
		PreparedStatement preparedStatement=null;
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,plan.getPlans());
			preparedStatement.setInt(2, plan.getPolicyId());
			preparedStatement.setInt(3, plan.getAge());
			preparedStatement.setInt(4, plan.getVestingAge());
			preparedStatement.setInt(5, plan.getPolicyTerm());
			preparedStatement.setDouble(6, plan.getPremium());
			preparedStatement.setDouble(6, plan.getSumAssured());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	public void deletePlan(int policyId) {

		String sql="delete from policy where policy_Id=?";
		Connection connection=DbConnection.openConnection();
		PreparedStatement preparedStatement=null;
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, policyId);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updatePlan(int policyId, String plans) {
		String sql="update  policy set plans=? where policy_Id=?";
		Connection connection=DbConnection.openConnection();
		PreparedStatement preparedStatement=null;
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, plans);
			preparedStatement.setInt(2, policyId);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<Plan> findAll() {

		List<Plan> planList=new ArrayList<>();
		
		String sql="select * from Plan";
		Connection connection=DbConnection.openConnection();
		PreparedStatement preparedStatement=null;
		ResultSet result=null;
		try {
			preparedStatement=connection.prepareStatement(sql);
//			preparedStatement.execute();
			 result=preparedStatement.executeQuery();
			 Plan plan=new Plan();
			 while (result.next()) {
				 result.getString("plans");
				 result.getInt("policy_Id");
				 result.getInt("age");
				 result.getInt("vestingAge");
				 result.getInt("policyTerm");
				 result.getDouble("premium");
				 result.getDouble("sumAssured");				 
				 
				planList.add(plan);
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return planList;
	}

	public List<Plan> findByPlans(String plans) {
List<Plan> planList=new ArrayList<>();
		
		String sql="select * from Plan where plans=?";
		Connection connection=DbConnection.openConnection();
		PreparedStatement preparedStatement=null;
		ResultSet result=null;
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.execute();
			 result=preparedStatement.executeQuery();
			 Plan plan=new Plan();
			 while (result.next()) {
				 result.getString("plans");
				 result.getInt("policy_Id");
				 result.getInt("age");
				 result.getInt("vestingAge");
				 result.getInt("policyTerm");
				 result.getDouble("premium");
				 result.getDouble("sumAssured");				 
				 
				planList.add(plan);
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return planList;
	}

	public List<Plan> findByPolicyId(int policyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Plan> findByAge(int Age) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Plan> findByVestingAge(int vestingAge) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Plan> findByPolicyTerm(int PolicyTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Plan> findByPremium(double Premium) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Plan> findBySumAssured(double sumAssured) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
