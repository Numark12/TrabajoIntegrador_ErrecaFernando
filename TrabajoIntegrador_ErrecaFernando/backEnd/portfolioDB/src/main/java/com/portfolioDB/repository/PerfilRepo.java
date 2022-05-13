/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioDB.repository;

import com.portfolioDB.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ferna
 */
public interface PerfilRepo extends JpaRepository<Perfil, Long>{
    
}
