public class Price {
    public static void main(String[] args) {
        String itemName = "Vacuum";
        double itemPrice = 154.23;

        int ruble = (int) itemPrice;
        //int kopeika = (int) ((itemPrice - ruble) * 100);
        int kopeika = (int) ((itemPrice%1)*100);

        //String priceString = String.format("%d rub. %02d kop.", ruble, kopeika);

        System.out.println("Item: " + itemName + " , price: " + ruble + " rub. " + kopeika + " kop.");
        //System.out.println("Item; " + itemName + " , price: " + priceString);

    }
}
