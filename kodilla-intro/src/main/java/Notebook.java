public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook (int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good");
        } else if (this.price > 1000){
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light");
        } else if (this.weight >= 1000 && this.weight <= 1500) {
            System.out.println("This notebook is not too heavy");
        } else if (this.weight > 1500){
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkYearAndPrice() {
        if (this.year < 2018) {
            System.out.println("This notebook is old");
        } else if (this.year >= 2018 && this.year <= 2020) {
            System.out.println("This notebook is not that old");
        } else if (this.year > 2020) {
            System.out.println("This notebook is new");
        }

        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive");
        }
    }
}
