/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toutsurpoo;

/**
 *
 * @author KAPTUE PATRICE
 */ 
//la classe Etudiant est une classe Agregate car elle est composee ou contient une personne
public class Etudiant  {
    private String matricule;
    private String profession;
    private Persoone persoone; //agregation 
    
    public Etudiant(String _matricule,String _profession, Persoone _personne){
        this.matricule=_matricule;
        this.profession=_profession;
        this.persoone= _personne;
    }
    @Override
    public String toString(){   
     return "Matricule: " + this.matricule + " ,Profession: " + this.profession + "Personne: " + this.persoone.toString();
    }
    public String getMatricule(){
        return this.matricule;
    }
    public void setMatricule(String _matricule){
      this.matricule=_matricule;
    } 
    public String getProfession(){
       return this.profession;
    }
    public void setProfession(String _profession){
      this.profession=_profession;
    }
    public Persoone getPersonne(){
        return this.persoone;
    }
    public void setPersonne(Persoone personne){
        this.persoone=personne;
    }
    
}
