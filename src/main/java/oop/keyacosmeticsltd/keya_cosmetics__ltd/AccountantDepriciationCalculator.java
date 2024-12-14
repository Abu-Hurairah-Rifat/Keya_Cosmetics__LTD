package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import java.time.LocalDate;

public class AccountantDepriciationCalculator {
    private String equipementName;
    private int euipementNo, salvageValue,purchaseDate, purchaseCost, depreciation;
    private LocalDate purchase_date;

    public AccountantDepriciationCalculator(String equipementName, int euipementNo, int salvageValue, int purchaseDate, int purchaseCost, int depreciation, LocalDate purchase_date) {
        this.equipementName = equipementName;
        this.euipementNo = euipementNo;
        this.salvageValue = salvageValue;
        this.purchaseDate = purchaseDate;
        this.purchaseCost = purchaseCost;
        this.depreciation = depreciation;
        this.purchase_date = purchase_date;
    }

    public String getEquipementName() {
        return equipementName;
    }

    public void setEquipementName(String equipementName) {
        this.equipementName = equipementName;
    }

    public int getEuipementNo() {
        return euipementNo;
    }

    public void setEuipementNo(int euipementNo) {
        this.euipementNo = euipementNo;
    }

    public int getSalvageValue() {
        return salvageValue;
    }

    public void setSalvageValue(int salvageValue) {
        this.salvageValue = salvageValue;
    }

    public int getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(int purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public int getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(int depreciation) {
        this.depreciation = depreciation;
    }

    public LocalDate getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(LocalDate purchase_date) {
        this.purchase_date = purchase_date;
    }

    @Override
    public String toString() {
        return "AccountantDepriciationCalculator{" +
                "equipementName='" + equipementName + '\'' +
                ", euipementNo=" + euipementNo +
                ", salvageValue=" + salvageValue +
                ", purchaseDate=" + purchaseDate +
                ", purchaseCost=" + purchaseCost +
                ", depreciation=" + depreciation +
                ", purchase_date=" + purchase_date +
                '}';
    }
}
