public class Main {
    public static void main(String[] args) {
        // สร้างอาจารย์
        Lecturer l1 = new Lecturer();
        l1.setfullname("A.J.Num");
        
        Lecturer l2 = new Lecturer();
        l2.setfullname("A.J. NEW");

        Lecturer l3 = new Lecturer();
        l3.setfullname("A.J.SI");

        Lecturer l4 = new Lecturer();
        l4.setfullname("A.J. Preecha");
        
        Lecturer l5 = new Lecturer();
        l5.setfullname("A.J.Tret");

        // สร้างวิชาเทอม 1
        Subject s1 = new Subject("308-103", "OOP", 3, l1, 1, 1, 2025);
        Subject s2 = new Subject("308-243", "COMPUTER NETWORK SYSTEMS", 3, l2, 1, 1, 2025);
        Subject s3 = new Subject("193-031G8", "NATURAL THERAPY", 2, l3, 2, 1, 2025);

        // สร้างวิชาเทอม 2
        Subject s4 = new Subject("308-376", "Software Engineering ", 1, l4, 2, 2, 2025);
        Subject s5 = new Subject("308-311", "System Analysis", 2, l5, 2, 2, 2025);

        // สร้างนักศึกษา
        Student a1 = new Student();
        a1.setfullname("Mos");
        a1.setIdentificationID("6610210776");
        a1.setPreBMI(170,57);
        a1.printInfostudent(); // แสดงข้อมูลนักศึกษา

        // ลงทะเบียนวิชาเทอม 1 พร้อมเกรด
        a1.register(s1, 80, 2025, 1); // a
        a1.register(s2, 20, 2025, 1); // F
        a1.register(s3, 70, 2025, 1); // b

        // ลงทะเบียนวิชาเทอม 2
        a1.register(s4, 80, 2025, 2); // d
        
        a1.register(s5, 90, 2025, 2); // A

        // ทดสอบการถอนรายวิชา
        a1.withdrawSubject(s1);  
        a1.withdrawSubject(s2);  
    
        System.out.println("\n=== After Withdrawal ===");
       
        // แสดงผลการเรียนทั้งหมด
        a1.printAllSemesterRecords();
    }
}
