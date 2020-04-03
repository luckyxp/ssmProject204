package com.xp.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.xp.pojo.Grade;
import com.xp.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	private static Map<Integer, Student> students = null;
	
	@Autowired
	private GradeDao gradeDao;

	static{
		students = new HashMap<Integer, Student>();

		students.put(1001, new Student(1001, "张三", "aa@163.com", 1, new Grade(101, "D-AA")));
		students.put(1002, new Student(1002, "李四", "bb@163.com", 1, new Grade(102, "D-BB")));
		students.put(1003, new Student(1003, "王五", "cc@163.com", 0, new Grade(103, "D-CC")));
		students.put(1004, new Student(1004, "赵六", "dd@163.com", 0, new Grade(104, "D-DD")));
		students.put(1005, new Student(1005, "孙七", "ee@163.com", 1, new Grade(105, "D-EE")));
	}

	private static Integer initId = 1006;
	
	public void save(Student student){
		if(student.getId() == null){
			student.setId(initId++);
		}

		student.setGrade(gradeDao.getGrade(student.getGrade().getId()));
		students.put(student.getId(), student);
	}
	
	public Collection<Student> getAll(){
		return students.values();
	}
	
	public Student get(Integer id){
		return students.get(id);
	}
	
	public void delete(Integer id){
		students.remove(id);
	}
}
