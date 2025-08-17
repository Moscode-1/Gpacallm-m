public class Subject {
    private String subjectId;        // รหัสวิชา
    private String subjectName;      // ชื่อวิชา
    private int credit;              // หน่วยกิต
    private int section;             // หมู่เรียน
    private int semester;            // ภาคการศึกษา (เทอม)
    private int year;                // ปีการศึกษา
    private Lecturer lecturer;       // อาจารย์ผู้สอน
    private int numberOfStudent;     // จำนวนนักศึกษาที่ลงทะเบียน

    public Subject() {

        // Constructor เปล่า (ค่าเริ่มต้น)

        
    }

    public Subject(String subjectId, String subjectName, int credit, Lecturer lecturer, int section, int semester, int year) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.credit = credit;
        this.lecturer = lecturer;
        this.section = section;
        this.semester = semester;
        this.year = year;
    }

    // เมธอด Setter และ Getter
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public int getSection() {
        return section;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    // เพิ่มจำนวนนักศึกษาเมื่อมีการ ลงทะเบียน
    public void increaseStudentCount() {
        numberOfStudent++;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }



    // แสดงรายละเอียดรายวิชา
    public void printInfoSubject() {
        System.out.println("Subject ID: " + subjectId);
        System.out.println("Subject Name: " + subjectName);
        System.out.println("Credit: " + credit);
        System.out.println("Lecturer: " + lecturer.getFullname());
        System.out.println("Section: " + section);
        System.out.println("Semester: " + semester);
        System.out.println("Academic Year: " + year);
        System.out.println("Number of Students Registered: " + numberOfStudent);
        System.out.println("---------------------------");
    }
}
