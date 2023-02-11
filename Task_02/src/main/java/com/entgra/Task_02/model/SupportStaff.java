package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class SupportStaff {
    @Id
    private Integer staff_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private User users;

}
