package com.entgra.Task_02.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class SupportStaffDTO {
    private int staff_id;
    private String username;
    private String email;
    private String password;
    private ArrayList phone_number;
}
