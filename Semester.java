import java.util.ArrayList;

public class Semester {
    private int academicYear;                      // ปีการศึกษา
    private int termNumber;                        // เทอมที่เรียน
    private ArrayList<RegisterRecord> registeredSubjects;  // รายวิชาที่นักเรียนลงทะเบียนในเทอมนั้น

    // Constructor ของ Semester
    public Semester(int academicYear, int termNumber) {
        this.academicYear = academicYear;         // กำหนดปีการศึกษา
        this.termNumber = termNumber;             // กำหนดเทอม
        this.registeredSubjects = new ArrayList<>(); // สร้างลิสว่างสำหรับเก็บรายวิชา
    }


    public void registerSubject(Subject subject, double score) {
        RegisterRecord record = new RegisterRecord(subject, score);
        record.calculateGradeAndPoint(); // คำนวณเกรดทันที
        registeredSubjects.add(record);
        subject.increaseStudentCount(); // เพิ่มจำนวนนักเรียนในวิชา
    }

    public double calculateGPA() {
    double totalGradePoint = 0;
    int totalCredit = 0;

    for (RegisterRecord rr : registeredSubjects) {
        if (rr.isWithdrawn()) {
            continue; // ข้ามวิชาที่ถอน
        }
        totalGradePoint += rr.getGradePoint() * rr.getSubject().getCredit();
        totalCredit += rr.getSubject().getCredit();
    }

    return (totalCredit > 0) ? (totalGradePoint / totalCredit) : 0.0;
}


    public void printSemesterInfo() {
        System.out.println("=== Academic Year " + academicYear + ", Term " + termNumber + " ===");
        for (RegisterRecord rr : registeredSubjects) {
            rr.printInfo();
        }
        System.out.println("Semester " + termNumber + " GPA: " + String.format("%.2f", calculateGPA()));
        System.out.println("-----------------------------------");
    }

    //  เปลี่ยนชื่อเมธอดตรงนี้
    public ArrayList<RegisterRecord> getRegisterRecords() {
        return registeredSubjects;
    }

    public int getTotalCredits() {
        int total = 0;
        for (RegisterRecord rr : registeredSubjects) {
            total += rr.getSubject().getCredit();
        }
        return total;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public int getTermNumber() {
        return termNumber;
    }
}
