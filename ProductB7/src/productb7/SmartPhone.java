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
public class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;

    @Override
    public void addNew() {
        super.addNew();
        System.out.println("Co camera hay khong (1/0)");
        int choice = sc.nextInt();
        if(choice ==1){
            hasCamera = true;
        }else {
            hasCamera = false;
        }
        System.out.println("Sim: ");
        sim = sc.nextInt();
        sc.nextLine();
        
    }

    @Override
    public String toString() {
        return super.toString() + ", hasCamera=" + hasCamera + ", sim=" + sim;
    }

    
    
    
    public SmartPhone() {
        super();
    }

    public SmartPhone(boolean hasCamera, int sim, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    
    
    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }
     
}
