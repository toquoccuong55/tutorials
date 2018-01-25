/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.daos;

import cuongto.db.MyConnection;
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
public class CategoryDAO implements Serializable {

    private Connection con;
    private PreparedStatement preStm;
    private ResultSet rs;

    public CategoryDAO() {
    }

    private void closeConnection() throws Exception {
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

    public List<String> loadCategory() throws Exception {
        List<String> list = null;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Select Category from Category";
            preStm = con.prepareStatement(sql);
            rs = preStm.executeQuery();
            String category = "";
            list = new ArrayList<>();
            while (rs.next()) {
                category = rs.getString("Category");
                list.add(category);
            }
        } finally {
            closeConnection();
        }
        return list;
    }

    public boolean createCategory(String category) throws Exception {
        boolean created = false;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Insert into Category (Category) values (?)";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, category);
            int row = preStm.executeUpdate();
            if (row > 0) {
                created = true;
            }
        } finally {
            closeConnection();
        }
        return created;
    }

    public boolean checkCategory(String category) throws Exception {
        boolean exist = false;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Select Category from Category where Category = ?";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, category);
            rs = preStm.executeQuery();
            if (rs.next()) {
                exist = true;
            }
        } finally {
            closeConnection();
        }
        return exist;
    }

    public boolean deleteCategory(String category) throws Exception {
        boolean deleted = false;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Delete from Category where Category = ?";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, category);
            int row = preStm.executeUpdate();
            if (row > 0) {
                deleted = true;
            }
        } finally {
            closeConnection();
        }
        return deleted;
    }

    public boolean updateCategory(String newValue, String oldValue) throws Exception {
        boolean updated = false;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Update Category set Category = ? where Category = ?";
            preStm = con.prepareCall(sql);
            preStm.setString(1, newValue);
            preStm.setString(2, oldValue);
            int row = preStm.executeUpdate();
            if (row > 0) {
                updated = true;
            }
        } finally {
            closeConnection();
        }
        return updated;
    }
}
