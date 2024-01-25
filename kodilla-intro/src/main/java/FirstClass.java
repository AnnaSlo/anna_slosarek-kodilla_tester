public class FirstClass {
    public static void main(String[] args) {
    Notebook notebook = new Notebook(600, 1000,2015);
    System.out.println("notebook.weight: " + notebook.weight + " , " + "nootebook.price: " + notebook.price+ " , " + "nootebook.year: " + notebook.year);
    notebook.checkPrice();
    notebook.checkWeight();
    notebook.checkYearAndPrice();

    Notebook heavyNotebook = new Notebook (2000, 1500,2020);
    System.out.println("heavyNotebook.weight: " + heavyNotebook.weight + " , " + "heavyNootebook.price: " + heavyNotebook.price+ " , " + "heavyNootebook.year: " + heavyNotebook.year);
    heavyNotebook.checkPrice();
    heavyNotebook.checkWeight();
    heavyNotebook.checkYearAndPrice();

    Notebook oldNotebook = new Notebook (1200,500,2024);
    System.out.println("oldNotebook.weight: " + oldNotebook.weight + " , " + "oldNootebook.price: " + oldNotebook.price+ " , " + "oldNootebook.year: " + oldNotebook.year);
    oldNotebook.checkPrice();
    oldNotebook.checkWeight();
    oldNotebook.checkYearAndPrice();

    }
}