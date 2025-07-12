import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("\tStudent Management System");
                System.out.println("--------------------------------------------------");

                System.out.println("1.Add Student");
                System.out.println("2.View All");
                System.out.println("3.Search");
                System.out.println("4.Delete");
                System.out.println("5.Update student details");
                System.out.println("6.Exit");

                System.out.print("Enter your choice : ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Roll No : ");
                        int rollno = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name : ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Grade : ");
                        char grade = scanner.next().charAt(0);
                        scanner.nextLine();

                        Student student = new Student(rollno, name, grade);
                        students.add(student);
                        System.out.println("Student added successfully!!");

                    }

                    case 2 -> {
                        System.out.println("All Students :- ");
                        if (!students.isEmpty()) {
                            for (Student student : students) {
                                System.out.println(student.toString());
                            }
                        } else {
                            System.out.println("No Student record found. The list is empty");
                        }
                    }
                    case 3 -> {
                        System.out.print("Enter roll no to search : ");
                        int rollno = scanner.nextInt();

                        boolean flag = false;
                        for (Student student : students) {

                            if (student.getRollNo() == rollno) {
                                System.out.println(student);
                                flag = true;
                                break;
                            }

                        }

                        if (!flag) {
                            System.out.println("Student record not found !");
                        }

                    }
                    case 4 -> {
                        System.out.print("Enter roll number : ");
                        int rollno = scanner.nextInt();
                        scanner.nextLine();

                        int studentsSize = students.size();
                        for (int i = 0; i < studentsSize; i++) {
                            Student info = students.get(i);
                            if (info.getRollNo() == rollno) {
                                System.out.println("Details : " + students.get(i));
                                students.remove(i);
                                System.out.println("Student details removed successfully !");
                                break;
                            }
                        }
                        if (studentsSize == students.size()) {
                            System.out.println("Student not found");
                        }
                    }
                    case 5 -> {

                        System.out.print("Enter rollno : ");
                        int num = scanner.nextInt();
                        scanner.nextLine();

                        int studentsSize = students.size();
                        for (int i = 0; i < studentsSize; i++) {
                            Student info = students.get(i);
                            if (info.getRollNo() == num) {
                                System.out.print("Enter Roll No : ");
                                int rollno = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter Name : ");
                                String name = scanner.nextLine();
                                System.out.print("Enter Grade : ");
                                char grade = scanner.next().charAt(0);
                                scanner.nextLine();


                                System.out.println("Student details updated Successfully!");

                                System.out.println("Old :"+info.toString());

                                info.setRollNo(rollno);
                                info.setName(name);
                                info.setGrade(grade);

                                System.out.println("Updated :"+info.toString());

                                break;
                            }
                        }
                        if (studentsSize == students.size()) {
                            System.out.println("Student not found");
                        }

                    }
                    case 6 -> {
                        running = false;
                    }
                    default -> System.out.println("Invalid choice. Please select from 1 to 5.");
                }

            }
        }
    }
}
