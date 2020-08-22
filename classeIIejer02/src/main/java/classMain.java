/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class classMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Hola");
//        System.out.println(libro.toString());
//        System.out.println(objetolibro2.getNumeroPagina());

        Books objetolibro1 = new Books(1, "Po Java", 200, "Deitel");
        Books objetolibro2 = new Books(2, "Po PhP", 600, "Deitel");

        objetolibro1.setNumeroPagina(800);

        if (objetolibro1.getNumeroPagina() < objetolibro2.getNumeroPagina()) {
            System.out.println("El libro 2 tiene mayor numero de paginas que el libro 1, el libro 2 tiene este numero de paginas " + objetolibro2.getNumeroPagina());
            System.out.println("La informacion del libro 2 es " + objetolibro2.toString());
        } else {
            System.out.println("El libro 1 tiene mayor numero de paginas que el libro 2, el libro 1 tiene este numero de paginas " + objetolibro1.getNumeroPagina());
            System.out.println("La informacion del libro 1 es " + objetolibro1.toString());
        }
        
    }
    
}
