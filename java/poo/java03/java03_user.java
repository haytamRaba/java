package java03;
public class java03_user{

  String username;
  String email;
  int age;
//overloaded constructors

  java03_user(){
    this.username = "guest";
    this.email = " not provided ";
    this.age = 0 ;
  }
    java03_user(String username){
    this.username = username;
    this.email = " not provided ";
    this.age = 0 ;
  }
  java03_user(String username,String email){
    this.username = username;
    this.email = email;
    this.age = 0 ;

  }
  java03_user(String username,String email,int age ){
    this.username = username;
    this.email = email;
    this.age = age ;

  }



}