package Game;

public class GameCli {
    public static void main(String[] args) {
        AbstractKnight simpleKnight = new SimpleKnight("Valiant");
        simpleKnight.attack();
        simpleKnight.avoidBattle();
        System.out.println("Power level -> " + simpleKnight.getPowerLevel());
        simpleKnight.description();
        System.out.println(simpleKnight);

        System.out.println("**************************************************");

        FirstRangKnightDecorator firstKnight = new FirstRangKnightDecorator(simpleKnight);
//        firstKnight.setKnightToDecorate(simpleKnight);
        firstKnight.attack();
        firstKnight.avoidBattle();
        System.out.println("Power level -> " + firstKnight.getPowerLevel());
        firstKnight.description();
        System.out.println(firstKnight);

        System.out.println("**************************************************");

        SecondRangKnightDecorator secondKnight = new SecondRangKnightDecorator(firstKnight);
//        secondKnight.setKnightToDecorate(firstKnight);
        secondKnight.attack();
        secondKnight.avoidBattle();
        System.out.println("Power level -> " + secondKnight.getPowerLevel());
        secondKnight.description();
        System.out.println(secondKnight);

    }
}
