package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Student> set = new HashSet<>();
		
		System.out.print("How manu students for course A? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			Integer matricula = sc.nextInt();
			set.add(new Student(matricula));
		}
		
		System.out.print("How manu students for course B? ");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			Integer matricula = sc.nextInt();
			set.add(new Student(matricula));
		}
		
		System.out.print("How manu students for course C? ");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			Integer matricula = sc.nextInt();
			set.add(new Student(matricula));
		}
		
		System.out.print("Total student: " + set.size());
		
		sc.close();
	}
		
}
