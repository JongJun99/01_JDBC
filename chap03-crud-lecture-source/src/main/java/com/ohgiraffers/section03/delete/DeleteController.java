package com.ohgiraffers.section03.delete;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class DeleteController {

    public int deleteMenu(int menuCode){

        Connection con = getConnection();
        PreparedStatement pstmt = null;

        int result = 0;

        Properties prop2 = new Properties();

        try {
            prop2.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));
            String query = prop2.getProperty("deleteMenu");


            try {
                pstmt = con.prepareStatement(query);
                pstmt.setInt(1, menuCode);

                result = pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
