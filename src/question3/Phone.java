package question3;

public class Phone extends Device implements MobileNetwork{
    private int batteryLevel;

    public Phone(int i, int i1) {
        this.setWidth(i);
        this.setHeight(i1);
    }

    public Phone(String android_os) {
        this.setOperatingSystem(android_os);
    }

    public Phone() {
    }

    public boolean isTactile() {
        return true;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String networkType() {
        return "4G";
    }
}
