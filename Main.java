import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Patient p1 = new Patient("P1", 20, "Corona", 18000);
        Patient p2 = new Patient("P2", 26, "Fever", 6000);
        Patient p3 = new Patient("P3", 29, "Corona", 8000);
        Patient p4 = new Patient("P4", 23, "Corona", 12000);

        List<Patient> patientList = Arrays.asList(p1, p2, p3, p4);

        // Problem Statement 1: Get the details of patient whos suffering from corona
        patientList.stream().filter(patient -> patient.getDisease().equals("Corona")).forEach(System.out::println);

        // Problem Statement 2: Get the patient details whos age is less than 25
        System.out.println(" ");
        patientList.stream().filter(patient -> patient.getDisease().equals("Corona") && patient.getAge() < 25).forEach(System.out::println);

        // Problem Statement 3: Get the average bill of all corona patient
        System.out.println(" ");
        Double averageAmount = patientList.stream().filter(patient -> patient.getDisease().equals("Corona"))
                .collect(Collectors.averagingDouble(Patient::getAmount));
        System.out.println("Average Bill: " + averageAmount);
    }
}

/*
OUTPUT:
Patient{name='P1', age=20, disease='Corona', amount=18000}
Patient{name='P3', age=29, disease='Corona', amount=8000}
Patient{name='P4', age=23, disease='Corona', amount=12000}

Patient{name='P1', age=20, disease='Corona', amount=18000}
Patient{name='P4', age=23, disease='Corona', amount=12000}

Average Bill: 12666.666666666666
 */