/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.SinhVien;
import java.util.ArrayList;

/**
 *
 * @author unknow
 */

//Lớp lấy dữ liệu và trả về cho Controller nếu cần
public class SinhVienModel {

    ArrayList<SinhVien> sv;
    public SinhVienModel(){
        this.sv = new ArrayList<>();
    }
    public boolean addSV(SinhVien sv) {
        try {
            this.sv.add(sv);
            
        } catch (Exception e) {
            return false;
        }finally{
            return true;
        }

    }
}
