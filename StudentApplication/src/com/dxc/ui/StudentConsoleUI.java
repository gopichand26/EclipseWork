package com.dxc.ui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.dxc.beans.Student;
import com.dxc.dao.DAO;
import com.dxc.dao.StudentFileDAO;
import com.dxc.dao.StudentJdbcDAO;

public class StudentConsoleUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int choice = 0;
		
		while(choice != 6) {
			System.out.println("1. Save Student");
			System.out.println("2. Edit Existing student");
			System.out.println("3. Delete Student");
			System.out.println("4. Display Student");
			System.out.println("5. Display ALL Student");
			System.out.println("\n6. Exit");
			System.out.println();
			System.out.print("Enter your option : ");
			choice = input.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Save operation");
//				StudentFileDAO studentFileDAO = new StudentFileDAO();
				
				StudentJdbcDAO studentDAO;
				
				try {
					studentDAO = new StudentJdbcDAO();
					
					System.out.println("Enter id : ");
					int id = input.nextInt();
					
					System.out.println("Enter name : ");
					String name = input.next();
					
					System.out.println("Enter DoB (dd-mm-yyyy) : ");
					String strDob = input.next();
					
					System.out.println("Enter email : ");
					String email = input.next();
					
					System.out.println("Enter mobile : ");
					String mobile = input.next();
					
					Student student = new Student(id, name, strDob, email, mobile);
					if(studentDAO.save(student)) {
						System.out.println("Saved Successfully");
						studentDAO.save();
					}	
					else {
						System.out.println("Failed during save");
						studentDAO.undo();
					}
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				break;
				
			case 2:
				System.out.println("Edit operation");
				
				System.out.println("Enter student id to edit : ");
				int id = input.nextInt();
				
				System.out.println("Enter name : ");
				String name = input.next();
				
				System.out.println("Enter DoB (dd-mm-yyyyy) : ");
				String strDob = input.next();
				
				System.out.println("Enter email : ");
				String email = input.next();
				
				System.out.println("Enter mobile : ");
				String mobile = input.next();
				
				try {
					Student student = new Student(id, name, strDob, email, mobile);
					StudentJdbcDAO studentDAO2 = new StudentJdbcDAO();
					if(studentDAO2.edit(student)) {
						System.out.println("Successfully edited");
						studentDAO2.save();
					}
					else {
						System.out.println("Failed to edit");
						studentDAO2.undo();
					}
					
					
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			
			case 3:
				System.out.println("Delete operation");
				break;
			
			case 4:
				System.out.println("Display operation");
				System.out.println("Enter student id to find : ");
				int findId = input.nextInt();
				try {
					
					StudentJdbcDAO studentDAO2 = new StudentJdbcDAO();
					Student s = studentDAO2.find(findId);
					
					if(s != null) {
						System.out.println("Student Found : ");
						System.out.println(s);
					}
					else {
						System.out.println("Student not found with id : "+findId);
					}
				}
				catch(ClassNotFoundException e) {
					e.printStackTrace();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 5:
				System.out.println("Display ALL operation");
				
				try {
					
					StudentJdbcDAO studentDAO2 = new StudentJdbcDAO();
					ArrayList<Student> students = (ArrayList<Student>)studentDAO2.findAll();
					students.stream()
						    .forEach(System.out::println);
					
				}
				catch(ClassNotFoundException e) {
					e.printStackTrace();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
				
			case 6:
				System.exit(0);

			default:
				System.out.println("Invalid user option");
				break;
			}
			
		}
		
		

	}

}
