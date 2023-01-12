package com.siva.goal.model.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.siva.goal.model.Address;
import com.siva.goal.model.BankAccount;
import com.siva.goal.model.Contact;
import com.siva.goal.model.Enum.Gender;
import com.siva.goal.model.Family.FamilyDetails;

import lombok.Data;

@Data
@Document
public class Employee {

        @Id
        private int id;

        @NotBlank
        private String firstName;

        private String lastName;

        private Gender gender;

        private String bloodGrp;

        private Address address;

        private Contact contact;

        private String desigination;

        @JsonFormat(pattern = "yyyy-MM-dd")
        private LocalDate dateOfBirth;

        // private int empAge;

        @Email
        private String email;

        private String department;

        private LocalDate dateOfJoining;

        // private int currentCompanyExperience;

        private int totalExperience;

        private String aadharNumber;

        private FamilyDetails familyDetails;

        private List<EducationBackground> educationBackgrounds = new ArrayList<>();

        private List<BankAccount> bankAccounts = new ArrayList<>();

        public int getEmpAge() {
                if (dateOfBirth == null)
                        return 0;
                return Period.between(dateOfBirth, LocalDate.now()).getYears();
        }

        public int getCurrentCompanyExperience() {
                if (dateOfJoining == null)
                        return 0;
                return Period.between(dateOfJoining, LocalDate.now()).getYears();
        }

}
