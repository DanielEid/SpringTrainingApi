package com.example.springtrainingapi.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Modélisation de la table de la bdd
 */

@Data       //@Data est une annotation Lombok. Nul besoin d’ajouter les getters et les setters. La librairie Lombok s’en charge pour nous
@Entity     //@Entity est une annotation qui indique que la classe correspond à une table de la base de données.
@Table(name = "employees")  //@Table(name=”employees”) indique le nom de la table associée.
public class Employee {
    @Id     //L’attribut id correspond à la clé primaire de la table, et est donc annoté @Id. D’autre part, comme l’id est auto-incrémenté, j’ai ajouté l’annotation @GeneratedValue(strategy = GenerationType.IDENTITY).
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName; // nom différent de la table et de la variable d'ou le fait que ce soit clairement explicité avec l'annotation @Column

    private String mail;  //Je n’ai pas eu besoin de mettre cette annotation pour mail et password, car le nom du champ de la table est identique.
    private String password;

}
