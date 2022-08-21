public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String studentNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;


    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 > 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 > 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 > 0 && note3 <= 100) {
            this.c3.note = note3;
        }


    }

    void addBulkExamSozluNote(int sozNote1, int sozNote2, int sozNote3) {

        if (sozNote1 > 0 && sozNote1 <= 100) {
            this.c1.sozNote = sozNote1;
        }
        if (sozNote2 > 0 && sozNote2 <= 100) {
            this.c2.sozNote = sozNote2;
        }
        if (sozNote3 > 0 && sozNote3 <= 100) {
            this.c3.sozNote = sozNote3;
        }


    }
    void  isPass(){
        this.avarage=((c1.note+ c2.note+ c3.note)*0.8+(c1.sozNote+ c2.sozNote+ c3.sozNote)*0.2)/3;
        if (this.avarage >=55) {
            System.out.println("Sınıfı Geçtiniz Not Ortalamanız "+this.avarage);

        }else {
            System.out.println("Sınıfta Kaldınız Not Ortalamanız"+this.avarage);
        }
        printNote();
    }


    void printNote() {
        System.out.println(this.c1.name + " Notu : " + this.c1.note);
        System.out.println(this.c1.name + " Sozlu Notu : " + this.c1.sozNote);
        System.out.println(this.c2.name + " Notu : " + this.c2.note);
        System.out.println(this.c2.name + " Sozlu Notu : " + this.c2.sozNote);
        System.out.println(this.c3.name + " Notu : " + this.c3.note);
        System.out.println(this.c3.name + " Sozlu Notu : " + this.c3.sozNote);
    }
}
