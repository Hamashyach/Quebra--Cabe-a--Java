/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca;

public abstract class Borda {
    private boolean a, b;
    
    public Borda(boolean a, boolean b){
        this.a = a;
        this.b = b;       
}
    public boolean getA(){
        return(a);
    }
    
    public void setA(boolean a){
        this.a = a;
    }
    
   public boolean getB(){
        return(b);
    }
    
    public void setB(boolean b){
        this.b = b;
    
    }
}
