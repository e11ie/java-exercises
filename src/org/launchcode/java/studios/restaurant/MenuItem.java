package org.launchcode.java.studios.restaurant;

import java.util.Calendar;
import java.util.Date;

public class MenuItem {

    private static int nextMenuItemId = 1;
    private int menuItemId;
    private double price;
    private String description;
    private String category; // (ie. appetizer, main course, dessert)
    private Calendar dateUpdated;
    private boolean isNew;

    /* Constructers */

    public MenuItem(int id, double price, String description, String category) {
        this.menuItemId = id;
        this.price = price;
        this.description = description;
        this.category = category;

        // Setup First date updated
        dateUpdated = Calendar.getInstance();
        dateUpdated.setTime(new Date());
    }

    public MenuItem(double price, String description, String category) {
        this(nextMenuItemId, price, description, category);
        nextMenuItemId++;
    }


    /* Overrides */
    @Override
    public String toString() {

        String string = description + " (Price: " + price + ", Category: " + category + ")";

        if (isNew()) {
            string += "  *NEW*";
        }

        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != this.getClass()) {
            return false;
        }

        MenuItem theMenuItem = (MenuItem) o;
        return theMenuItem.getMenuItemId() == this.getMenuItemId();
    }



    /* Getters and Setters */

    public int getMenuItemId() {
        return this.menuItemId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        dateUpdated.setTime(new Date());
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        dateUpdated.setTime(new Date());
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        dateUpdated.setTime(new Date());
        this.category = category;
    }

    public Date getDateUpdated() {
        return dateUpdated.getTime();
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
