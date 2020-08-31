package StudentArray;

import java.util.Scanner;

public class StudentArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		
		Scanner input = new Scanner(System.in);
		
		for(int c = 0 ; c < students.length ; c++) {
			
			System.out.println("Enter id : ");
			int id = input.nextInt();
			
			System.out.println("Enter name : ");
			String name = input.next();
			
			System.out.println("Enter brach : ");
			String branch = input.next();
			
			System.out.println("Enter sub1 : ");
			int sub1 = input.nextInt();
			
			System.out.println("Enter sub2 : ");
			int sub2 = input.nextInt();
			
			System.out.println("Enter sub3 : ");
			int sub3 = input.nextInt();
			
			System.out.println("Enter mobile : ");
			String mobile = input.next();
			
			students[c] = new Student(id, name, branch, sub1, sub2, sub3, mobile);
			
		}
		
		System.out.println("Student details : ");
		for( Student student : students ) {
			System.out.println(student);
			System.out.println("Total Marks : "+student.getTotal());
		}

	}

}
