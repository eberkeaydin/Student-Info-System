public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Math", "MAT101", "MAT");
        Course fizik = new Course("Physics", "PHY101", "PHY");
        Course kimya = new Course("Chemistry", "CHEM101", "CHEM");

        Teacher t1 = new Teacher("John Steinbeck", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatima Aliye", "90550000001", "PHY");
        Teacher t3 = new Teacher("Marlon Brando", "90550000002", "CHEM");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("George Washington", 4, "140144015", mat,50, fizik,50, kimya, 50);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Napoleon Bonaparte", 4, "2211133", mat,45, fizik,70, kimya,45);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Charles Anzavour", 4, "221121312", mat,65, fizik,65, kimya,45);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

    }
}
