import java.util.Date;

public class Human {
    String name;
    private String town;
    private int yearOfBirth;
    String post;

    public Human(String name, String town, int age, String post) {
        this.name=name;
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        Date date=new Date();
        int year=date.getYear();
        if (age<0) {
            this.yearOfBirth=0;
        } else {
            this.yearOfBirth = year +1900 - age;
        }
        this.post=post;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth<=0) {
            System.out.println("Неверно указан год!");
        } else {
            this.yearOfBirth=yearOfBirth;
        }
    }

    public void hello() {
        System.out.println("Привет! Меня зовут "+name+". Я из города "+getTown()+". Я родился в "+getYearOfBirth()+" году. Будем знакомы!");
    }

    public void hello2() {
        System.out.println("Привет! Меня зовут "+name+". Я из города "+getTown()+". Я родился в "+getYearOfBirth()+" году. Я работаю на должности "+post+". Будем знакомы!");
    }
}
