/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author lenovo
 */
public class Label {
    public int width;
    public String text;
    
    public Label(String text, int width){
        this.width = width;
        this.text = text;
    }
    
    public void draw(){
        if(text.length()>width){
            System.out.println("|"+" ".repeat(2)+ text + " "+"|");
        }else{
            System.out.println("|"+" ".repeat(2)+ text + " ".repeat(width-2-text.length())+"|");
        }
        
    }
}


/*
Nama : Filipus Arif Kristiyan
Nim  : A11.2022.14278
Kel  : A11.44UG1
tgl  : 8 April 2024
*/