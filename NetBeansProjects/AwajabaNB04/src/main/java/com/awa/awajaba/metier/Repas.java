/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awa.awajaba.metier;

import java.time.LocalDate;

/**
 *
 * @author etudiant
 */
public class Repas {
    public int numero;
    public LocalDate date;
    
    Repas(int numero, LocalDate date){
        this.numero = numero;
        this.date = date;
	
    }
}
