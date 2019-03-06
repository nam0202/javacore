/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.SinhVien;
import Model.SinhVienModel;

/**
 *
 * @author Namph
*/

// Lớp chuyên xử lý yêu cầu của người 
public class List {
    private SinhVienModel svm;
    public List(){
        this.svm = new SinhVienModel();
    }
    public void NhapThongTinSinhVien(){
        SinhVien sv  = new SinhVien();
        boolean result = this.svm.addSV(sv);
        if(result){
            System.out.println("Nhap Thanh Cong");
        }else{
            System.out.println("Nhap That Bai");
        }
    }
}
