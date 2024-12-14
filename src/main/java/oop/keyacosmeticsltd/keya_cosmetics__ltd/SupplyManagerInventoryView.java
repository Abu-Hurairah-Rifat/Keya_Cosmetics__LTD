package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import java.time.LocalDate;

public class SupplyManagerInventoryView {
    private String itemName, category;
    private LocalDate storedDate;
    private int  quantity, ppu;

    public SupplyManagerInventoryView(String itemName, String category, LocalDate storedDate, int quantity, int ppu) {
        this.itemName = itemName;
        this.category = category;
        this.storedDate = storedDate;
        this.quantity = quantity;
        this.ppu = ppu;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getStoredDate() {
        return storedDate;
    }

    public void setStoredDate(LocalDate storedDate) {
        this.storedDate = storedDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPpu() {
        return ppu;
    }

    public void setPpu(int ppu) {
        this.ppu = ppu;
    }
}
