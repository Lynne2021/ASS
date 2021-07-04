/**
 * Use the comparable to implement this method in Student.java
 */
public class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String toString() {
        return name +" has GPA " + gpa;
    }

    /**
     * TO compareTO another student o
     * @param o student
     * @return  to the two student's getGpa,compare it for implement in DeansList class
     */
    public int compareTo(Student o) {
        return Double.compare(this.getGpa(), o.getGpa());
    }

}
