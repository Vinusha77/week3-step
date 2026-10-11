
import java.util.Scanner;

public class CSVStudentRecordParser {

    static void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",", -1);

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String name = fields[0].trim();
        String rollNumber = fields[1].trim();
        String department = fields[2].trim();

        if (name.isEmpty() || rollNumber.isEmpty()
                || department.isEmpty()) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println("Name: " + name
                + " | Roll No: " + rollNumber
                + " | Dept: " + department);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name,RollNumber,Department:");
        String csvLine = sc.nextLine();

        parseStudentRecord(csvLine);

        sc.close();
    }
}
