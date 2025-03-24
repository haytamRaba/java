import java.util.Scanner;

public class Utilisateur extends Personne {

   private String email;
   private String motDepasse;
   private String nomRole;
   private static int id = 0;
   Scanner sc;

   Utilisateur() {
      this.sc = new Scanner(System.in);
   }

   Utilisateur(String nom, String prenom, int age, String email, String motDePasse, String nomRole) {
      super( nom , prenom , age);
      this.sc = new Scanner(System.in);
      this.email = email;
      this.motDepasse = motDePasse;
      this.nomRole = nomRole;
      ++id;
   }

   void setEmail(String email) {
      this.email = email;
   }

   void setmotDepasse(String motDePasse) {
      this.motDepasse = motDePasse;
   }

   void setRole() {
      System.out.println(" saisir le role :");
      System.out.println(" Employe : 1 ");
      System.out.println(" Administrateur : 2");
      System.out.println(" Client : 3 ");
      System.out.print("  : ");
      int choix= this.sc.nextInt();
      this.sc.nextLine();
      if ( choix == 1) {
         this.nomRole = "Employe";
      } else if (choix == 2) {
         this.nomRole = "Administrateur";
      } else if (choix == 3) {  // Corrigé: var1 == 3 au lieu de var1 == 2
         this.nomRole = "Client";
      } else {
         System.out.println("1 ou 2 ou 3 ");
      }
   }

   String getEmail() {
      return this.email;
   }

   String getMotDePasee() {
      return this.motDepasse;
   }

   String getNoRole() {
      return this.nomRole;
   }

   int getID() {
      return id;
   }

   void ajouterUtilisateur() {
      System.out.println("ajouter un utilisateur");
      System.out.print("  nom : ");
      String nom = this.sc.nextLine();  
      this.setNom(nom);  
      
      System.out.print("prenom : ");
      String prenom = this.sc.nextLine();  
      this.setPrenom(prenom); 
      
      System.out.print("email : "); 
      this.email = this.sc.nextLine();

      System.out.print("mot de passe : ");  
      this.motDepasse = this.sc.nextLine();
      
      this.setRole();
      ++id;
      System.out.println("l utilisateur a ete ajoute avec  id : " + id);
   }

   @Override 
   void getInfosPersonne() {
      super.getInfosPersonne(); 
      System.out.println("| email : " + this.email + "  | ");
      System.out.println("| motdepasse : " + this.motDepasse + " |");
      System.out.println("| role : " + this.nomRole + " |");  
      System.out.println("-------------------------");
      System.out.println();
   }
}