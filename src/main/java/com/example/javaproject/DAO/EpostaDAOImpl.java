package com.example.javaproject.DAO;

import com.example.javaproject.entity.Eposta;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EpostaDAOImpl implements EpostaDAO {
    private Connection conn;

    public EpostaDAOImpl(Connection conn) {
        this.conn=conn;
    }

    @Override
    public boolean epostaRegister(Eposta ep) {
        boolean f=false;

        try {
            String query="insert into Eposta (eposta) values(?)";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,ep.getEposta());

            int i=ps.executeUpdate();
            if (i==1){
                f=true;
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }

        return f;
    }
}
