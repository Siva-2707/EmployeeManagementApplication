package com.siva.goal.model.Family;

import com.siva.goal.model.Contact;
import com.siva.goal.model.Enum.Gender;
import com.siva.goal.model.Enum.Relationship;

import lombok.Data;

@Data
public class Member {

    private Relationship relationship;
    private String name;
    private Gender gender;
    private Contact contact;
    private String qualification;
    private String currentCompany;

    public Member(Relationship relationship, String name, Gender gender, Contact contact, String qualification,
            String currentCompany) {
        this.relationship = relationship;
        this.name = name;
        this.gender = gender;
        this.contact = contact;
        this.qualification = qualification;
        this.currentCompany = currentCompany;
    }

}
