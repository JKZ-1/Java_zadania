package zadania.computer;

//Dodać pole sprawdzające, czy komputer jest podłączony do prądu.
//Następnie w metodzie switchOn dodać walidację, jeśli jest, to włączamy, jeśli nie to komunikat.
public class PC extends Computer {

    private boolean isPowerSupply;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isPowerSupply = false;
    }

    public int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public int volumeUp(int volumeLevelUp) {
        volumeLevel += volumeLevelUp;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
            return 100;
        } else {
            return volumeLevel;
        }
    }


    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int volumeLevelDown) {
        volumeLevel -= volumeLevelDown;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
            return 0;
        } else {
            return volumeLevel;
        }
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

    public void switchOff() {
        System.out.println("Wyłączam PC: " + name);
        state = false;
    }

    public void setPowerSupply(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }
}
