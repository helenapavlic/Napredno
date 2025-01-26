package Ships;

public class PirateCaptain extends Captain {
    public PirateCaptain(String captainName) {
        this.name = captainName;
    }

    @Override
    public void description() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "PirateCaptain [name=" + name + "]";
    }
}
