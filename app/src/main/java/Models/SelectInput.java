/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author lenovo
 */
public class SelectInput {
    public String [] selection;
    public int width;
    public String label;
    private int value;
    Input input;
    
    public SelectInput(String label, String [] selection ,int width){
        this.label = label;
        this.selection = selection;
        this.width = width;
        input = new Input("Pilihan");
    }
    
    public void draw(){
        new Label(label,width).draw();
        int i=1;
        for(String select : selection){
            new Label(" ["+i+"] "+ select ,width).draw();
            i++;
        }
        input.draw();
    }
    
    public int getValue(){
        return input.getValueInt();
    }
}

/*
Nama : Filipus Arif Kristiyan
Nim  : A11.2022.14278
Kel  : A11.44UG1
tgl  : 8 April 2024
*/
