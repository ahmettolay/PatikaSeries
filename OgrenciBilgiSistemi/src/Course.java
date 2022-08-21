public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozNote;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note = 0;
        this.sozNote = 0;

    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            // printTeacher();
        } else {
            System.out.println("Öğretmen branşı ve Bölüm Birbirine Uyuşmuyor!");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }

}