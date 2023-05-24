/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepagithub;

/**
 *
 * @author valeriazampetti
 */
public class Nodo {
    
    private Object dato;
    private Nodo pNext;
    
    public Nodo(Object dato) {
        this.dato = dato;
        pNext = null;
    }
    
    public Nodo() {
        User user = new User(25, "Jose", "Perez");
        int number = 2 * 3;
        Nodo newNode = new Nodo(user);
        this.dato = newNode;
        this.pNext= null;
    }
    
    public void duplicarEdad() {
        User usuario = (User) this.dato;
        usuario.setAge(usuario.getAge() * 2);
    }
    
    public Object getDato() {
        return dato;
    }
    
    public void setDato(Object dato) {
        this.dato = dato;
    }
    
    public Nodo getPnext() {
        return pNext;
    }
    
    public void setPnext(Nodo pnext) {
        this.pNext = pnext;
    }
    
}
