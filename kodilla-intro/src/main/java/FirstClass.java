public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 2500, 2021);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkValueForMoney();

        Notebook heavyNotebook = new Notebook(2000, 4500, 2017);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkValueForMoney();

        Notebook oldNotebook = new Notebook(1200, 700, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkValueForMoney();

        Notebook quiteNewNotebook = new Notebook(800, 5000, 2018);
        System.out.println(quiteNewNotebook.weight + " " + quiteNewNotebook.price + " " + quiteNewNotebook.year);
        quiteNewNotebook.checkPrice();
        quiteNewNotebook.checkWeight();
        quiteNewNotebook.checkValueForMoney();

        Notebook quiteOldNotebook = new Notebook(2000, 150, 2000);
        System.out.println(quiteOldNotebook.weight + " " + quiteOldNotebook.price + " " + quiteOldNotebook.year);
        quiteOldNotebook.checkPrice();
        quiteOldNotebook.checkWeight();
        quiteOldNotebook.checkValueForMoney();

        Notebook extremelyOldNotebook = new Notebook(2500, 1000, 1995);
        System.out.println(extremelyOldNotebook.weight + " " + extremelyOldNotebook.price + " " + extremelyOldNotebook.year);
        extremelyOldNotebook.checkPrice();
        extremelyOldNotebook.checkWeight();
        extremelyOldNotebook.checkValueForMoney();

        Notebook smallNotebook = new Notebook(300, 500, 2020);
        System.out.println(smallNotebook.weight + " " + smallNotebook.price + " " + smallNotebook.year);
        smallNotebook.checkPrice();
        smallNotebook.checkWeight();
        smallNotebook.checkValueForMoney();

        Notebook weirdNotebook = new Notebook (700, 350, 2014);
        System.out.println( weirdNotebook.weight + " " + weirdNotebook.price + " " + weirdNotebook.year);
        weirdNotebook.checkPrice();
        weirdNotebook.checkWeight();
        weirdNotebook.checkValueForMoney();
    }
}
