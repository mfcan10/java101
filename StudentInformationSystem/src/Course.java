public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note,knot;
    Course(String name,String code,String prefix,Teacher teacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        this.note=0;
        this.knot=0;

    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            //this.teacher.print();
        }
        else{
            System.out.println("Teacher cannot teach this course.");
        }

    }
    void printTeacher(){

    }
}
