public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    double matSozlu;
    Course fizik;
    double fizikSozlu;
    Course kimya;
    double kimyaSozlu;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, double matSozlu, Course fizik, double fizikSozlu,Course kimya , double kimyaSozlu) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.matSozlu = matSozlu;
        this.fizik = fizik;
        this.fizikSozlu = fizikSozlu;
        this.kimya = kimya;
        this.kimyaSozlu = kimyaSozlu;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(double mat, double fizik, double kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notes are not recorded completely.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("General Average : " + this.avarage);
            if (this.isPass) {
                System.out.println("Passed the class. ");
            } else {
                System.out.println("Failed the class.");
            }
        }
    }

    public void calcAvarage() {
        double fizikOrt = this.fizik.note * 0.8 + this.fizikSozlu * 0.2;
        double kimyaOrt = this.kimya.note * 0.8 + this.kimyaSozlu * 0.2;
        double matOrt = this.mat.note * 0.8 + this.matSozlu * 0.2;
        this.avarage = (fizikOrt + kimyaOrt + matOrt) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Mathematics Note : " + this.mat.note);
        System.out.println("Physics Note : " + this.fizik.note);
        System.out.println("Chemistry Note : " + this.kimya.note);
    }

}
