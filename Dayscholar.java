import java.util.Scanner;

class Student { private int studentId; private String studentName; private String departmentName; private String gender;

public Student(int studentId, String studentName, String departmentName, String gender) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.departmentName = departmentName;
    this.gender = gender;
}

public int getStudentId() {
    return studentId;
}

public String getStudentName() {
    return studentName;
}

public String getDepartmentName() {
    return departmentName;
}

public String getGender() {
    return gender;
}
}

class Hosteller extends Student { private int collegeFee; private int roomNumber; private String blockName; private String roomType;

public Hosteller(int studentId, String studentName, String departmentName, String gender, int collegeFee, int roomNumber, String blockName, String roomType) {
    super(studentId, studentName, departmentName, gender);
    this.collegeFee = collegeFee;
    this.roomNumber = roomNumber;
    this.blockName = blockName;
    this.roomType = roomType;
}

public double calculateTotalFee() {
    return collegeFee;
}
}

class DayScholar extends Student { private int collegeFee; private int busNumber; private int distance;

public DayScholar(int studentId, String studentName, String departmentName, String gender, int collegeFee, int busNumber, int distance) {
    super(studentId, studentName, departmentName, gender);
    this.collegeFee = collegeFee;
    this.busNumber = busNumber;
    this.distance = distance;
}

public double calculateTotalFee() {
    return collegeFee + (distance * busNumber);
}
}

public class UserInterface { public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Student Id");
    int studentId = scanner.nextInt();
    scanner.nextLine(); // Consume newline
    System.out.println("Enter Student name");
    String studentName = scanner.nextLine();
    System.out.println("Enter Department name");
    String departmentName = scanner.nextLine();
    System.out.println("Enter gender");
    String gender = scanner.nextLine();
    System.out.println("Enter category");
    String category = scanner.nextLine();

    if (category.equals("Hosteller")) {
        System.out.println("Enter College fee");
        int collegeFee = scanner.nextInt();
        System.out.println("Enter the room number");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter the Block name");
        String blockName = scanner.nextLine();
        System.out.println("Enter the room type");
        String roomType = scanner.nextLine();

        Hosteller hosteller = new Hosteller(studentId, studentName, departmentName, gender, collegeFee, roomNumber, blockName, roomType);
        System.out.println("Total College fee is " + hosteller.calculateTotalFee());
    } else if (category.equals("DayScholar")) {
        System.out.println("Enter College fee");
        int collegeFee = scanner.nextInt();
        System.out.println("Enter Bus number");
        int busNumber = scanner.nextInt();
        System.out.println("Enter the distance");
        int distance = scanner.nextInt();

        DayScholar dayScholar = new DayScholar(studentId, studentName, departmentName, gender, collegeFee, busNumber, distance);
        System.out.println("Total College fee is " + dayScholar.calculateTotalFee());
    } else {
        System.out.println("Invalid category");
    }

    scanner.close();
}
}
