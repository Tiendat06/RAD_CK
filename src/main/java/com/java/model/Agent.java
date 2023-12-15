package com.java.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Agent {
    private String agentID;
    private String agentName;
    private String agentAddress;
    private String agentMail;
    private String agentPhone;
}
