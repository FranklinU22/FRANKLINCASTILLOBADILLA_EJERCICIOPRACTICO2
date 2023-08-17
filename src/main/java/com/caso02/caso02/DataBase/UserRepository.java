/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.caso02.caso02.DataBase;

import com.caso02.caso02.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Franklin
 */
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
