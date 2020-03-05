package Services;

import Implementations.StudentDetails;
import org.osgi.service.component.annotations.*;

import java.util.ArrayList;

@Component(property = "name=n2",immediate = true)
public class StudentConfigurationService implements StudentService {

    StudentDetails s;
    ArrayList<StudentDetails> arrayList = new ArrayList<StudentDetails>();

   @Reference
    StudentService2 studentService2;

    public void  addStudent(StudentDetails s){
        //s.getStudentDetails();
        boolean  check = studentService2.isClassLimitReached(arrayList);
        if(!check){
            arrayList.add(s);
            System.out.println("added");
        }
        else {
            System.out.println("full");
        }

    }


    public void deleteStudent(int id){
        for(int i = 0; i<arrayList.size();++i)
        {
           StudentDetails s = arrayList.get(i);
           int del_id = s.getId();
            if(del_id==id)
            {
                arrayList.remove(s);
            }

        }
    }

    public void isStudentPassed(int id) {
        for (int i=0;i<arrayList.size();++i){
            StudentDetails y = arrayList.get(i);
            int passing_marks = studentService2.getPassingMarks();
            if(y.getId()==id){
                if(y.getMarks()>=passing_marks ){
                    System.out.println("passed");

                }
                else
                {
                    System.out.println("not passed");
                }
            }
        }

    }

    public void getStudent(int id){
        for(int i =0;i<arrayList.size();++i){
            StudentDetails obj = arrayList.get(i);
            int m = obj.getId();
            if(m==id){
                System.out.println("name:"+obj.getName()+"Age:"+obj.getAge()+"Marks:"+obj.getMarks());
            }
        }
    }

    public void getAllStudents()
    {
        for(int i =0;i<arrayList.size();++i)
        {
            StudentDetails obj = arrayList.get(i);
            System.out.println("id:"+obj.getId()+" name: "+obj.getName()+" Age: "+obj.getAge()+" marks: "+obj.getMarks());
        }
    }


    @Activate
    void activate(){

        StudentDetails s1= new StudentDetails();
        s1.setId(1);
        s1.setAge(13);
        s1.setName("joy");
        s1.setMarks(27);
        addStudent(s1);
        getAllStudents();
        getStudent(1);


       isStudentPassed(1);

    }
    @Deactivate
    void deactivate()
    {
        deleteStudent(1);
        System.out.println("deleted");
    }


}
