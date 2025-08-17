import java.util.ArrayList; 

// RegisterRecord.java
public class RegisterRecord {
    private Subject subject;
    private double score;
    private String grade;
    private double gradePoint;
    private boolean withdrawn = false;

    public RegisterRecord(Subject subject, double score) 
    {
    this.subject = subject;          // กำหนดวิชาที่นักเรียนลงทะเบียน
    this.score = score;              // กำหนดคะแนนที่ได้
    calculateGradeAndPoint();        // คำนวณเกรดและเกรดพ้อยท์ตามคะแนน
    }


    public Subject getSubject() {
        return subject;
    }

    public double getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }

    public double getGradePoint() {
        return gradePoint;
    }

    public boolean isWithdrawn() {
        return withdrawn;
    }

    public void setWithdrawn(boolean withdrawn) 
    {
        this.withdrawn = withdrawn;      // ตั้งค่าว่านักเรียนถอนรายวิชาหรือไม่

        if (withdrawn) {                 
            this.grade = "W";            // ถ้าถอน ให้เกรดเป็น W
            this.gradePoint = 0.0;       // เกรดพ้อยท์เป็น 0
            this.score = 0;              // คะแนนเป็น 0
        } 
        else 
        {
            calculateGradeAndPoint(); // คำนวณใหม่ถ้ายกเลิกการถอน
        }
    }

    public void calculateGradeAndPoint() {
        if (withdrawn) {
            grade = "W";
            gradePoint = 0.0;
            return;
        }
        if (score >= 80) {
            grade = "A";
            gradePoint = 4.0;
        } else if (score >= 75) {
            grade = "B+";
            gradePoint = 3.5;
        } else if (score >= 70) {
            grade = "B";
            gradePoint = 3.0;
        } else if (score >= 65) {
            grade = "C+";
            gradePoint = 2.5;
        } else if (score >= 60) {
            grade = "C";
            gradePoint = 2.0;
        } else if (score >= 55) {
            grade = "D+";
            gradePoint = 1.5;
        } else if (score >= 50) {
            grade = "D";
            gradePoint = 1.0;
        } else {
            grade = "F";
            gradePoint = 0.0;
        }
    }

    public void printInfo() {
        System.out.println("Subject: " + subject.getSubjectName());
        System.out.println("Subject ID: " + subject.getSubjectId());
        System.out.println("Credit: " + subject.getCredit());
        System.out.println("Lecturer: " + subject.getLecturer().getFullname());

    if (withdrawn) {
        System.out.println("Status: Withdrawn (W)");
    } else {
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Grade Point: " + gradePoint);
    }
        System.out.println("---------------------------");
}

}

