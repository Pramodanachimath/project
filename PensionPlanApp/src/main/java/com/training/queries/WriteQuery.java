package com.training.queries;

import java.sql.*;
import com.training.model.Plan;

public class WriteQuery {
	
	public static final String INSERTQUERY="INSERT INTO PLAN VALUES(?,?,?,?,?,?,?)";
	
	public static final String UPDATEQUERY="UPDATE PLAN SET PLAN=? WHERE POLICYID=?";
	
	public static final String DELETEQUERY="DELETE FROM PLAN  WHERE POLICYID=?";
	
	public static final String SELECTQUERY="SELECT * FROM PLAN";
	
	public static final String SELECTBYPLANS="SELECT * FROM PLAN WHERE PLANS=?";
	
	public static final String SELECTBYPOLICYID="SELECT * FROM PLAN WHERE POLICYID=?";
	
	public static final String SELECTBYAGE="SELECT * FROM PLAN WHERE AGE=?";
	
	public static final String SELECTBYVESTINGAGE="SELECT * FROM PLAN WHERE VESTINGAGE=?";
	
	public static final String SELECTBYPOLICYTERM="SELECT * FROM PLAN WHERE POLICYTERM=?";
	
	public static final String SELECTBYPREMIUM="SELECT * FROM PLAN WHERE PREMIUM=?";
	
	public static final String SELECTBYSUMASSURED="SELECT * FROM PLAN WHERE SUMASSURED=?";





 
   	
}
