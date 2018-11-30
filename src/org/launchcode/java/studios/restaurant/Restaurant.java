package org.launchcode.java.studios.restaurant;

public class Restaurant {

    public static void main(String args[]) {
        MenuItem chicken = new MenuItem(10.0, "Chicken Pasta", "Main Course");
        MenuItem salad = new MenuItem(8.0, "Chicken Caesar Salad", "Appetizer");

        Menu menu = new Menu();
        menu.addMenuItem(chicken);
        menu.addMenuItem(salad);

        System.out.println(menu);

//        System.out.println(chicken);
//        System.out.println(chicken.getDateUpdated().toString());
    }
}
