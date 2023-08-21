public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int carType = scanner.nextInt();
        int mileage = scanner.nextInt();
        Car car;
        String carName;

        if (carType == 0) {
            car = new WagonR(mileage);
            carName = "WagonR";
        } else if (carType == 1) {
            car = new HondaCity(mileage);
            carName = "HondaCity";
        } else {
            car = new InnovaCrysta(mileage);
            carName = "InnovaCrysta";
        }

        String sedanText = car.getIsSedan() ? "is Sedan" : "is not Sedan";
        System.out.printf("A %s %s, is %d-seater, and has a mileage of around %s.%n", carName, sedanText, car.getSeats(), car.getMileage());
    }
}

abstract class Car {

    abstract boolean getIsSedan();
    abstract int getSeats();
    abstract String getMileage();
}

class WagonR extends Car {
    private int mileage;

    WagonR(int mileage) {
        this.mileage = mileage;
    }

    @Override
    boolean getIsSedan() {
        return false;
    }

    @Override
    int getSeats() {
        return 4;
    }

    @Override
    String getMileage() {
        return mileage + " kmpl";
    }
}

class HondaCity extends Car {
    private int mileage;

    HondaCity(int mileage) {
        this.mileage = mileage;
    }

    @Override
    boolean getIsSedan() {
        return true;
    }

    @Override
    int getSeats() {
        return 4;
    }

    @Override
    String getMileage() {
        return mileage + " kmpl";
    }
}

class InnovaCrysta extends Car {
    private int mileage;

    InnovaCrysta(int mileage) {
        this.mileage = mileage;
    }

    @Override
    boolean getIsSedan() {
        return false;
    }

    @Override
    int getSeats() {
        return 6;
    }

    @Override
    String getMileage() {
        return mileage + " kmpl";
    }
}

