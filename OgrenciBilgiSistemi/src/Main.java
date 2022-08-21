public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mahmut Hoca ", "5555", "TRH");
        Teacher teacher2 = new Teacher("Garaham BEll", "0000", "FZK");
        Teacher teacher3 = new Teacher("Ahmet ", "9999", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(teacher1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(teacher2);
        Course bio = new Course("Bioloji", "103", "BIO");
        bio.addTeacher(teacher3);


        Student student1 = new Student("Ahmet", "159", "4", tarih, fizik, bio);
        student1.addBulkExamNote(50,50,50);
        student1.addBulkExamSozluNote(100,100,100);


        student1.isPass();


    }
}
