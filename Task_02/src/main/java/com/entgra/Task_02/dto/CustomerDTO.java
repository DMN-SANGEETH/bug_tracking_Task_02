package com.entgra.Task_02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {
    private int customer_id;
    private String username;
    private String email;
    private String password;

}
