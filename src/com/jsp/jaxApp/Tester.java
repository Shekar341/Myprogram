package com.jsp.jaxApp;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

public class Tester 
{
	public static void main(String[] args) throws JAXBException
	{
		Collage collage=new Collage();
		Student student =new Student();
		student.setId(1);
		student.setName("Shekar");
		student.setQual("BE");
		
		Student student2 =new Student();
		student2.setId(2);
		student2.setName("Sunil");
		student2.setQual("BE");
		
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(student);
		studentList.add(student2);
		collage.setCname("BMSIT");
		collage.setStudentList(studentList);
		CollageMarshaller.objectToXml(collage);
	}
}
