package com.enoxs.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ObjectTypeFMapper implements RowMapper<ObjectTypeF> {
    public ObjectTypeF mapRow(ResultSet rs, int rowNum) throws SQLException {
        ObjectTypeF objectTypeF = new ObjectTypeF();
        objectTypeF.setId(rs.getInt("id"));
        objectTypeF.setName(rs.getString("name"));
        objectTypeF.setAge(rs.getInt("age"));

        return objectTypeF;
    }
}
