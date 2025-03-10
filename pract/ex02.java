class ex02{
  public static void main( String [] args ){
    String email = "haytamraba11@gmail.com";
    String username;
    String domain;

    username = email.substring(email.indexOf("h"),email.lastIndexOf("@"));
    System.out.println("username : " + username);
    domain= email.substring(email.indexOf("@")+1,email.length());

    System.out.println("domain : " + domain);
    if(username.contains("1"))
    {
      username = username.replace("1"," ");
    }
    System.out.println("username2 : " + username);

  }
}