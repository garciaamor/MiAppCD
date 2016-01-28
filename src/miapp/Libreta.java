package miapp;

import javax.swing.JOptionPane;

public class Libreta {
    
    public Contacto []arrayContactos=new Contacto[10];
    private String propietario;
    private String dni;
    public Contacto contacto1, contacto2, contacto3, contacto4, contacto5, contacto6, contacto7, contacto8, contacto9, contacto10;
        
    public Libreta() {
    }

    public Libreta(String propietario, String dni) {
        this.propietario = propietario;
        this.dni = dni;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
     public String pedirNome(Contacto contacto){
           return JOptionPane.showInputDialog("Introduce el nombre del alumno");
       }
    public void engadir(){
        int libre=cualLibre();
        if (libre<0){
            System.out.println("No hay hueco");
            }
        else {
        String nom=JOptionPane.showInputDialog("Introduzca nombre");
        String ape=JOptionPane.showInputDialog("Introduzca apellido");
        String tel=JOptionPane.showInputDialog("Ponga el telefono");
        String corr=JOptionPane.showInputDialog("Escriba el correo electronico");
        
        arrayContactos[libre-1].setNombre(nom);
        arrayContactos[libre-1].setApellidos(ape);
        arrayContactos[libre-1].setTelefono(tel);
        arrayContactos[libre-1].setCorreoElec(corr);}
    }
    public void listar(){
        
        
    }
    public int cualLibre(){
        for (int i=0;i<arrayContactos.length;i++){
               if (arrayContactos[i].getNombre().equals(""))
                   return i;
               } 
                   return -1;
         
    

    }
}
