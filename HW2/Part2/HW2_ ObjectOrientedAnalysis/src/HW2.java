
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input;

        int menu;
        Form form=new Form();
         form.setVisible(true);
        
         do{
            Suits suits = null;
            System.out.println("Select that 3 basic types of suits");
            do{
                System.out.println("1->dec\n2->ora\n3->tor");
                System.out.print("Select : ");
                menu=scan.nextInt();
            }while(!(menu==1 || menu==2 ||menu==3));

            switch (menu) {
                case 1:
                    suits = new dec();
                    break;
                case 2:
                    suits = new ora();
                    break;
                default:
                    suits = new tor();
                    break;
            }
            do{
                System.out.println("Accessories");
                System.out.println("1->Flamethrower\n2->AutoRifle\n3->RocketLauncher\n4->Laser\nOkay->0(sıfır)");
                System.out.print("Select : ");
                menu=scan.nextInt();

                switch (menu) {
                    case 1:
                        suits = new Flamethrower(suits);
                        break;
                    case 2:
                        suits = new AutoRifle (suits);
                        break;
                    case 3:
                        suits = new RocketLauncher (suits);
                        break;
                    case 4:
                        suits = new Laser(suits) ;
                        break;
                    default:
                        if(menu!=0)
                            System.out.println("Böyle bir accessor mağzada bulunmamaktadır.");
                        break;
                }


            }while(menu!=0);
        
            System.out.println(suits.getDescription()+ " $" + suits.cost()+","+suits.weight()+"kg");
        
       
            System.out.println("Çıkmak için -> q\nYeni bir işlem için-> x(herhangi bir tuşa basın) ");
            System.out.print("Select : ");
            input=scan.next();
        }while(!(input.equals("q") || input.equals("Q")));
       
    }
    
}
