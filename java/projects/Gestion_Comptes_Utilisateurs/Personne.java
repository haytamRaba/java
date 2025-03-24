
public class Personne {

private String nom;
private String prenom;
private int age;

Personne(){

}

Personne( String nom , String prenom , int age ){
  this.nom = nom;
  this.prenom = prenom;
  this.age = age;
}

void setNom(String nom){
  this.nom = nom;
}

void setPrenom(String prenom){
  this.prenom=prenom;
}

void setAge(int age){
  this.age = age;
}

String getNom(){
  return this.nom;
}

String getPrenom(){
  return this.prenom;
}

int getAge(){
  return this.age;
}

void getInfosPersonne(){
  
  System.out.println();
  System.out.println(" infomration : ");
  System.out.println("-------------------------");
  
  System.out.println("| nom     : " + this.nom + "       |" );
  System.out.println("| prenom  : " + this.prenom + "      |");
  System.out.println("| age     : " + this.age + "         |");
  
}




  
}
