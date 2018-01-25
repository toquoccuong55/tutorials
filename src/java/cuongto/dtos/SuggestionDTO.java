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
public class SuggestionDTO implements Serializable{
    private String poster;
    private String eventname;
    private String start;
    private String finish;
    private String address;
    private int  minNumber;
    private int  maxNumber;
    private double fee;
    private String category ;
    private String description;
    private boolean checked;
    private boolean approve;
    private String reason;
    private String suggestor;

    public SuggestionDTO() {
    }

    public SuggestionDTO(String poster, String eventname, String start, String finish, String address, int minNumber, int maxNumber, double fee, String category, String description, boolean checked, boolean approve, String reason, String suggestor) {
        this.poster = poster;
        this.eventname = eventname;
        this.start = start;
        this.finish = finish;
        this.address = address;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.fee = fee;
        this.category = category;
        this.description = description;
        this.checked = checked;
        this.approve = approve;
        this.reason = reason;
        this.suggestor = suggestor;
    }

    public SuggestionDTO(String poster, String eventname, String start, String finish, String address, int minNumber, int maxNumber, double fee, String category, String description, boolean checked, boolean approve, String reason) {
        this.poster = poster;
        this.eventname = eventname;
        this.start = start;
        this.finish = finish;
        this.address = address;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.fee = fee;
        this.category = category;
        this.description = description;
        this.checked = checked;
        this.approve = approve;
        this.reason = reason;
    }

    public SuggestionDTO(String poster, String eventname, String start, String finish, String address, int minNumber, int maxNumber, double fee, String category, String description, String suggestor) {
        this.poster = poster;
        this.eventname = eventname;
        this.start = start;
        this.finish = finish;
        this.address = address;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.fee = fee;
        this.category = category;
        this.description = description;
        this.suggestor = suggestor;
    }


    public SuggestionDTO(String poster, String eventname, String start, String finish, String address, int minNumber, int maxNumber, double fee, String category, String description) {
        this.poster = poster;
        this.eventname = eventname;
        this.start = start;
        this.finish = finish;
        this.address = address;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.fee = fee;
        this.category = category;
        this.description = description;
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
    
    public boolean isApprove() {
        return approve;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }


    public void setApprove(boolean approve) {
        this.approve = approve;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
    

    public String getSuggestor() {
        return suggestor;
    }

    public void setSuggestor(String suggestor) {
        this.suggestor = suggestor;
    }
    
    
    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
