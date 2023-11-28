//zad. 3
public class Student3 {
    //Definiowanie zmiennych
    private String imie;
    private String nazwisko;
    private int nrIneksu;
    private String kierunek;
    private int rokStudiow;
    //Tworzenie konstruktora i nadanie wartości zmiennym
    public Student3()
    {
        imie="Adam";
        nazwisko="Nowak";
        nrIneksu=12345;
        kierunek="Zarzadzanie";
        rokStudiow=2;
    }
    //Tworzenie funkcji wyświetlającej wartości zmiennych
    public void wyswietl()
    {
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Nr. indeksu: "+nrIneksu);
        System.out.println("Kierunek: "+kierunek);
        System.out.println("Rok studiów: "+rokStudiow);
    }
    public static void main(String[] args)
    {
        System.out.println("Dane studenta: ");
        //Tworzenie obiektu klasy Student3 i jego wyswietlenie za pomoca funkcji
        Student3 s1=new Student3();
        s1.wyswietl();
    }
}
