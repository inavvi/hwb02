package transport;

public class Car {
    private String brand;
    private String model;
    String engineVolume;
    String color;
    private int productionYear;
    private String productionCountry;
    String transmission;
    private String bodyType;
    String registrationNumber;
    private int seating;
    String tiresType;
    Key key;

    public Car(String brand, String model, String engineVolume, String color, int productionYear, String productionCountry) {
        this.brand=brand;
        this.model=model;
        this.engineVolume=engineVolume;
        this.color=color;
        this.productionYear=productionYear;
        if (productionYear<=0) {
            this.productionYear=2000;
        }
        this.productionCountry=productionCountry;
        this.transmission=null;
        this.bodyType=null;
        this.registrationNumber=null;
        this.seating=0;
        this.tiresType=null;
        this.key=null;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeating() {
        return seating;
    }

    public String getTiresType() {
        return tiresType;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setBodyType(String bodyType) {
        if(bodyType!=null) {
            this.bodyType = bodyType;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {

        if (registrationNumber.length() != 9) {
            this.registrationNumber = "Ошибка! Не соответсует формату: х000хх000.";
        } else {
            char chars[] = registrationNumber.toCharArray();
            if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
                this.registrationNumber = "Ошибка! Не соответсует формату: х000хх000.";
            } else {
                if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2])||!Character.isDigit(chars[3])||!Character.isDigit(chars[6])||!Character.isDigit(chars[7])||!Character.isDigit(chars[8])) {
                    this.registrationNumber = "Ошибка! Не соответсует формату: х000хх000.";
                } else {
                    this.registrationNumber = registrationNumber;
                }
            }
        }
    }

    public void setSeating(int seating) {
        if (seating!=0) {
            this.seating = seating;
        }
    }

    public void setTiresType(String tiresType) {
        this.tiresType = tiresType;
    }

    public void changeTiresType() {
        String winter="зимняя";
        String summer="летняя";
        if (this.tiresType.equals(winter)) {
            this.tiresType="летняя";
        }
        if (this.tiresType.equals(summer)) {
            this.tiresType="зимняя";
        }
    }

    public void carInfo () {
        System.out.println(brand+" "+model+", цвет кузова "+color+", объём двигателя "+engineVolume+", год выпуска "+productionYear+", сборка "+productionCountry+", коробка передач "+transmission+", тип кузова "+bodyType+", регистрационный номер "+registrationNumber+", количество мест "+seating+", тип резины "+tiresType+".");
    }


    public static class Key {

        private String cark;
        private String functionA;
        private String functionB;



        public Key(Car car, int a, int b) {
            this.cark=car.getModel();
            //this.carKey=car.getModel();//car.getBrand()+" "+car.getModel();//brand+" "+model+", цвет кузова "+color+", объём двигателя "+engineVolume+", год выпуска "+productionYear+", сборка "+productionCountry+", коробка передач "+transmission+", тип кузова "+bodyType+", регистрационный номер "+registrationNumber+", количество мест "+seating+", тип резины "+tiresType+".";
            if (a==0 || a!=1) {
                this.functionA = "опция удаленный запуск двигателя - нет";
            } else {
                this.functionA = "опция удаленный запуск двигателя";}
            if (b==0 || b!=1) {
                this.functionB = "опция бесключевой доступ - нет";
            } else {
                this.functionB = "опция бесключевой доступ";}

            }


        public String getCark() {
            return cark;
        }

        public String getFunctionA() {
            return functionA;
        }

        public String getFunctionB() {
            return functionB;
        }

        public static void printKeyInfo(Car car, Key key) {
            if (car.getModel().equals(key.getCark())) {
                System.out.println(car.getBrand()+" "+car.getModel()+", "+key.functionA+", "+key.functionB+".");
            } else {
                System.out.println("Ключ не найден!");
            }

        }
    }


    public static class Insurance {

        private String cari;
        private String number;
        private int date;
        private int cost;

        public Insurance(Car car, String number, int date, int cost) {
            this.cari= car.getModel();
            if (number.length()==9) {
            this.number=number; }
            this.date=date;
            this.cost=cost;
        }

        public String getCari() {
            return cari;
        }

        public String getNumber() {
            return number;
        }

        public int getDate() {
            return date;
        }

        public int getCost() {
            return cost;
        }

        public static void printInsuranceInfo(Car car, Insurance insurance) {
            if (car.getModel().equals(insurance.getCari())) {
                System.out.println(car.getBrand()+" "+car.getModel()+", номер страховки: "+insurance.number+", дата окончания: "+insurance.date+", стоимость: "+insurance.cost+" руб.");
            } else {
                System.out.println("Страховка не найдена!");
            }

        }
    }

}
