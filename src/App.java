
import Controller.ContactoController;
import Controller.Ejercicios;


    public class App {
        public static void main(String[] args) throws Exception {
           /*  Sets set = new Sets();
            System.out.println("Esteban Pesantez ");
            System.out.println("");
            runHashSet(set);
            runLinkedHashSet(set);
            runTreeSet(set);
            runTreeSetWithComparer(set);
            runTreeSetWithComparer2(set);*/
            
           /* ContactoController contactoController = new ContactoController();
            System.out.println("Contactos orden alfabetico apellido - nombre");
            contactoController.runTreeContacto();

            System.out.println("");
            
            System.out.println("Contactos orden alfabetico apellido - nombre - telefono (des)");
            contactoController.runTreeContactoConnumeroTacto(); */

             Ejercicios e = new Ejercicios();
            
        }

         /*  public static void runHashSet(Sets set){
            Set<String> palabras = set.construirHashSet();
            
            System.out.println("----HASHSET----");
            System.out.print("Elementos del HashSet (No se garantiza el orden)");
            System.out.println("");
            for (String palabra : palabras) {
                 System.out.println(palabra);
            }
        }

        public static void runLinkedHashSet(Sets set){
            Set<String> palabrasLinkeadas = set.construirLinkedHashSet();

            System.out.println("----LinkedHashSet----");   
            System.out.println("Elementos del LinkedHashSet(respeta orden deinserción)");

            for (String palabra : palabrasLinkeadas) {
                 System.out.println(palabra);
            }

        }

        public static void runTreeSet(Sets set){
            Set<String> palabrasTree= set.construirTreeSet();

             System.out.println("----TreeHashSet----"); 
              System.out.println("orden (xxxxxx)");  

             for (String palabra : palabrasTree) {
                 System.out.println(palabra);
            }
        }


        public static void runTreeSetWithComparer(Sets set){
            Set<String>  palabrasTreeComparador = set.construirTreeSetConComparador();

             System.out.println("----TreeSet con Comparador----");     
             System.out.println("Elementos del TreeSet (ordenadors por longitud y luego alfabéticamente):  ");
      

             for (String palabra : palabrasTreeComparador) {
                 System.out.println(palabra);
            }

        }

          public static void runTreeSetWithComparer2(Sets set){
            Set<String>  palabrasTreeComparador2 = set.construirTreeSetConComparador2();

             System.out.println("----TreeSet con Comparador----");     
             System.out.println("Elementos del TreeSet (ordenadors por longitud y luego alfabéticamente descendentemente):  ");
      

             for (String palabra : palabrasTreeComparador2) {
                 System.out.println(palabra);
            }

        }
        */
    }
