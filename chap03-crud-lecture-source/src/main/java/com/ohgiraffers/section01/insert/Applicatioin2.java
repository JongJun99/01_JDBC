package com.ohgiraffers.section01.insert;

import com.ohgiraffers.model.dto.MenuDTO;

import java.util.Scanner;

public class Applicatioin2 {

    public static void main(String[] args) {
        /*1. 메뉴의 이름, 가격, 카테고리 코드, 판매여부를 입력받기 (Scanner 이용)*/

        Scanner sc = new Scanner(System.in);


        System.out.print("메뉴의 이름 :");
        String menuName = sc.nextLine();

        System.out.print("메뉴의 가격 :");
        int menuPrice = sc.nextInt();

        System.out.print("카테고리 코드 :");
        int categoryCode = sc.nextInt();

        System.out.print("판매여부(Y/N) :");
        sc.nextLine();  //버퍼에 개행문자가 남아있기 때문에 제거하기 위해
        String orderableStatus = sc.nextLine().toUpperCase();

        /* MenuDTO 객체를 생성하여 입력받은 값으로 setting*/
        MenuDTO newMenu = new MenuDTO();
        newMenu.setMenuName(menuName);
        newMenu.setMenuPrice(menuPrice);
        newMenu.setCategoryCode(categoryCode);
        newMenu.setOrderableStatus(orderableStatus);

        /*InsertController의 insert() 메소드를 호출*/
        insertController ic = new insertController();
        int result = ic.insertMenu(newMenu);

        /*insert 결과에 따라서 성공이면 메뉴 등록 성공, 실패이면 메뉴등록 실패*/
        if(result > 0) {
            System.out.println("메뉴 등록 성공");
        } else {
            System.out.println("메뉴 등록 실패");
        }
    }
}
