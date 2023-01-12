package com.siva.goal.model;

import lombok.Data;

@Data
public class BankAccount {

    private String IFSC;

    private String accountNumber;

    private String branch;

    private String city;

}
