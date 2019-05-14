/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Eduardo Garcia
 */
public class Carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion = 0;
        Scanner ent = new Scanner(System.in);
        Llanta llantas_auto[] =  new Llanta[4];
        Renta rentas[] = new Renta[20];
        ArrayList<Renta> listaRenta = new ArrayList<Renta>();
        ArrayList<Automovil> listaAutomoviles = new ArrayList<Automovil>();
        
                Faro faros_auto[] =  new Faro[2];
        //Automovil autos_disponibles[] = new Automovil[5];
        llantas_auto[0] = new Llanta("15","Michellin","Deportivo");
        llantas_auto[1] = new Llanta("15","Michellin","Deportivo");
        llantas_auto[2] = new Llanta("15","Michellin","Deportivo");
        llantas_auto[3] = new Llanta("15","Michellin","Deportivo");
        
        faros_auto[0] = new Faro ("Zenon","BMV");
        faros_auto[1] = new Faro ("Zenon","BMV");
        
        /*autos_disponibles[0] = new Automovil(1,"RTES-47TR","Deportivo",550.50,1,new Motor("48RET-XSE",500,8),llantas_auto,faros_auto);
        autos_disponibles[1] = new Automovil(2,"RTES-47TR","Deportivo",550.50,1,new Motor("48RET-XSE",500,8),llantas_auto,faros_auto);
        autos_disponibles[2] = new Automovil(3,"RTES-47TR","Deportivo",550.50,1,new Motor("48RET-XSE",500,8),llantas_auto,faros_auto);
        autos_disponibles[3] = new Automovil(4,"RTES-47TR","Deportivo",550.50,1,new Motor("48RET-XSE",500,8),llantas_auto,faros_auto);
        autos_disponibles[4] = new Automovil(5,"RTES-47TR","Deportivo",550.50,1,new Motor("48RET-XSE",500,8),llantas_auto,faros_auto);
        */
        
        listaAutomoviles.add(new Automovil(1,"RTES-47TR","Deportivo",550.50,1,new Motor("48RET-XSE",500,8),llantas_auto,faros_auto));
        listaAutomoviles.add(new Automovil(2,"RTES-47TR","Deportivo",550.50,1,new Motor("48RET-XSE",500,8),llantas_auto,faros_auto));
        listaAutomoviles.add(new Automovil(3,"RTES-47TR","Deportivo",550.50,1,new Motor("48RET-XSE",500,8),llantas_auto,faros_auto));
        listaAutomoviles.add(new Automovil(4,"RTES-47TR","Deportivo",550.50,1,new Motor("48RET-XSE",500,8),llantas_auto,faros_auto));
        listaAutomoviles.add(new Automovil(5,"RTES-47TR","Deportivo",550.50,1,new Motor("48RET-XSE",500,8),llantas_auto,faros_auto));
        
        System.out.println("Renta de Automoviles S.A de C.V");
        do{
            System.out.println("Opciones disponibles \n 1.- Mostar vehiculos \n 2.- Mostrar usuarios que tienen renta \n 3.- Registrar renta \n 4.- Terminar renta \n 5.- Mostar precios de automoviles");
            opcion = ent.nextInt();
            switch(opcion){
                case 1: 
                    for(int r = 0; r < listaAutomoviles.size(); r++){
                        System.out.println(listaAutomoviles.get(r).getId_automovil() + " " + listaAutomoviles.get(r).getPrecio_renta_diario() + " " + listaAutomoviles.get(r).getIdentificador() + " " + listaAutomoviles.get(r).getTipo_automovil());
                    }
                    break;
                    
                case 2:
                    /*int conteo = 0;
                    for(int r = 0; r < rentas.length; r++){
                       if(rentas[r] != null){ 
                        if(rentas[r].getStatus_renta() ==1){
                            Persona usuario = rentas[r].getUsuario();
                            System.out.println(usuario.getNombre() + " " + usuario.getLicencia());
                            conteo++;
                            }
                        }
                    }
                    
                    if(conteo == 0);
                            System.out.println("No hay rentas registradas");*/
                    
                    if(listaRenta.isEmpty()){
                        System.out.println("No hay renta registradas");
                    }else{
                        Iterator<Renta> lrentas = listaRenta.iterator();
                        while(lrentas.hasNext()){
                            Renta r = (Renta) lrentas.next();
                            if(r.getStatus_renta() == 1){
                                Persona usuario = r.getUsuario();
                                System.out.println(usuario.getNombre() +" "+ usuario.getLicencia());
                            }
                            
                        } 
                    }
                    break;
                    
                case 3:
                    System.out.println("Datos de renta");
                    ent.nextLine();
                    Persona usuario_renta = new Persona(); 
                    
                    System.out.println("Nombre de persona");
                    usuario_renta.setNombre(ent.nextLine());
                    
                    System.out.println("Indique dirección");
                    usuario_renta.setDireccion(ent.nextLine());
                    
                    System.out.println("Indique teléfono");
                    usuario_renta.setNumero_celular(ent.nextLine());
                    
                    System.out.println("Indique tipo de sangre");
                    usuario_renta.setTipo_sangre(ent.nextLine());
                    
                    System.out.println("Número de licencia");
                    usuario_renta.setLicencia(ent.nextLine());
                    
                    Automovil automovil_renta = null;
                    do{
                        int c = 0;
                        System.out.println("Indique id del automovil");
                        int idAutomovil = ent.nextInt();
                        //automovil_renta = getAutomovilDisponible(idAutomovil,autos_disponibles);
                        Iterator<Automovil> lautos = listaAutomoviles.iterator();
                        while(lautos.hasNext()){
                            Automovil auto_actual = (Automovil) lautos.next();
                            
                            if(auto_actual.getStatus() == 1 && auto_actual.getId_automovil() == idAutomovil){
                                System.out.println("El automóvil no está disponible");
                                break;
                                
                            }else if(auto_actual.getStatus() == 1 && auto_actual.getId_automovil() == idAutomovil){
                                automovil_renta = auto_actual; 
                                listaAutomoviles.get(c).setStatus(2);
                                break;
                            }
                            c++;
                        }
                        
                    }while(automovil_renta == null);
                    
                    System.out.println("Indique días de renta");
                    int dias_renta = ent.nextInt();
                    Renta renta_actual = new Renta(usuario_renta,automovil_renta, new Date(),dias_renta,1);
                    
                    listaRenta.add(renta_actual);
                       
                    break; 
                    
                case 4:
                    if(listaRenta.isEmpty()) {
                        System.out.println("No hay renta registrada");
                    }else{
                        System.out.println("Indique id del automovil");
                        int idAutomovil = ent.nextInt();
                        boolean verificar = false;
                        
                        for(int r = 0; r < listaRenta.size(); r++){
                        if(listaRenta.get(r).getAuto_renta().getId_automovil() == idAutomovil && listaRenta.get(r).getStatus_renta() == 1){
                            listaRenta.get(r).setStatus_renta(2);
                            System.out.println("La renta se ha finalizado corectamente");
                            verificar = true;
                            break;
                            }    
                        }
                        if (!verificar){
                            System.out.println("No hay concidencias");
                        }
                    }
                    break;
                    
                case 5:
                    if(listaAutomoviles.isEmpty()){
                        System.out.println("No hay automoviles registrados"); 
                    }else{
                        for(int r = 0; r < listaAutomoviles.size(); r++){
                            System.out.println(listaAutomoviles.get(r).getIdentificador()+" "+listaAutomoviles.get(r).getPrecio_renta_diario());
                        }
                    }
                    break;
                    
                case 6:
                    if(listaRenta.isEmpty()){
                        System.out.println("No hay automoviles registrados");
                    }else{
                        Date now = new Date();
                        for(int r = 0; r < listaRenta.size(); r++){
                            if(listaRenta.get(r).getFecha_registro().compareTo(now) == 1){
                                
                            }
                        }
                    }
                    break;
                    
                default:
                    System.out.println("Opción no disponible, intente con otra opción");
                    
                } 
            
            }while(opcion != 0); 
        
        
        }
    
    
    public static Automovil getAutomovilDisponible(int id, Automovil[] automoviles){
     Automovil auto = null;
     for(int r = 0; r < automoviles.length; r++){
         if(automoviles[r].getStatus() == 1 && automoviles[r].getId_automovil() == id){
             auto = automoviles[r];
         }
     }
  
        return auto;        
    }

    }
    

