// Student.java
public class Student {
    // Instance variables
    private int admissionNumber;
    private String studentName;
    private String gender;
    private String dateOfBirth;
    private int rollNumber;
    private String parentName;
    private String parentContact;
    private String address;

    // Constructor
    public Student(int admissionNumber, String studentName, String gender, String dateOfBirth, int rollNumber, String parentName, String parentContact, String address) {
        this.admissionNumber = admissionNumber;
        this.studentName = studentName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.rollNumber = rollNumber;
        this.parentName = parentName;
        this.parentContact = parentContact;
        this.address = address;
    }

    // Getters and Setters
    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(int admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentContact() {
        return parentContact;
    }

    public void setParentContact(String parentContact) {
        this.parentContact = parentContact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}