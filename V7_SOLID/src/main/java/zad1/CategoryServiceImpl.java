package zad1;

public class CategoryServiceImpl implements CategoryService{
    @Override
    public String categorize(Apartment apartment) {
        if (apartment.getPrice() > 1000) {
            return "Luxury";
        } else if (apartment.getPrice() > 500) {
            return "Standard";
        } else {
            return "Economy";
        }
    }
}
