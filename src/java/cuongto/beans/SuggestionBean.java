/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.beans;

import cuongto.daos.SuggestionDAO;
import cuongto.dtos.SuggestionDTO;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author toquo
 */
public class SuggestionBean implements Serializable{
    private SuggestionDTO dto;
    private String category;
    private String username;
    private String eventname;
    private String reason;

    public SuggestionBean() {
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    

    public SuggestionDTO getDto() {
        return dto;
    }

    public void setDto(SuggestionDTO dto) {
        this.dto = dto;
    }
    
    public boolean insertSuggestion() throws Exception{
        SuggestionDAO dao = new SuggestionDAO();
        return dao.insertSuggestion(dto);
    }
    public boolean deleteSuggestion() throws Exception{
        SuggestionDAO dao = new SuggestionDAO();
        return dao.deleteSuggestion(eventname);
    }
    public boolean rejectSuggestion() throws Exception{
        SuggestionDAO dao = new SuggestionDAO();
        return dao.rejectSuggestion(eventname, reason);
    }
    public List<SuggestionDTO> viewSuggestedEvent() throws Exception{
        SuggestionDAO dao = new SuggestionDAO();
        return dao.viewSuggestedEvent(username);
    }
    public List<SuggestionDTO> checkSuggestEvent() throws Exception{
        SuggestionDAO dao = new SuggestionDAO();
        return dao.checkSuggestedEvent();
    }
    public SuggestionDTO loadSuggestionToEvent() throws Exception{
        SuggestionDAO dao = new SuggestionDAO();
        return dao.loadSuggestionToEvent(eventname);
    }
    public boolean setChecked() throws Exception{
        SuggestionDAO dao = new SuggestionDAO();
        return dao.setChecked(eventname);
    }
    
}
