/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.beans;

import cuongto.daos.CategoryDAO;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author toquo
 */
public class CategoryBean implements Serializable{
    private String category;
    private String newCategory, oldCategory;
    
    
    public CategoryBean() {
    }

    public String getNewCategory() {
        return newCategory;
    }

    public void setNewCategory(String newCategory) {
        this.newCategory = newCategory;
    }

    public String getOldCategory() {
        return oldCategory;
    }

    public void setOldCategory(String oldCategory) {
        this.oldCategory = oldCategory;
    }
    

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public List<String> loadCategory() throws Exception{
        CategoryDAO dao = new CategoryDAO();
        return dao.loadCategory();
    }
    public boolean createCategory() throws Exception{
        CategoryDAO dao = new CategoryDAO();
        return dao.createCategory(category);
    }
    public boolean checkCategory() throws Exception{
        CategoryDAO dao = new CategoryDAO();
        return dao.checkCategory(category);
    }
    public boolean deleteCategory() throws Exception{
        CategoryDAO dao = new CategoryDAO();
        return dao.deleteCategory(category);
    }
    public boolean updateCategory() throws Exception{
        CategoryDAO dao = new CategoryDAO();
        return dao.updateCategory(newCategory, oldCategory);
    }
}
