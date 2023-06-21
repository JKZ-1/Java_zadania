package zadania.computer;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    public int volumeUp() {
        return volumeLevel += 5;
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
        volumeLevel -= 2;
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

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level too low!");
        }
    }

    public void switchOff() {
        System.out.println("Wyłączam laptop: " + name);
        state = false;
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }
}

