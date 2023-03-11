public class Notebook {
        int weight;
        int price;
        int year;

        public Notebook(int weight, int price, int year) {
                this.weight = weight;
                this.price = price;
                this.year = year;
        }

        public void checkPrice() {
                if (this.price < 600) {
                        System.out.println("This notebook is very cheap.");
                } else if (this.price >= 600 && this.price < 1001) {
                        System.out.println("This price is good.");
                } else {
                        System.out.println("This notebook is expensive.");
                }
        }

        public void checkWeight() {
                if (this.weight <= 500) {
                        System.out.println("This device is lightweight.");
                } else if (this.weight > 500 && this.weight <=1500) {
                        System.out.println("This device is not too heavy.");
                } else {
                        System.out.println("This device is very heavy.");
                }
        }

        public void checkValueForMoney() {
                if (this.year >= 2018 && this.price <= 600) {
                        System.out.println("This device is quite new and it is very good value for money!");
                } else if (this.year >= 2018 && (this.price > 600 && this.price <= 3000)) {
                        System.out.println("This device is quite new and it is quite good value for money.");
                } else if ((this.year < 2018 && this.year >= 2012) && this.price <= 400) {
                        System.out.println("This device is very good value for money!");
                } else if ((this.year < 2018 && this.year >= 2012) && (this.price > 400 && this.price <= 2000)) {
                        System.out.println("This device is quite good value for money.");
                } else if (this.year < 2012 && this.price <= 200) {
                        System.out.println("This device is old, although it is very good value for money!");
                } else if (this.year < 2012 && (this.price > 200 && this.price <= 700)) {
                        System.out.println("This device is old, although it is quite good value for money.");
                } else {
                        System.out.println("This device is bad value for money. Don't buy it!");
                }
        }
}
