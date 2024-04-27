/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import java.util.Scanner;


/**
 *
 * @author lenovo
 */
public class Input implements Component{
    public String label;
    private Scanner input = new Scanner(System.in);;
    private String value;
    
    public Input(String label){
        this.label = label;
    }
    @Override
    public void draw(){
        System.out.print("|  " + label + " : ");
    }
    
    public String getValue(){
        return input.nextLine();
    }
    
    public int getValueInt(){
        return input.nextInt();
    }
    
    public double getValueDouble(){
        return input.nextDouble();
    }
}

/*
Nama : Filipus Arif Kristiyan
Nim  : A11.2022.14278
Kel  : A11.44UG1
tgl  : 8 April 2024
*/