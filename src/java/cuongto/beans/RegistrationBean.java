/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.beans;

import cuongto.daos.RegistrationDAO;
import cuongto.dtos.RegistrationDTO;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author toquo
 */
public class RegistrationBean implements Serializable{
    private String username, password;
    private RegistrationDTO dto;
    private String role;
    
    public RegistrationBean() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    

    public RegistrationDTO getDto() {
        return dto;
    }

    public void setDto(RegistrationDTO dto) {
        this.dto = dto;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String checkLogin() throws Exception{
        RegistrationDAO dao = new RegistrationDAO();
        return dao.checkLogin(username, password);
    }
    
    public boolean insertAccount() throws Exception{
        RegistrationDAO dao = new RegistrationDAO();
        return dao.insertAccount(dto);
    }
    public List<RegistrationDTO> viewAccounts() throws Exception{
        RegistrationDAO dao = new RegistrationDAO();
        return dao.viewAccount(role);
    }
    public boolean deleteAccount() throws Exception{
        RegistrationDAO dao = new RegistrationDAO();
        return dao.deleteAccount(username);
    }
}
