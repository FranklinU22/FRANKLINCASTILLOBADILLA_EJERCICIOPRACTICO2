/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.caso02.caso02.DataBase;

import com.caso02.caso02.Entities.Flight;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Franklin
 */
public interface FlightsRepository extends CrudRepository<Flight, Long>{
   
}
