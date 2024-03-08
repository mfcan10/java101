public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoja","905555555555","HTY");
        Teacher t2=new Teacher("Graham","90566666666","PHY");
        Teacher t3=new Teacher("Magnus","90577777777","BIO");

        Course history=new Course("History","101","HTY",t1);
        Course physics=new Course("Physics","102","PHY",t2);
        Course bio=new Course("Biology","103","BIO",t3);

        history.addTeacher(t1);
        physics.addTeacher(t2);
        bio.addTeacher(t3);

        Student s1=new Student("Ahmet","1","1",history,physics,bio);
        Student s2=new Student("Cuneyt","1","2",history,physics,bio);
        Student s3=new Student("Melisa","1","3",history,physics,bio);

        s1.c1.knot=90;
        s1.c2.knot=90;
        s1.c3.knot=90;
        s1.addBulkExamNote(50,20,40);
        s1.isPass();
        s2.c1.knot=80;
        s2.c2.knot=80;
        s2.c3.knot=80;
        s2.addBulkExamNote(100,50,40);
        s2.isPass();
        s3.c1.knot=50;
        s3.c2.knot=50;
        s3.c3.knot=50;
        s3.addBulkExamNote(50,20,40);
        s3.isPass();
    }
}