/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.daos;

import cuongto.db.MyConnection;
import cuongto.dtos.EventDTO;
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
public class EventDAO implements Serializable {

    private Connection con;
    private PreparedStatement preStm;
    private ResultSet rs;

    public EventDAO() {
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

    public List<EventDTO> findByCategory(String category) throws Exception {
        List<EventDTO> list = null;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Select Poster, EventName, Start, Finish, Address, MinParticipantNumber, Description, "
                    + " Fee, Status from Events where Category = ?";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, category);
            rs = preStm.executeQuery();

            list = new ArrayList<>();
            String poster = "";
            String eventname = "";
            String start = "";
            String finish = "";
            String address = "";
            int minNumber = 0;
            String description = "";
            double fee = 0;
            String status = "";

            while (rs.next()) {
                poster = rs.getString("Poster");
                eventname = rs.getString("EventName");
                start = rs.getString("Start");
                finish = rs.getString("Finish");
                address = rs.getString("Address");
                minNumber = rs.getInt("MinParticipantNumber");
                fee = rs.getDouble("Fee");
                description = rs.getString("Description");
                status = rs.getString("Status");

                EventDTO dto = new EventDTO(poster, eventname, start, finish, address, minNumber, fee, description, status);
                list.add(dto);
            }
        } finally {
            closeConnection();
        }
        return list;
    }

    public boolean createNewEvent(EventDTO dto) throws Exception {
        boolean created = false;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Insert into Events (Poster, EventID, EventName, Start, Finish, Address, "
                    + " MinParticipantNumber, MaxParticipantNumber, Fee, Category, Description, "
                    + " Status) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, dto.getPoster());
            preStm.setString(2, dto.getEventid());
            preStm.setString(3, dto.getEventname());
            preStm.setString(4, dto.getStart());
            preStm.setString(5, dto.getFinish());
            preStm.setString(6, dto.getAddress());
            preStm.setInt(7, (int) dto.getMinNumber());
            preStm.setInt(8, (int) dto.getMaxNumber());
            preStm.setFloat(9, (float) dto.getFee());
            preStm.setString(10, dto.getCategory());
            preStm.setString(11, dto.getDescription());
            preStm.setString(12, dto.getStatus());
            int row = preStm.executeUpdate();
            if (row > 0) {
                created = true;
            }

        } finally {
            closeConnection();
        }
        return created;
    }

    public List<EventDTO> viewEvent() throws Exception {
        List<EventDTO> list = null;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Select Poster, EventID, Eventname, Start, Finish , Address, MinParticipantNumber, "
                    + "MaxParticipantNumber, Fee, Category, Description, Status from Events";
            preStm = con.prepareStatement(sql);
            rs = preStm.executeQuery();

            list = new ArrayList<>();
            String poster = "";
            String eventID = "";
            String eventname = "";
            String start = "";
            String finish = "";
            String address = "";
            int minNumber = 0;
            int maxNumber = 0;
            double fee = 0;
            String category = "";
            String description = "";
            String status = "";
            while (rs.next()) {
                poster = rs.getString("Poster");
                eventID = rs.getString("EventID");
                eventname = rs.getString("EventName");
                start = rs.getString("Start");
                finish = rs.getString("Finish");
                address = rs.getString("Address");
                minNumber = rs.getInt("MinParticipantNumber");
                maxNumber = rs.getInt("MaxParticipantNumber");
                fee = rs.getDouble("Fee");
                category = rs.getString("Category");
                description = rs.getString("Description");
                status = rs.getString("Status");
                EventDTO dto = new EventDTO(poster, eventID, eventname, start, finish, address, minNumber, maxNumber, fee, category, description, status);
                list.add(dto);
            }
        } finally {
            closeConnection();
        }
        return list;
    }

    public boolean removeEvent(String eventID) throws Exception {
        boolean removed = false;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Delete from Events where EventID = ?";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, eventID);
            int row = preStm.executeUpdate();
            if (row > 0) {
                removed = true;
            }
        } finally {
            closeConnection();
        }
        return removed;
    }

    public EventDTO editEvent(String eventid) throws Exception {
        EventDTO dto = null;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Select Poster, Eventname, Start, Finish, Address, MinParticipantNumber, "
                    + "MaxParticipantNumber, Fee, Category, Description, Status from Events where EventID = ?";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, eventid);
            rs = preStm.executeQuery();
            if (rs.next()) {
                String poster = rs.getString("Poster");
                String eventname = rs.getString("EventName");
                String start = rs.getString("Start");
                String finish = rs.getString("Finish");
                String address = rs.getString("Address");
                int minNumber = rs.getInt("MinParticipantNumber");
                int maxNumber = rs.getInt("MaxParticipantNumber");
                double fee = rs.getFloat("Fee");
                String category = rs.getString("Category");
                String description = rs.getString("Description");
                String status = rs.getString("Status");
                dto = new EventDTO(poster, eventid, eventname, start, finish, address, minNumber, maxNumber, fee, category, description, status);
            }
        } finally {
            closeConnection();
        }
        return dto;
    }

    public boolean updateEvent(EventDTO dto) throws Exception {
        boolean updated = false;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Update Events set Poster = ?, EventName = ?, Start = ?, Finish = ?, Address = ?, "
                    + " MinParticipantNumber = ?, MaxParticipantNumber = ?, Fee = ? , "
                    + " Category = ?, Description = ? , Status = ? where EventID = ?";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, dto.getPoster());
            preStm.setString(2, dto.getEventname());
            preStm.setString(3, dto.getStart());
            preStm.setString(4, dto.getFinish());
            preStm.setString(5, dto.getAddress());
            preStm.setInt(6, dto.getMinNumber());
            preStm.setInt(7, dto.getMaxNumber());
            preStm.setFloat(8, (float) dto.getFee());
            preStm.setString(9, dto.getCategory());
            preStm.setString(10, dto.getDescription());
            preStm.setString(11, dto.getStatus());
            preStm.setString(12, dto.getEventid());
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
