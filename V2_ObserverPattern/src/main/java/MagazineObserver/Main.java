package MagazineObserver;

public class Main {
    public static void main(String[] args) {

//        kreiranje publishera
        MagazinePublisher magazinePublisher = new MagazinePublisher("Vouge");
        MagazinePublisher magazinePublisher1 = new MagazinePublisher("Adria");

//        kreiranje subscribera
        MagazineSubscriber subscriber1 = new MagazineSubscriber("Ana");
        MagazineSubscriber subscriber2 = new MagazineSubscriber("Marija");
        MagazineSubscriber subscriber3 = new MagazineSubscriber("Iva");
        MagazineSubscriber subscriber4 = new MagazineSubscriber("Lucija");


//        pretplatnici se prijavljuju na časopise
        magazinePublisher.addSubscriber(subscriber1);
        magazinePublisher.addSubscriber(subscriber2);
        magazinePublisher.addSubscriber(subscriber3);

        System.out.println("----------------------------------------");

        magazinePublisher1.addSubscriber(subscriber3);
        magazinePublisher1.addSubscriber(subscriber4);

        System.out.println("----------------------------------------");

//        pretplatnik se ponovno prijavljuje na časopis (provjera)
        magazinePublisher.addSubscriber(subscriber1);

        System.out.println("----------------------------------------");

//        izdavači objavljuju nova izdanja
        magazinePublisher.releaseNewIssue();
        magazinePublisher1.releaseNewIssue();

        System.out.println("----------------------------------------");

//        pretplatnik se odjavljuje
        magazinePublisher.removeSubscriber(subscriber1);
        magazinePublisher.removeSubscriber(subscriber2);
        magazinePublisher.removeSubscriber(subscriber3);

        System.out.println("----------------------------------------");


//        pretplatnik se opet odjavljuje (provjera)
        magazinePublisher.removeSubscriber(subscriber1);

        System.out.println("----------------------------------------");


//        izdavač objavljuje novo izdanje
        magazinePublisher.releaseNewIssue();
    }
}
