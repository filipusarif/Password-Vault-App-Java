/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author lenovo
 */
public class HLine implements Component{
    public int width;
    
    public HLine(int width){
        this.width = width;
    }
    @Override
    public void draw(){
        System.out.println("+" + "=".repeat(width) + "+");
    }
}

/*
Nama : Filipus Arif Kristiyan
Nim  : A11.2022.14278
Kel  : A11.44UG1
tgl  : 8 April 2024
*/
