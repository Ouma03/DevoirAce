package org.sid.devoir_ace.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data // Génère automatiquement les getters, setters, equals, hashCode, et toString
@NoArgsConstructor // Génère un constructeur sans arguments
@AllArgsConstructor // Génère un constructeur avec tous les arguments
public class Student {
    @Id
    private Long id;
    private String name;
    private String email;
    private LocalDate dateNaissance;
}

