package Services;

import Implementations.StudentDetails;

public interface StudentService {
    public void addStudent(StudentDetails s);
    public void deleteStudent(int id);
    public void isStudentPassed(int id);
    public void getStudent(int id);
    public void getAllStudents();

}
