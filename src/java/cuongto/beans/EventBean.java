/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.beans;

import cuongto.daos.EventDAO;
import cuongto.dtos.EventDTO;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author toquo
 */
public class EventBean implements Serializable{
    private String category;
    private EventDTO dto;
    private String eventid;

    public EventBean() {
    }

    public String getEventid() {
        return eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid;
    }
    

    public String getCategory() {
        return category;
    }

    public EventDTO getDto() {
        return dto;
    }

    public void setDto(EventDTO dto) {
        this.dto = dto;
    }
    

    public void setCategory(String category) {
        this.category = category;
    }
    
    public List<EventDTO> findByCategory() throws Exception{
        EventDAO dao = new EventDAO();
        return dao.findByCategory(category);
    }
    
    public boolean createNewEvent() throws Exception{
        EventDAO dao = new EventDAO();
        return dao.createNewEvent(dto);
    }
    
    public List<EventDTO> viewEvent() throws Exception{
        EventDAO dao = new EventDAO();
        return dao.viewEvent();
    }
    public boolean removeEvent() throws Exception{
        EventDAO dao = new EventDAO();
        return dao.removeEvent(eventid);
    }
    public EventDTO editEvent() throws Exception{
        EventDAO dao = new EventDAO();
        return dao.editEvent(eventid);
    }
    public boolean updateEvent() throws Exception{
        EventDAO dao = new EventDAO();
        return dao.updateEvent(dto);
    }
}
