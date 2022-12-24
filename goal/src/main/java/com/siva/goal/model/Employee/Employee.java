package com.siva.goal.model.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.siva.goal.model.Address;
import com.siva.goal.model.BankAccount;
import com.siva.goal.model.Contact;
import com.siva.goal.model.Enum.Gender;
import com.siva.goal.model.Family.FamilyDetails;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "Employee")
@ToString
@Table(name = "EMPLOYEE", uniqueConstraints = {
                @UniqueConstraint(name = "emp_email_unique", columnNames = "email")
})
@Getter
@Setter
@NoArgsConstructor
public class Employee {

        @Id
        @SequenceGenerator(name = "EmployeeSequence", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EmployeeSequence")
        @Column(updatable = false)
        private int id;

        @Column(nullable = false)
        @NotBlank
        private String firstName;

        @Column(nullable = false)
        private String lastName;

        @Enumerated(EnumType.STRING)
        private Gender gender;

        private String bloodGrp;

        @Embedded
        private Address address;

        @Embedded
        private Contact contact;

        private String desigination;

        private LocalDate dateOfBirth;

        @Transient
        private int empAge;

        @Column(nullable = false)
        @Email
        private String email;

        private String department;

        private LocalDate dateOfJoining;

        @Transient
        private int currentCompanyExperience;

        private int totalExperience;

        private String aadharNumber;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "fam_dtl_pk", referencedColumnName = "id")
        private FamilyDetails familyDetails;

        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "emp_id")
        private List<EducationBackground> educationBackgrounds = new ArrayList<>();

        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "emp_id")
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
