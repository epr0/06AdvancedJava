package com.demo.annotations.example3;

import javax.persistence.*;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Transient
    private String temporaryName;

    @Column(name = "FIRST_NAME")
    private String name;


}
