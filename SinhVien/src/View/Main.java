/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.List;

/**
 *
 * @author unknow
 */

//Lớp Hiển thị giao diện cho người dùng lựa chọn
public class Main {
    public static void main(String[] args) {
        List l  = new List();
        System.out.println("--------Nhap Thong Tin Sinh Vien------");
        l.NhapThongTinSinhVien();
    }
}
