package Service;

public class Apprentice extends Master implements Advisor {
    public Apprentice(String name) {
        super(name, "Apprentice");
    }

    @Override
    public void askForAdvice() {
        System.out.println(description + " asks for advice.");
    }

    @Override
    public void giveAdvice() {
        throw new UnsupportedOperationException("Apprentice cannot give advice!");
    }
}
