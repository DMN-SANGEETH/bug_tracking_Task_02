package com.entgra.Task_02.model;

import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@TypeDefs({
        @TypeDef(name = "json", typeClass = JsonType.class)
})
public class SupportStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staff_id;
    private String username;
    private String email;
    private String password;
    @Type(type = "json")
    @Column(columnDefinition = "json")
    private ArrayList phone_number;
    @OneToMany(mappedBy = "supportStaffs", cascade = CascadeType.ALL)
    private List<Issue> issues;

}
