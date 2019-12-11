package Laborator6.organization.operationStaff;

import Laborator6.Address;
import Laborator6.FullName;
import Laborator6.Gender;
import Laborator6.Phone;
import Laborator6.organization.Department;
import Laborator6.organization.Patient;
import Laborator6.organization.Person;
import Laborator6.organization.Staff;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OperationsStaff extends Staff {

    protected List<Patient> patients = new ArrayList<Patient>();


    public OperationsStaff(String title, String givenName, String middleName, String familyName, FullName name,
                           LocalDate birthDate, Gender gender, Address homeAddress, Phone phone, Person person, LocalDate joined,
                           String[] education, String[] certification, String[] languages, Department department) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, person, joined, education,
                certification, languages, department);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }


}
