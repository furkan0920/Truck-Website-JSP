package com.example.javaproject.DAO;

import com.example.javaproject.entity.Nakliye;
import com.example.javaproject.entity.News;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NewsDAOImpl implements NewsDAO {
    private Connection conn;

    public NewsDAOImpl(Connection conn) {
        this.conn=conn;
    }

    @Override
    public boolean AddNews(News news) {
        boolean f=false;

        try {
            String query="insert into Haberler (HaberBasligi,HaberAyrintilari,HaberGorsel,HaberTarihi) values(?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,news.getHaberBasligi());
            ps.setString(2,news.getHaberAyrintilari());
            ps.setString(3,news.getHaberGorsel());
            ps.setString(4,news.getHaberTarihi());

            int i=ps.executeUpdate();
            if (i==1){
                f=true;
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }

        return f;
    }

    @Override
    public List<News> GetInformationNews() {
        List<News> list=new ArrayList<News>();
        News us=null;
        try
        {

            String sql="select *from Haberler ";
            PreparedStatement ps=conn.prepareStatement(sql);

            ResultSet rs=ps.executeQuery();

            while (rs.next())
            {
                us=new News();
                us.setId((rs.getInt(1)));
                us.setHaberBasligi((rs.getString(2)));
                us.setHaberAyrintilari(rs.getString(3));
                us.setHaberGorsel(rs.getString(4));
                us.setHaberTarihi(rs.getString(5));
                list.add(us);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return list;
    }

    public boolean deleteNews(int id) {
        boolean f=false;
        try {
            String query="delete from Haberler where id=?";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setInt(1,id);
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
