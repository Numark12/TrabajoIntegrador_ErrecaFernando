package com.springdb.springdb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Skills")
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//Necesito que los skills estén relacionados con el id del perfil    
    @NotNull
    @Size(min = 1, max = 50, message = "completar apellido")
    private String nombre;

    @NotNull
    private int porc;

}
