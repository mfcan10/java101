public class Student {
    String name,stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;


    Student(String name, String classes, String stuNo, Course c1,Course c2,Course c3) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.c1= c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage=0.;
        this.isPass = false;
    }
    void addBulkExamNote(int n1,int n2,int n3){
        c1.note=n1;
        c2.note=n2;
        c3.note=n3;

    }
    void printNote(){
        System.out.println(c1.name+" Notu\t:"+c1.note);
        System.out.println(c2.name+" Notu\t:"+c2.note);
        System.out.println(c3.name+" Notu\t:"+c3.note);
    }
    void isPass(){
        calcAvarage();
        if (this.avarage>55) {
            System.out.println("Passed the class , avarage : "+this.avarage);
        }
        else{
            System.out.println("Failed the class , avarage : "+this.avarage);
        }
    }
    public void calcAvarage() {
        double c1Avar=((this.c1.knot)*0.2)+((this.c1.note)*0.8);
        double c2Avar=((this.c2.knot)*0.2)+((this.c2.note)*0.8);
        double c3Avar=((this.c3.knot)*0.2)+((this.c3.note)*0.8);
        this.avarage=(c1Avar+c2Avar+c3Avar)/3.0;
    }
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }
}

