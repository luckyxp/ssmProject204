package com.xp.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.xp.pojo.Grade;
import org.springframework.stereotype.Repository;

@Repository
public class GradeDao {

	private static Map<Integer, Grade> grades = null;
	
	static{
		grades = new HashMap<Integer, Grade>();

		grades.put(101, new Grade(101, "D-AA"));
		grades.put(102, new Grade(102, "D-BB"));
		grades.put(103, new Grade(103, "D-CC"));
		grades.put(104, new Grade(104, "D-DD"));
		grades.put(105, new Grade(105, "D-EE"));
	}
	
	public Collection<Grade> getGrades(){
		return grades.values();
	}
	
	public Grade getGrade(Integer id){
		return grades.get(id);
	}
	
}
