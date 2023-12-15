package com.java.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Account {
    private String accountID;
    private String accountUsername;
    private String accountPassword;
    private String accountIsActive;
    private String accountRoleID;
}
