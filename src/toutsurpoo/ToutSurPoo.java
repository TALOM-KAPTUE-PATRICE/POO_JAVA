/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package toutsurpoo;

/**
 *
 * @author KAPTUE PATRICE
 */
public class ToutSurPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoone pers = new Persoone("TALOM","Patrice",19);
        System.out.println("Le nom est: " + pers.getNom());
        System.out.println("Le prenom est: " + pers.getPrenom());
        System.out.println("l'age est: "+ pers.getAge());
        pers.setNom("TOBOU");
        System.out.println("Le nom est: " + pers.getNom() + " Le prenom est: " + pers.getPrenom()+
           " l'age est: "+ pers.getAge());
        
        Etudiant etu = new Etudiant("GL2B234","INFORMATIQUE",pers);
         System.out.println("le matricule: " + etu.getMatricule()+ " la profession: " + etu.getProfession()  
                 + " personne: " + etu.getPersonne());
         Persoone Nouvellepers = new Persoone("TOUMSI","Ledou",10);
    
         etu.setPersonne(Nouvellepers);
         System.out.println("le matricule: " + etu.getMatricule()+ " la profession: " + etu.getProfession()  
                 + " personne: " + etu.getPersonne().getAge());
         System.out.println(etu.toString());
         
         Rectangle rect = new Rectangle();
         rect.dessiser();
         rect.afficher();
        
    }
    
}
