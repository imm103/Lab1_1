//zad. 4
import java.util.Scanner;
public class Student4 {
    public static void main(String[] args)
    {
        //Tworzenie obiektu klasy scanner do wczytywania danych z klawiatury
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dodaj studenta: ");
        //Komunikat proszący o wprowadzenie danych
        System.out.print("Podaj imie: ");
        //Wczytanie wprowadzonego tekstu do zmniennej
        String imie = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.print("Podaj rok studiow: ");
        String rokStudiow = scanner.nextLine();
        System.out.print("Podaj kierunek: ");
        String kierunek = scanner.nextLine();

        System.out.println("Dodano studenta: ");
        //Wyświetlenie wprowadzonych danych ze zmiennych
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Rok studiow: "+rokStudiow);
        System.out.println("Kierunek: "+kierunek);
    }
}
