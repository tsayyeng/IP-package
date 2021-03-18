import IpPackage?.*;
class IpTest? {

    public static void main (String args[]) {
        IpPackage? ip1 = IpPackage?.getInstance(192,168,0,7);
        System.out.println("\nLa suite ...");
        System.out.println("\n --> " + ip1.ToString?());
        
       import IpPackage?.*;
class IpTest? {

    public static void main (String args[]) {
        IpPackage? ip1 = IpPackage?.getInstance(192,168,0,7);
        System.out.println("\nLa suite ...");
        System.out.println("\n --> " + ip1.ToString?());
        IpPackage? ip2 = IpPackage?.getInstance(128,69,20,30);
        System.out.println("\nLa suite ...");
        System.out.println("\n --> " + ip2.ToString?());
            IpPackage? ip3 = IpPackage?.getInstance(192,25,66,01);
        System.out.println("\nLa suite ...");
        System.out.println("\n --> " + ip3.ToString?());
        System.out.println("L'ip 1 est-elle dans le meme reseau que l'ip 2 ? " + ip1.estMemeReseau(ip2));
        System.out.println("L'ip 1 est-elle dans le meme reseau que l'ip 3 ? " + ip1.estMemeReseau(ip2));
        }
    }

 import IpPackage?.*;
import java.util.Scanner;
class IpTest? {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir les octets afin d'obtenir une ip de classe C");
        int Octet = sc.nextInt();
        int Octet1? = sc.nextInt();
        int Octet2? = sc.nextInt();
        int Octet3? = sc.nextInt();
        IpPackage? ip4 = IpPackage?.getInstance(Octet,Octet1?,Octet2?,Octec3?) ;
        System.out.println("L'ip4 est de classe " + ip4.getClasse());
        
        
binary0 = Integer.toBinaryString(this.octet1);
binary1 = Integer.toBinaryString(this.octet2);
binary2 = Integer.toBinaryString(this.octet3);
binary3 = Integer.toBinaryString(this.octet4);
return binary0 + "." + binary1 + "." + binary2 + "." + binary3;
}

Méthode pour convertir en hexadécimale

public String toHexadecimal() {
hexa0 = Integer.toHexString(this.octet1).toUpperCase();
hexa1 = Integer.toHexString(this.octet2).toUpperCase();
hexa2 = Integer.toHexString(this.octet3).toUpperCase();
hexa3 = Integer.toHexString(this.octet4).toUpperCase();
return hexa0 + ":" + hexa1 + ":" + hexa2 + ":" + hexa3;
}