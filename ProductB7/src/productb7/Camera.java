/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productb7;

/**
 *
 * @author unknow
 */
public class Camera extends Product{
    private boolean hasWifi;

    @Override
    public void addNew() {
        super.addNew();
        System.out.println("Co Wifi hay khong (1/0)");
        int choice = sc.nextInt();
        if(choice ==1){
            hasWifi = true;
        }else {
            hasWifi = false;
        }
        
    }

    @Override
    public String toString() {
        return super.toString() + ", hasWifi=" + hasWifi;
    }
    
    
    
    public Camera() {
    }

    public Camera(boolean hasWifi, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasWifi = hasWifi;
    }
    
    
    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    
    
    
    
}
