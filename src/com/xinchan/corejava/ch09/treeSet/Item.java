package com.xinchan.corejava.ch09.treeSet;

import java.util.Objects;

/**
 * @author xinchan
 * @version 1.0.1 2021-11-25
 */
public class Item implements Comparable<Item>{
    // instance field
    private String description;
    private int no;

    public Item(String description, int no) {
        this.description = description;
        this.no = no;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Item{" + "description='" + description + '\'' + ", no=" + no + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Item item = (Item) obj;
        return item.description.equals(item.getDescription()) && this.getNo() == item.getNo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.description, this.no);
    }

    @Override
    public int compareTo(Item item) {
        return this.no - item.getNo() == 0? this.description.compareTo(item.getDescription()) : this.no - item.getNo();
    }
}
