package com.xproce.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Data
@Table(name = "customer")
public class Customer {

    @Id
    private Long id;


    private String Email;

    private String pwd;

    private String Role;


}
