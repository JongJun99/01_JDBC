package com.ohgiraffers.section02.update;

import com.ohgiraffers.model.dto.MenuDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application2 {
    public static void main(String[] args) {

        /*1. 변경할 메뉴 코드, 이름, 가격을 입력 받기*/
        /*2. MenuDTO 객체를 생성하여 값을 setting*/
        /*3. UpdateController의 updateMenu() 메소드 호출*/
        /*4. update 결과에 따라서 성공, 실패 메세지 출력*/


        Scanner sc = new Scanner(System.in);

        System.out.println("변경할 메뉴 코드 :");
        int menuCode = sc.nextInt();

        System.out.println("메뉴 이름 :");
        sc.nextLine();
        String menuName = sc.nextLine();

        System.out.println("메뉴 가격");
        int menuPrice = sc.nextInt();

        MenuDTO mdto = new MenuDTO();
        mdto.setMenuCode(menuCode);
        mdto.setMenuName(menuName);
        mdto.setMenuPrice(menuPrice);

        updateControlloer uC = new updateControlloer();
        int result = uC.updateMenu(mdto);

        if(result >0) {
            System.out.println("결과 성공");
        } else {
            System.out.println("결과 실패");
        }

    }
}
