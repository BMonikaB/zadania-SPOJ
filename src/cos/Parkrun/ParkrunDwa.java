package cos.Parkrun;

/*
FR_05_04 - parkrun
Parkrun

Parkrun to cykliczne biegi na dystansie 5 km z pomiarem czasu organizowane w każdą sobotę o godzinie 9:00. Biegi te przeznaczone są dla każdego bez względu na biegowy staż, uzyskiwane rezultaty, czy też wiek. Udział w biegach jest bezpłatny na podstawie jednorazowej rejestracji w systemie parkrun. Uzyskany kod uczestnika pozwala na udział w dowolnej liczbie biegów, w dowolnej lokalizacji parkrun na świecie. Wszelkie informacje o biegach parkrun organizowanych w Polsce, w tym ich lokalizacje, znajdziesz na stronie parkrun.pl.

Wystarczy promocji, czas na zadanie.
Jednym z zadań wolontariuszy biegów parkrun jest pomiar czasu na mecie, przypisanie pozycji uczestnikom i połączenie tych danych za pomocą kodów kreskowych. Niestety w ostatnim biegu pewnej lokalizacji nastąpiła awaria skanera i poproszono uczestników, aby przesłali swoje dane i uzyskane czasy na mecie. Moglibyśmy poprosić Ciebie, abyś wygenerował ranking na podstawie odtworzonej listy rekordów, ale tym problemem zajmie się Jasiu. Ty masz zadanie prostsze. Wyznacz imię i nazwisko uczestnika, który uzyskał najlepszy czas. Jeśli istnieje co najmniej dwóch uczestników o jednakowych najlepszych czasach ukończenia biegu, wypisz ich wszystkich w kolejności takiej, jakiej ich dane pojawiły się na wejściu.

Wejście
W pierwszym wierszu wejścia znajduje się liczba całkowita n (1 ≤ n ≤ 105) oznaczająca liczbę uczestników biegu. W kolejnych n wierszach znajdują się rekordy, w których podane są kolejno imię, nazwisko oraz czas ukończenia biegu w formacie MM:SS. Imie i nazwisko to ciągi małych i dużych liter alfabetu łacińskiego, których długość nie przekracza 20 znaków.

Wyjście
Na wyjściu należy podać imię i nazwisko uczestnika biegu, który uzyskał najlepszy czas. Jeśli istnieje co najmniej dwóch uczestników o jednakowych najlepszych czasach ukończenia biegu, wypisz wszystkich w kolejności takiej, jakiej ich dane pojawiły się na wejściu.
 */

public class ParkrunDwa implements Comparable<ParkrunDwa>{

    private String name;
    private String lastName;
    private String time;

    public ParkrunDwa(String name, String lastName, String time) {
        this.name = name;
        this.lastName = lastName;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTime() {
        return time;
    }
    public ParkrunDwa(){};

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " " + time;
    }


    @Override
    public int compareTo(ParkrunDwa o) {
        return time.compareTo(o.time);
    }
}
