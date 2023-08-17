/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.caso02.caso02.Service;

import org.springframework.security.core.userdetails.*;
/**
 *
 * @author Franklin
 */
public interface IUserService {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
