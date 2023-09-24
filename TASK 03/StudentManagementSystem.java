// StudentManagementSystem.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(int admissionNumber) {
        for (Student student : students) {
            if (student.getAdmissionNumber() == admissionNumber) {
                students.remove(student);
                break;
            }
        }
    }

    public Student getStudent(int admissionNumber) {
        for (Student student : students) {
            if (student.getAdmissionNumber() == admissionNumber) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(Student updatedStudent) {
        for (Student student : students) {
            if (student.getAdmissionNumber() == updatedStudent.getAdmissionNumber()) {
                student.setStudentName(updatedStudent.getStudentName());
                student.setGender(updatedStudent.getGender());
                student.setDateOfBirth(updatedStudent.getDateOfBirth());
                student.setRollNumber(updatedStudent.getRollNumber());
                student.setParentName(updatedStudent.getParentName());
                student.setParentContact(updatedStudent.getParentContact());
                student.setAddress(updatedStudent.getAddress());
                break;
            }
        }
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add a student");
            System.out.println("2. Retrieve a student");
            System.out.println("3. Update a student");
            System.out.println("4. Delete a student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                System.out.println("Enter student details:");
                System.out.print("Admission Number: ");
                int admissionNumber = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                System.out.print("Student Name: ");
                String studentName = scanner.nextLine();
                System.out.print("Gender: ");
                String gender = scanner.nextLine();
                System.out.print("Date of Birth: ");
                String dateOfBirth = scanner.nextLine();
                System.out.print("Roll Number: ");
                int rollNumber = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                System.out.print("Parent Name: ");
                String parentName = scanner.nextLine();
                System.out.print("Parent Contact: ");
                String parentContact = scanner.nextLine();
                System.out.print("Address: ");
                String address = scanner.nextLine();

                Student student = new Student(admissionNumber, studentName, gender, dateOfBirth, rollNumber, parentName, parentContact, address);
                sms.addStudent(student);
                System.out.println("Student added successfully!");
                System.out.println();
            } else if (choice == 2) {
                System.out.print("Enter admission number of the student to retrieve: ");
                int admissionNumber = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                Student student = sms.getStudent(admissionNumber);
                if (student != null) {
                    System.out.println("Student Details:");
                    System.out.println("Admission Number: " + student.getAdmissionNumber());
                    System.out.println("Student Name: " + student.getStudentName());
                    System.out.println("Gender: " + student.getGender());
                    System.out.println("Date of Birth: " + student.getDateOfBirth());
                    System.out.println("Roll Number: " + student.getRollNumber());
                    System.out.println("Parent Name: " + student.getParentName());
                    System.out.println("Parent Contact: " + student.getParentContact());
                    System.out.println("Address: " + student.getAddress());
                    System.out.println();
                } else {
                    System.out.println("Student not found!");
                    System.out.println();
                }
            } else if (choice == 3) {
                System.out.print("Enter admission number of the student to update: ");
                int admissionNumber = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                Student student = sms.getStudent(admissionNumber);
                if (student != null) {
                    System.out.println("Enter updated student details:");
                    System.out.print("Student Name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Date of Birth: ");
                    String dateOfBirth = scanner.nextLine();
                    System.out.print("Roll Number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Parent Name: ");
                    String parentName = scanner.nextLine();
                    System.out.print("Parent Contact: ");
                    String parentContact = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();

                    Student updatedStudent = new Student(admissionNumber, studentName, gender, dateOfBirth, rollNumber, parentName, parentContact, address);
                    sms.updateStudent(updatedStudent);
                    System.out.println("Student updated successfully!");
                    System.out.println();
                } else {
                    System.out.println("Student not found!");
                    System.out.println();
                }
            } else if (choice == 4) {
                System.out.print("Enter admission number of the student to delete: ");
                int admissionNumber = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                Student student = sms.getStudent(admissionNumber);
                if (student != null) {
                    sms.deleteStudent(admissionNumber);
                    System.out.println("Student deleted successfully!");
                    System.out.println();
                } else {
                    System.out.println("Student not found!");
                    System.out.println();
                }
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
                System.out.println();
            }
        }

        // Close the scanner
        scanner.close();
    }
}