package com.ohgiraffers.section03.delete;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        /*1. 삭제할 메뉴 코드 입력받기*/
        /*2. DeleteController의 deleteMenu 메소드 호출*/
        /*3. delete 결과에 따라 성공이면 '메뉴 삭제 성공!', 실패이면 '메뉴 삭제 실패'*/

        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 메뉴 코드 입력 : ");
        int menuCode = sc.nextInt();

        DeleteController dc = new DeleteController();
        int result = dc.deleteMenu(menuCode);

        if(result > 0) {
            System.out.println("메뉴 삭제 성공");
        } else {
            System.out.println("메뉴 삭제 실패");
        }
    }
}
