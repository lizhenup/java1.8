package com.now.model;

import com.now.util.Database;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    int id;
    String username;
    String nickname;
    String brief;
    Date registeredAt;

    public User(int id, String username, String nickname, String brief, Date registeredAt) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.brief = brief;
        this.registeredAt = registeredAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", brief='" + brief + '\'' +
                ", registeredAt=" + registeredAt +
                '}';
    }

    public static User register(String username, String nickname, String password) throws SQLException {
        int id;
        String brief = "懒得写。";
        Date registeredAt = new Date();
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // SQL
        String sql = "INSERT INTO users (username, password, nickname, brief, registered_at) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = Database.getConnection()) {
            // Statement.RETURN_GENERATED_KEYS) 目的是获取插入后的 自增 id
            try (PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, username);
                stmt.setString(2, password);
                stmt.setString(3, nickname);
                stmt.setString(4, brief);
                stmt.setString(5, fmt.format(registeredAt));

                stmt.executeUpdate();

                // 插入成功，就可以通过 getGeneratedKeys 获取自增 id
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        id = rs.getInt(1);
                        return new User(id, username, nickname, brief, registeredAt);
                    }
                }
            }
        }

        return null;
    }
}