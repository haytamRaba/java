import java.util.Scanner;
import java.util.Random;

class ex01 {
  static void qst1() {
    int i = 1;
    System.out.println("question 1 :");
    while (i <= 10) {
      System.out.println(i);
      i++;
    }
  }
  static void qst2() {
    System.out.println("\nquestion 2 :\n");

    int i = 1;
    while (i <= 20) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
      i++;
    }
  }
  static void qst3() {

    Scanner sc = new Scanner(System.in);

    System.out.println("\nquestion 3 :\n");
    String name;
    String lname;

    System.out.print("entre vote nom : ");
    name = sc.nextLine();
    System.out.print("entre vote prenom : ");
    lname = sc.nextLine();
    System.out.println("Bonjour " + name + " " + lname + ", enchantes");
    sc.close();
  }

  static void qst4() {
    Scanner sc = new Scanner(System.in);

    int[] tab = new int[5];
    int i = 0;
    int sum = 0;
    double moy;
    int min;
    int max;

    while (i < 5) {
      System.out.print("tab[" + (i + 1) + "] : ");
      tab[i] = sc.nextInt();
      sum += tab[i];
      i++;
    }
    i = 0;
    min = max = tab[i];
    i += 1;
    while (i < 5) {
      if (min > tab[i]) {
        min = tab[i];
      }
      if (max < tab[i]) {
        max = tab[i];
      }
      i++;
    }

    moy = sum / 5;
    System.out.println("sum is :" + sum + " moyene: " + moy);
    System.out.println("min is : " + min + " max is : " + max);

    sc.close();
  }

  static int qst5(int n) {
    if (n == 0) {
      return 1;
    }
    return n * qst5(n - 1);

  }

  static double qst6(int n, int p) {
    return qst5(n) / qst5(n - p);

  }

  static double qst7(int p, int n) {
    return qst6(n, p) / qst5(p);
  }
  static void qst8() {
    Random ran = new Random();
    Scanner srandom = new Scanner(System.in);
    int x = ran.nextInt(100) + 1;
    int cpt = 5;
    int nb = -1;
    while ((cpt > 0) && (x != nb)) {

      if (x != nb) {
        System.out.println(" | nombre de tentative est : " + cpt);
        System.out.print(" | saisir un nbr entre ( 1 et 100 ) : ");
        nb = srandom.nextInt();
        srandom.nextLine();
      }

      if (x == nb) {
        System.out.println("\n | congratulations!!!! , ohooooo!\n");
        System.out.println(" | nbr est : " + x + " \" " + nb + " \" ");
      } else if (x > nb) {
        System.out.println(" | trop petit ! ");
      } else {
        System.out.println(" | trop grand !!");
      }
      System.out.println(" \n********************************* \n ");
      cpt--;
      if ((cpt == 0) && (x != nb)) {
        System.out.println("malheursment ! nbr de tentative est epuise, le nbr est : " + x + " try next time ! \n ");
      }
    }
    srandom.close();
  }

  public static void main(String[] args) {
    int i;
    Scanner s = new Scanner(System.in);

    System.out.print("quel question ?");
    i = s.nextInt();
    s.nextLine();

    switch (i) {
      case 1:
        qst1();
        break;
      case 2:
        qst2();
        break;
      case 3:
        qst3();
        break;
      case 4:
        qst4();
        break;
      case 5:
        int n = -1;
        while (n < 0) {
          System.out.print("entre un nombre strictement positif ! : ");
          n = s.nextInt();
          s.nextLine();
        }
        System.out.println(n + "! = " + qst5(n));
        break;
      case 6:
        int x = -1;
        int p = -1;

        while (x < 0 && p < 0) {
          System.out.print("enter p:");
          p = s.nextInt();
          s.nextLine();
          System.out.print("enter x: ");
          x = s.nextInt();
          s.nextLine();
        }
        System.out.println("Arrangment = " + qst6(p, x));
        break;
      case 7:
        int y = -1;
        int z = -1;

        while (y < 0 && z < 0) {
          System.out.print("enter p:");
          y = s.nextInt();
          s.nextLine();
          System.out.print("enter x: ");
          z = s.nextInt();
          s.nextLine();
        }
        System.out.println("Combinaisons = " + qst7(y, z));
        break;
      case 8:

           qst8();
        break;

      default:
        System.out.println("soon!");
        break;

    }

    s.close();
  }

}
