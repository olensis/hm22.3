import java.util.Iterator;
import java.util.Objects;

public class Passport {
    private String name;
    private String surname;
    private String patronymic;
    private int birthYear;
    private static int count = 0;
    private  int pasportNumber;

    public Object getPasportNumber() {
        return null;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthYear=" + birthYear +
                ", pasportNumber=" + pasportNumber +
                '}';
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) ;
        System.out.println("Неверное значение");
        this.name = name;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isEmpty() || surname.isBlank()) ;
        System.out.println("Неверное значение");
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return pasportNumber == passport.pasportNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pasportNumber);
    }

    public Passport(String name, String surname, String patronymic, int birthYear, int pasportNumber) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        if (birthYear == 0){
            System.out.println("Неверное значение");
        }
        this.pasportNumber = pasportNumber;
        if (pasportNumber == 0){
            System.out.println("Неверное значение");}
        count = count++;

    }

    public void addPassport(Passport passport) {
        addPassport(passport);
        if (pasportNumber == pasportNumber) {
            name = name;
            surname = surname;
            birthYear = birthYear;
            patronymic = patronymic;

        }
    }
}


