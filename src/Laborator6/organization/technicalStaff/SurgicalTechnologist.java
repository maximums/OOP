package Laborator6.organization.technicalStaff;

import Laborator6.Address;
import Laborator6.FullName;
import Laborator6.Gender;
import Laborator6.Phone;
import Laborator6.organization.Department;
import Laborator6.organization.Person;

import java.time.LocalDate;

public class SurgicalTechnologist extends Technologist{

    public SurgicalTechnologist(String title, String givenName, String middleName, String familyName, FullName name,
                                LocalDate birthDate, Gender gender, Address homeAddress, Phone phone, Person person, LocalDate joined,
                                String[] education, String[] certification, String[] languages, Department department) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, person, joined, education,
                certification, languages, department);
    }



}
