package cos.Zadanie;

public class Dane implements Comparable<Dane>{

    private String name;
    private String lastName;
    private int czas;

    Dane(){};


    public Dane(String name, String lastName, int czas) {
        this.name = name;
        this.lastName = lastName;
        this.czas = czas;
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

    public int getCzas() {
        return czas;
    }

    public void setCzas(int czas) {
        this.czas = czas;
    }

    @Override
    public String toString() {
        return "Imie :" + name + " Nazwisko :" + lastName + " Czas biegu :" + czas;
    }

    @Override
    public int compareTo(Dane o) {

        /*
        int kolejnoscSlow= lastName.compareTo(o.lastName);

        if(kolejnoscSlow ==0){
            return name.compareTo(o.name);
        }
        else {
            return kolejnoscSlow;
        }
*/
        return lastName.compareTo(o.lastName);    }

}
