/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Place;

/**
 *
 * @author HS
 */
public class PlaceType {
    public static void main(String[] args) {
        int nID = 0;
        switch (nID){
            case 1:
	               System.out.println("Область");
                       break;
            case 2:
	               System.out.println("Район");
                       break;
            case 3:
	               System.out.println("Город");
                       break;
            case 4:
	               System.out.println("ПГТ");
                       break;
            case 5:
	               System.out.println("Село");
                       break;
            default:
                System.out.println("nID=0");
	break;
        }
    }
    
}
