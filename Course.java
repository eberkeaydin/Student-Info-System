public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double note;
    double sozluNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
//            System.out.println("=========================");
        } else {
            System.out.println(t.name + " Instructor cannot teach this course.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " Instructor : " + courseTeacher.name);
        } else {
            System.out.println("Instructor will teach " + this.name + " course anymore.");
        }
    }
}
