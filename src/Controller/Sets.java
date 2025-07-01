package Controller;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets{

    public Sets(){

    }

    public Set<String> construirHashSet(){
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop"); 
        palabras.add("Manzana"); 
        palabras.add("Pera");  
        palabras.add("Celular"); 
        palabras.add("Laptop"); 
        palabras.add("Pera");  //No añade repetidos ojo, solo no agrega, solo palabras que no se repitan
        palabras.add("Laptop");

        return palabras;
    }

    public Set<String> construirLinkedHashSet(){
        Set<String> palabrasLinkeadas = new LinkedHashSet<>();
        palabrasLinkeadas.add("Laptop"); 
        palabrasLinkeadas.add("Manzana"); 
        palabrasLinkeadas.add("Pera");  
        palabrasLinkeadas.add("Celular"); 
        palabrasLinkeadas.add("Laptop"); 
        palabrasLinkeadas.add("Pera");  //No añade repetidos ojo, solo no agrega, solo palabras que no se repitan
        palabrasLinkeadas.add("Laptop"); 
        return palabrasLinkeadas;
    }


    public Set<String> construirTreeSet(){
        Set<String> palabrasTree = new TreeSet<>();
        palabrasTree.add("Laptop"); 
        palabrasTree.add("Manzana"); 
        palabrasTree.add("Pera");  
        palabrasTree.add("Celular"); 
        palabrasTree.add("Laptop"); 
        palabrasTree.add("Pera");  
        palabrasTree.add("Laptop"); 

        return palabrasTree;
    }

            

    public Set<String> construirTreeSetConComparador(){
            
            // Crear un Comparator
            Comparator<String> comparadorLongitud = new Comparator<String>(){
                @Override
                public int compare(String s1, String s2){
                    //Comparamos la longitud
                    int result = Integer.compare(s1.length(), s2.length());  
                    
                    if (result == 0) {
                        return s1.compareTo(s2);    
                    }

                    return result;

                }
            };


            Set<String> miTreeSet = new TreeSet<>(comparadorLongitud); // ordena los elementos en base al comparador

            miTreeSet.add("Laptop"); 
            miTreeSet.add("Manzana"); 
            miTreeSet.add("Pera");  
            miTreeSet.add("Celular"); 
            miTreeSet.add("Laptop"); 
            miTreeSet.add("Pera");  
            miTreeSet.add("Laptop"); 
            miTreeSet.add("Celulas");

            return miTreeSet; 
            
        }


        public Set<String> construirTreeSetConComparador2(){
            
            // Crear un Comparator
            Comparator<String> comparadorLongitud2 = new Comparator<String>(){
                @Override
                public int compare(String s1, String s2){
                    //Comparamos la longitud
                    int result = Integer.compare(s2.length(), s1.length()); 
                    
                    if (result == 0) {
                        return s2.compareTo(s1);    
                    }

                    return result;

                }
            };


            Set<String> miTreeSet = new TreeSet<>(comparadorLongitud2); // ordena los elementos en base al comparador

            miTreeSet.add("Laptop"); 
            miTreeSet.add("Manzana"); 
            miTreeSet.add("Pera");  
            miTreeSet.add("Celular"); 
            miTreeSet.add("Laptop"); 
            miTreeSet.add("Pera");  
            miTreeSet.add("Laptop"); 
            miTreeSet.add("Celulas");

            return miTreeSet; 
            
        }


}