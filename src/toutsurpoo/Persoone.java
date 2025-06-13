/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toutsurpoo;

/**
 *
 * @author KAPTUE PATRICE
 */
public class Persoone {
   //private static int nbrePers;
   private String nom;
   private String prenom;
   private int age ;
   
   public Persoone(String nom,String prenom, int age){
       //nbrePers++;
       this.nom = nom;
       this.prenom= prenom;
       this.age=age;    
   }
//   public static int getNbre(){
//       return nbrePers;
//   }
//   public static void setNbre(){
//       Persoone.nbrePers++;
//   }
   @Override
    public String toString(){
          return "Nom: " + this.nom + "Prenom: " + this.prenom + " Age: " + this.age ;
        }   
   
   public String getNom(){
       return this.nom;
   }
   public void setNom(String _nom){
        this.nom=_nom;
   }
   public  String getPrenom(){
     return this.prenom;
   }
   public void setPrenom(String _prenom){
       this.prenom=_prenom;   
   }
   public int getAge(){
     return this.age;
   }
   public void setAge(int _age){
       this.age=_age;
   }
        
}
