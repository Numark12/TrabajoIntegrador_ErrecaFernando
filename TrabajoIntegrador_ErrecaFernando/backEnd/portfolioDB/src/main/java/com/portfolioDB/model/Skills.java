/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioDB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ferna
 */@Entity
public class Skills {
        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String nombreSkill;
    private int porcSkill;
    private String imgSkill;

    public Skills() {
    }

    public Skills(Long idSkill, String nombreSkill, int porcSkill, String imgSkill) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.porcSkill = porcSkill;
        this.imgSkill = imgSkill;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public int getPorcSkill() {
        return porcSkill;
    }

    public void setPorcSkill(int porcSkill) {
        this.porcSkill = porcSkill;
    }

    public String getImgSkill() {
        return imgSkill;
    }

    public void setImgSkill(String imgSkill) {
        this.imgSkill = imgSkill;
    }

 
 }
