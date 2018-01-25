/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.daos;

import cuongto.db.MyConnection;
import cuongto.dtos.SuggestionDTO;
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
public class SuggestionDAO implements Serializable {

    private Connection con;
    private PreparedStatement preStm;
    private ResultSet rs;

    public SuggestionDAO() {
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

    public boolean insertSuggestion(SuggestionDTO dto) throws Exception {
        boolean inserted = false;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Insert into Suggestion (Poster, Eventname, Start, Finish, Address,"
                    + "MinParticipantNumber  , MaxParticipantNumber, Fee, Category,"
                    + " Description, Checked , Approve, Reason, Suggestor)"
                    + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            preStm.setBoolean(11, dto.isChecked());
            preStm.setBoolean(12, dto.isApprove());
            preStm.setString(13, dto.getReason());
            preStm.setString(14, dto.getSuggestor());
            int row = preStm.executeUpdate();
            if (row > 0) {
                inserted = true;
            }
        } finally {
            closeConnection();
        }
        return inserted;
    }

    public List<SuggestionDTO> viewSuggestedEvent(String username) throws Exception {
        List<SuggestionDTO> list = null;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Select Poster, EventName, Start, Finish, Address, MinParticipantNumber, MaxParticipantNumber, "
                    + "Fee, Category, Description,Checked, Approve, Reason from Suggestion where Suggestor = ?";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, username);
            rs = preStm.executeQuery();

            list = new ArrayList<>();
            String poster = "";
            String eventname = "";
            String start = "";
            String finish = "";
            String address = "";
            int minNumber = 0;
            int maxNumber = 0;
            double fee = 0;
            String category = "";
            String description = "";
            boolean checked;
            boolean approve;
            String reason = "";

            while (rs.next()) {
                poster = rs.getString("Poster");
                eventname = rs.getString("EventName");
                start = rs.getString("Start");
                finish = rs.getString("Finish");
                address = rs.getString("Address");
                minNumber = rs.getInt("MinParticipantNumber");
                maxNumber = rs.getInt("MaxParticipantNumber");
                fee = rs.getDouble("Fee");
                category = rs.getString("Category");
                description = rs.getString("Description");
                checked = rs.getBoolean("Checked");
                approve = rs.getBoolean("Approve");
                reason = rs.getString("Reason");

                SuggestionDTO dto = new SuggestionDTO(poster, eventname, start, finish, address, minNumber, maxNumber, fee, category, description, checked, approve, reason);
                list.add(dto);
            }
        } finally {
            closeConnection();
        }
        return list;
    }

    public boolean deleteSuggestion(String eventname) throws Exception {
        boolean removed = false;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Delete from Suggestion Where EventName = ?";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, eventname);
            int row = preStm.executeUpdate();
            if (row > 0) {
                removed = true;
            }
        } finally {
            closeConnection();
        }
        return removed;
    }

    public List<SuggestionDTO> checkSuggestedEvent() throws Exception {
        List<SuggestionDTO> list = null;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Select Poster, EventName, Start, Finish , Address, MinParticipantNumber,"
                    + " MaxParticipantNumber, Fee, Category, Description, Suggestor "
                    + " from Suggestion where Checked = ?";
            preStm = con.prepareStatement(sql);
            preStm.setBoolean(1, false);
            rs = preStm.executeQuery();

            list = new ArrayList<>();
            String poster = "";
            String eventname = "";
            String start = "";
            String finish = "";
            String address = "";
            int minNumber = 0;
            int maxNumber = 0;
            double fee = 0;
            String category = "";
            String description = "";
            String suggestor = "";

            while (rs.next()) {
                poster = rs.getString("Poster");
                eventname = rs.getString("EventName");
                start = rs.getString("Start");
                finish = rs.getString("Finish");
                address = rs.getString("Address");
                minNumber = rs.getInt("MinParticipantNumber");
                maxNumber = rs.getInt("MaxParticipantNumber");
                fee = rs.getFloat("Fee");
                category = rs.getString("Category");
                description = rs.getString("Description");
                suggestor = rs.getString("Suggestor");
                SuggestionDTO dto = new SuggestionDTO(poster, eventname, start, finish, address, minNumber, maxNumber, fee, category, description, suggestor);
                list.add(dto);
            }
        } finally {
            closeConnection();
        }
        return list;
    }

    public boolean rejectSuggestion(String eventname, String reason) throws Exception {
        boolean rejected = false;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Update Suggestion set Checked = ?, Approve = ?, Reason = ? "
                    + "where Eventname = ?";
            preStm = con.prepareStatement(sql);
            preStm.setBoolean(1, true);
            preStm.setBoolean(2, false);
            preStm.setString(3, reason);
            preStm.setString(4, eventname);
            int row = preStm.executeUpdate();
            if (row > 0) {
                rejected = true;
            }
        } finally {
            closeConnection();
        }
        return rejected;
    }

    public SuggestionDTO loadSuggestionToEvent(String eventname) throws Exception {
        SuggestionDTO dto = null;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Select Poster, Start, Finish, Address, MinParticipantNumber,"
                    + " MaxParticipantNumber, Fee, Category, Description, Suggestor from Suggestion where Eventname = ? ";
            preStm = con.prepareStatement(sql);
            preStm.setString(1, eventname);
            rs = preStm.executeQuery();
            if (rs.next()) {
                String poster = rs.getString("Poster");
                String start = rs.getString("Start");
                String finish = rs.getString("Finish");
                String address = rs.getString("Address");
                int minNumber = rs.getInt("MinParticipantNumber");
                int maxNumber = rs.getInt("MaxParticipantNumber");
                double fee = rs.getDouble("Fee");
                String category = rs.getString("Category");
                String description = rs.getString("Description");
                String suggestor = rs.getString("Suggestor");
                dto = new SuggestionDTO(poster, eventname, start, finish, address, minNumber, maxNumber, fee, category, description, suggestor);
            }

        } finally {
            closeConnection();
        }
        return dto;
    }

    public boolean setChecked(String eventname) throws Exception {
        boolean checked = false;
        try {
            con = MyConnection.getMyConnection();
            String sql = "Update Suggestion set Checked = ?, Approve = ? where Eventname = ?";
            preStm = con.prepareStatement(sql);
            preStm.setBoolean(1, true);
            preStm.setBoolean(2, true);
            preStm.setString(3, eventname);
            int row = preStm.executeUpdate();
            if (row > 0) {
                checked = true;
            }
        } finally {
            closeConnection();
        }
        return checked;
    }
}
