/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.dtos;

import java.io.Serializable;

/**
 *
 * @author toquo
 */
public class EventDTO implements Serializable{
    private String poster,eventid, eventname, start, finish, address;
    private int minNumber, maxNumber;
    private double fee;
    private String category, description, status;

    public EventDTO() {
    }

    public EventDTO(String poster, String eventname, String start, String finish, String address, int minNumber, double fee, String description, String status) {
        this.poster = poster;
        this.eventname = eventname;
        this.start = start;
        this.finish = finish;
        this.address = address;
        this.minNumber = minNumber;
        this.fee = fee;
        this.description = description;
        this.status = status;
    }

    public EventDTO(String poster, String eventid, String eventname, String start, String finish, String address, int minNumber, int maxNumber, double fee, String category, String description, String status) {
        this.poster = poster;
        this.eventid = eventid;
        this.eventname = eventname;
        this.start = start;
        this.finish = finish;
        this.address = address;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.fee = fee;
        this.category = category;
        this.description = description;
        this.status = status;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getEventid() {
        return eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
    
}
