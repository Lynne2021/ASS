
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * DeanSList using  interface methods implement it by student class.ca (comparable).
 */
public class DeansList implements ICollection {
    /**
     * private list instance variable
     */
    private List<Student> students;

    /**
     * Constructor to creat new student AllayList
     */
    public DeansList() {
        students = new ArrayList<Student>();
    }
    /**
     * Add Student Object into students list. if student's gpa >= 3.7, add into
     * list and return back true, else return back false;

     * @param  ues it to get the new
     * @return if add student successfully, return back true, else return false;
     */

    @Override
    public boolean add(Object newItem) {
        Student student = (Student)newItem;
        if(Double.compare(student.getGpa(), (double)3.7)>=0) {
            students.add(student);
            return true;
        }
        return false;
    }
    /**
     * get student who has top gpa, if list is empty , return back false;
     *
     * @return  student who has top gpa, no student, return back false;
     */
    @Override
    public Object getNext() {
        Collections.sort(students);
        if(students.size()>0) {
            Student student = students.get(students.size()-1);
            students.remove(students.size()-1);
            return student;
        }else {
            return false;
        }
    }

}
