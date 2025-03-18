public class PointI1{

  private String nom;
  private int x;

  public PointI1(String nom, int x){
    this.nom =nom;
    this.x = x;
  }
  public PointI1(String nom ){
    this.nom = nom;
    x = 0;
  }

    public void setnom(String nom){ this.nom = nom ;}
    public void setx(int x){this.x = x; }
    public String getnom(){return this.nom;}
    public int getx(){return this.x;}

    @Override
    public String toString(){
      return this.nom + "(" + this.x + ")";
    }

}