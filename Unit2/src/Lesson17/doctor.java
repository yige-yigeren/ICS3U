package Lesson17;

public class doctor {
    private String name;
    private String type;
    private double salary;
    private String[] patients;
    private int numPatients;

    doctor(String n, String t, double s) {
        name = n;
        type = t;
        salary = s;
        patients = new String[20];
        numPatients = 0;
    }
    doctor (String n) {
        name = n;
        type = "Family";
        salary = 0;
        patients = new String[20];
        numPatients = 0;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Salary: " + salary);
        System.out.print("Patients: ");
        for (int i=0; i<numPatients; i++) {
            System.out.print(patients[i] + " ");
        }
        System.out.println();
    }

    void addp(String p) {
        for (int i=0; i<patients.length; i++) {
            if (numPatients == 20) {
                System.out.println("Can't add");
                return;
            } else if (patients[i] == null) {
                patients[i] = p;
                numPatients++;
                break;
            } else if (patients[i].equals(p)) {
                System.out.println("Already in list");
                break;
            }
        }
    }

    void raise(double r) {
        salary = salary * (1 + r/100);
    }

    static double salary(doctor[] a, String b) {
        double sum = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i].type.equals(b)) {
                sum += a[i].salary;
            }
        }
        return sum;
    }
}
