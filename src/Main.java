public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Hakan Hoca", "TRH", "05555555555");
        Teacher t2 = new Teacher("Dua Lipa", "MZK", "05353535353");
        Teacher t3 = new Teacher("Simge Hoca", "FZK", "05333333333");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t3);
        Course müzik = new Course("Müzik", "103", "MZK");
        müzik.addTeacher(t2);

        Student s1 = new Student("Ahmet", "11111", "12", fizik, müzik, tarih);
        s1.addBulkExamNote(100, 50, 80);
        s1.isPass();

        Student s2 = new Student("Ela", "11112", "12", fizik, müzik, tarih);
        s2.addBulkExamNote(80, 75, 90);
        s2.isPass();
    }
}