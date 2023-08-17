/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso02.caso02.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
/**
 *
 * @author Franklin
 */
@Entity
@Data
@Table(name="Vuelos")
public class Flight {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero_vuelo;
    private String destino;
    private String hora_salida;
    private String fecha_salida;
    private String fecha_llegada;
    private String modelo_avion;
    
}
