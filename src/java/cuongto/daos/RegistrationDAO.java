/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.daos;

import cuongto.db.MyConnection;
import cuongto.dtos.RegistrationDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toquo
 */
public class RegistrationDAO implements Serializable {

    private Connection con;
    private PreparedStatement preStm;
    private ResultSet rs;

    public RegistrationDAO() {
    }

    private void closeConnection() throws Exception{
        if (rs != null) {
            rs.close();
        }
        if (preStm != null) {
            preStm.close();
        }
        if (con != null) {
            con.close();
        }
    }

    public String checkLogin(String username, String password) throws Exception{
        String role = "failed";
        try {
            con = MyConnection.getMyConnection();
            String sql = "Select Role from Accounts where Username = ? and Password = ?";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, username);
            preStm.setString(2, password);
            rs = preStm.executeQuery();
            if (rs.next()) {
                role = rs.getString("Role");
            }
        } finally {
            closeConnection();
        }
        return role;
    }

    public boolean insertAccount(RegistrationDTO dto) throws Exception {
        boolean inserted = false;
        try{
            con = MyConnection.getMyConnection();
            String sql = "Insert into Accounts (Username, Password, Fullname, Email, Phone, Role) "
                    + "values(?,?,?,?,?,?)";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, dto.getUsername());
            preStm.setString(2, dto.getPassword());
            preStm.setString(3, dto.getFullname());
            preStm.setString(4, dto.getEmail());
            preStm.setString(5, dto.getPhone());
            preStm.setString(6, dto.getRole());
            int row = preStm.executeUpdate();
            if (row > 0) {
                inserted = true;
            }
        }finally{
            closeConnection();
        }
        
        return inserted;
    }
    public List<RegistrationDTO> viewAccount(String role) throws Exception{
        List<RegistrationDTO> list = null;
        try{
            con = MyConnection.getMyConnection();
            String sql = "Select Username, Fullname, Email, Phone from Accounts where Role = ?";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, role);
            rs = preStm.executeQuery();
            list = new ArrayList<>();
            String username = "";
            String fullname = "";
            String email = "";
            String phone = "";
            while(rs.next()){
                username = rs.getString("Username");
                fullname = rs.getString("Fullname");
                email = rs.getString("Email");
                phone = rs.getString("Phone");
                RegistrationDTO dto = new RegistrationDTO(username, fullname, email, phone);
                list.add(dto);
            }
        }finally{
            closeConnection();
        }
        return list;
    }
    public boolean deleteAccount(String username) throws Exception{
        boolean deleted = false;
        try{
            con = MyConnection.getMyConnection();
            String sql = "Delete from Accounts where Username = ?";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, username);
            System.out.println("toi day");
            int row = preStm.executeUpdate();
            if(row>0){
                deleted = true;
            }
        }finally{
            closeConnection();
        }
        return deleted;
    }
    
    
}
