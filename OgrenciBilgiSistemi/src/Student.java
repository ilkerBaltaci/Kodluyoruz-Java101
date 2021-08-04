public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

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
    public void addBulkVerbalNote(int mat, int fizik, int kimya){
        if (mat >= 0 && mat <= 100) {
            this.mat.verbalNote = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbalNote = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbalNote = kimya;
        }
    }

    public void addPercantageVerbalNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.percentage = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.percentage = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.percentage = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.totalNote() + this.kimya.totalNote() + this.mat.totalNote()) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu: " + this.mat.verbalNote);
        System.out.println("Matematik Sözlünün Etkisi %"+ this.mat.percentage);
        System.out.println("Matematik Genel Ortalama : " + this.mat.totalNote());
        System.out.println("Fizik Sınav Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.verbalNote);
        System.out.println("Fizik Sözlünün Etkisi %" + this.fizik.percentage);
        System.out.println("Fizik Genel Ortalama : " + this.fizik.totalNote());
        System.out.println("Kimya Sınav Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.verbalNote);
        System.out.println("Kimya Sözlünün Etkisi %" + this.kimya.percentage);
        System.out.println("Kimya Genel Ortalama : " + this.kimya.totalNote());
    }

}
