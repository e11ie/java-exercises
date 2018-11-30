package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Menu {

    /*

    Calendar.getInstance(): return a Calendar instance based on the current time in
    the default time zone with the default locale.

    Calendar cal = Calendar.getInstance();
    cal.setTime(new Date());

    Date getTime(): Returns a Date object representing this Calendar's time value
    void setTime(Date aDate): Sets this Calendar's time with the given Date instance

    */

    /*
    * A way to tell if a menu item is new - the last item updated (if it is equal to lastMenuUpdate)
    * */

    private Calendar lastMenuUpdate;
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        this.lastMenuUpdate = Calendar.getInstance();
        this.lastMenuUpdate.setTime(new Date());
        menuItems = new ArrayList<>();
    }

    public Menu(ArrayList<MenuItem> someMenuItems) {
        this.lastMenuUpdate = Calendar.getInstance();
        this.lastMenuUpdate.setTime(new Date());
        this.menuItems = someMenuItems;
    }

    @Override
    public String toString() {
        String string;

        // TODO - loop over and print each MenuItem
        string = "Menu: \n";

        for (MenuItem item : menuItems) {
            string += item.toString() + "\n";
        }

        return string;
    }

    public void addMenuItem(MenuItem aMenuItem) {
        menuItems.add(aMenuItem);
        lastMenuUpdate.setTime(aMenuItem.getDateUpdated());
    }

    public void removeMenuItem(int index) {
        menuItems.remove(index);
        lastMenuUpdate.setTime(new Date());
    }

    public void removeMenuItem(MenuItem aMenuItem) {
        menuItems.remove(aMenuItem);
        lastMenuUpdate.setTime(new Date());
    }

    public Date getLastMenuUpdate() {
        return lastMenuUpdate.getTime();
    }

    public void refreshNewMenuItems() {
        // TODO - loop through all MenuItems and the last one updated is new
    }
}
