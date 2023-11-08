package ex05_glu_rufinoii;

import java.util.*;

public class Store {

    private String name;
    private double earnings;
    private ArrayList<Item> itemList;
    private static ArrayList<Store> storeList = new ArrayList();

    public Store(String name) {
        // Initialize name to parameter and earnings to zero
        this.name = name;
        this.earnings = 0;
        // Initialize itemList as a new ArrayList
        itemList = new ArrayList<>();
        // add 'this' store to storeList
        storeList.add(this);
    }

    public String getName() {
        return name;
    }

    public double getEarnings() {
        return earnings;
    }

    public void sellItem(int index) {
        // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
        if (index < itemList.size()) {
            // get Item at index from itemList and add its cost to earnings
            this.earnings += itemList.get(index).getCost();
            // print statement indicating the sale
            System.out.println("Thanks for purchasing " + itemList.get(index).getName() + " for " + itemList.get(index).getCost() + "!" + "\n");
        } else {
            System.out.println("Sorry, there are only " + itemList.size() + " items in the store :(" + "\n");
        }
    }

    public void sellItem(String name) {

        // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
        for (int i = 0; i < itemList.size(); i++) {
            if (name.equalsIgnoreCase(itemList.get(i).getName())) {
                // get Item from itemList and add its cost to earnings
                this.earnings += itemList.get(i).getCost();
                // print statement indicating the sale
                System.out.println("Thanks for purchasing " + itemList.get(i).getName() + " for " + itemList.get(i).getCost() + "!" + "\n");
                return;
            }

        }
        System.out.println("Sorry, we do not sell " + name + " in this store :(" + "\n");
    }

    public void sellItem(Item i) {

        // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
        if (itemList.contains(i)) {
            // get Item i from itemList and add its cost to earnings
            this.earnings += i.getCost();
            // print statement indicating the sale
            System.out.println("Thanks for purchasing " + i.getName() + " for " + i.getCost() + "!" + "\n");
        } else {
            System.out.println("Sorry, we do not sell " + i.getName() + " in this store :(" + "\n");
        }
    }

    public void addItem(Item i) {
        // add Item i to store's itemList
        itemList.add(i);
    }

    public void filterType(String type) {
        // loop over itemList and print all items with the specified type
        itemList.forEach((n) -> {
            if (type.equalsIgnoreCase(n.getType())) {
                System.out.println(n.getName());
            }
        });
        System.out.println();
    }

    public void filterCheap(double maxCost) {
        // loop over itemList and print all items with a cost lower than or equal to the specified value
        itemList.forEach((n) -> {
            if (n.getCost() <= maxCost) {
                System.out.println(n.getName());
            }
        });
        System.out.println();
    }

    public void filterExpensive(double minCost) {
        // loop over itemList and print all items with a cost higher than or equal to the specified value
        itemList.forEach((n) -> {
            if (n.getCost() >= minCost) {
                System.out.println(n.getName());
            }
        });
        System.out.println();
    }

    public static void printStats() {
        // loop over storeList and print the name and the earnings'Store.java'
        storeList.forEach((n) -> {
            System.out.println(n.getName());
            System.out.println(n.getEarnings());
        });
        System.out.println();
    }
}
