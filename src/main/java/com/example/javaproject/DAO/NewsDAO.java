package com.example.javaproject.DAO;

import com.example.javaproject.entity.News;

import java.util.List;

public interface NewsDAO {
    public boolean AddNews(News news);
    public List<News> GetInformationNews();
    public boolean deleteNews(int id);
}
