import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        Human maksim=new Human("Максим", "Минск", 35,"продакт-менеджер");
        Human anya=new Human("Аня", "Москва", 29,"продакт-менеджер");
        Human katya=new Human("Катя", "Калининград", 28,"продакт-менеджер");
        Human artem=new Human("Артем", "Москва", 27,"директор по развитию бизнеса");
        Human ivan=new Human("Иван",null,-100,"директор по развитию бизнеса");
        Human vladimir=new Human("Владимир","Казань",21,"не работаю");

        ivan.setYearOfBirth(1991);
        ivan.setTown("Москва");

        //Задание 2
        Flower rosa =new Flower("Роза обыкновенная","","Голандия",35.59,3);
        Flower pion =new Flower("Пион","","Англия",69.9,1);

        //Задание Б1
        Car granta=new Car("Lada","Granta","1,7 л.","жёлтый", -2015,"Россия");
        Car a8=new Car("Audi","A8 50 L TDI quattro","3,0 л.","чёрный", 2020,"Германия");
        Car z8=new Car("BMW","Z8","3,0 л.","чёрный", 2018,"Германия");
        Car sportage4=new Car("Kia","Sportage 4-го поколения","2,4 л.","красный", 2018,"Южная Корея");
        Car avante=new Car("Hyundai","Avante","1,6 л.","оранжевый", 2016,"Южная Корея");
        Car murcielago=new Car("Lamborghini","Murcielago","6,19 л.","оранжевый", 2010,"Италия");

        Key murcielagoKey=new Key(murcielago,1,1);
        Key grantaKey=new Key(granta,0,0);

        Insurance murcielagoIns=new Insurance(murcielago,"a12345678",2024,10000);
        Insurance grantaIns=new Insurance(granta,"a12345679",2025,5000);


        murcielago.setTransmission("механическая");
        murcielago.setBodyType("купе");
        murcielago.setSeating(2);
        murcielago.setRegistrationNumber("a234bc789");
        murcielago.setTiresType("летняя");
        murcielago.changeTiresType();

        System.out.println("Задание 1");
        maksim.hello();
        anya.hello();
        katya.hello2();
        artem.hello2();
        ivan.hello2();
        vladimir.hello2();
        System.out.println("Задание 2");
        rosa.flowerInfo();
        Flower.calculationflower(rosa,rosa,pion);
        System.out.println("Задание Б1");
        granta.carInfo();
        a8.carInfo();
        z8.carInfo();
        sportage4.carInfo();
        avante.carInfo();
        murcielago.carInfo();
        System.out.println("Задание В1");
        Key.printKeyInfo(murcielago,murcielagoKey);
        Key.printKeyInfo(granta,grantaKey);
        System.out.println("Задание В2");
        Insurance.printInsuranceInfo(murcielago,murcielagoIns);
        Insurance.printInsuranceInfo(granta,grantaIns);
    }
}