package zadania.computer;

//Dodać pole sprawdzające, czy komputer jest podłączony do prądu.
//Następnie w metodzie switchOn dodać walidację, jeśli jest to włączamy, jeśli nie to komunikat.
public class PC extends Computer {

    private boolean isPowerSupply;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isPowerSupply = false;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPowerSupply) {
            super.switchOn();
        } else {
            System.out.println("The power supply is off");
        }

    }

    public void setPowerSupply(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }
}
