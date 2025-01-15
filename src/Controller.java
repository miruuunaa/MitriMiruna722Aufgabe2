import model.Medikamente;
import model.Patienten;
import repo.Repository;


// javadoc -d src/javadoc src/model/Kunde.java

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * The Controller class is responsible for managing interactions between
 * the Kunde and Produkt repositories.
 * It provides an abstraction layer for operations related to customers (Kunde)
 * and products (Produkt).
 */

public class Controller {

    private final Repository<Medikamente> MedikamenteRepo;
    private final Repository<Patienten> PatientenRepo;

    /**
     * Constructs a Controller instance with the specified repositories for Kunde and Produkt.
     */
    public Controller(Repository<Medikamente> inMemoryRepositoryMedikamente, Repository<Patienten> inMemoryRepositoryPatienten) {
        this.MedikamenteRepo = inMemoryRepositoryMedikamente;
        this.PatientenRepo = inMemoryRepositoryPatienten;
    }

    /**
     * CRUD Operation : get,getall,create,update,delete
     */
    public void viewMedikamente() {
        StringBuilder output = new StringBuilder("Alle Medikamente:\n");
        MedikamenteRepo.getAll().forEach(medikamente -> output.append(medikamente.toString()).append("\n"));
        System.out.println(output);
    }

    public void viewPatienten() {
        StringBuilder output = new StringBuilder("Alle Patienten:\n");
        PatientenRepo.getAll().forEach(produkt -> output.append(patient.toString()).append("\n"));
        System.out.println(output);
    }

    public void deleteMedikamente(Scanner scanner) {
        System.out.println("Enter the id of the medikament you want to delete from the system:");
        Integer id = Integer.parseInt(scanner.nextLine());
        MedikamenteRepo.delete(id);
    }

    public void deletePatient(Scanner scanner) {
        System.out.println("Enter the id of the user you want to delete from the system:");
        Integer id = Integer.parseInt(scanner.nextLine());
        PatientenRepo.delete(id);
    }

    public void createMedikamente(Scanner scanner) {
        System.out.println("Enter Medikamente id:");
        Integer id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Medikamente name:");
        String name = scanner.nextLine();
        System.out.println("Enter Medikamente price:");
        String price = scanner.nextLine();
        System.out.println("Krankenheit : ");
        String krankenheit = scanner.nextLine();
        Medikamente medikamente = null;
        MedikamenteRepo.create(medikamente);
        System.out.println("Medikamente created: " + medikamente);
    }

    public void createPatient(Scanner scanner) {
        System.out.println("Enter Patient id:");
        Integer id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Patient name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Patient Diagnose:");
        String diagnose = scanner.nextLine();

        Patienten patient = new Patienten(id, name, age, diagnose);
        PatientenRepo.create(patient);
        System.out.println("Produkt created: " + patient);
    }

    public void getMedikamente(Scanner scanner) {
        System.out.println("Enter the id of the Medikament you want to get:");
        Integer id = Integer.parseInt(scanner.nextLine());
        Medikamente medikamente = MedikamenteRepo.get(id);
        if (medikamente != null) {
            System.out.println("Medikament found: " + medikamente);
        } else {
            System.out.println("Medikament not found with id: " + id);
        }
    }

    public void getPatient(Scanner scanner) {
        System.out.println("Enter the id of the Patient you want to get:");
        Integer id = Integer.parseInt(scanner.nextLine());
        Patienten patient = PatientenRepo.get(id);
        if (patient != null) {
            System.out.println("Patient found: " + patient);
        } else {
            System.out.println("Patient not found with id: " + id);
        }
    }

    public void updateMedikamente(Scanner scanner) {
        System.out.println("Enter the id of the Medikamente you want to update:");
        Integer id = Integer.parseInt(scanner.nextLine());
        Medikamente medikamente = MedikamenteRepo.get(id);
        if (medikamente != null) {

            System.out.println("Enter new name for Medikament:");
            String newName = scanner.nextLine();
            System.out.println("Price: ");
            String newPrice = scanner.nextLine();
            System.out.println("Enter new krankenheit for medikament:");
            String newKrankenheit = scanner.nextLine();

            medikamente.setName(newName);
            medikamente.setKrankenheit(newKrankenheit);
            MedikamenteRepo.update(medikamente);
            System.out.println("Medikament updated: " + medikamente);
        } else {
            System.out.println("Medikament not found with id: " + id);
        }
    }


    public void updatePatient(Scanner scanner) {
        System.out.println("Enter the id of the Patient you want to update:");
        Integer id = Integer.parseInt(scanner.nextLine());
        Patienten patient = PatientenRepo.get(id);
        if (patient != null) {
            System.out.println("Enter new name for Patient:");
            String newname = scanner.nextLine();
            System.out.println("Enter new diagnose for Patient:");
            String newPatient = scanner.nextLine();


            patient.setName(newname);
            patient.setDiagnose(newPatient);


            PatientenRepo.update(patient);
            System.out.println("Patient updated: " + patient);
        } else {
            System.out.println("Patient not found with name: " + id);
        }
    }
}
