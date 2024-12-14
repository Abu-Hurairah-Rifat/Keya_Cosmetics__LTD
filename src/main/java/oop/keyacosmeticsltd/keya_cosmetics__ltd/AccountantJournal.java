package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import java.io.Serializable;
import java.time.LocalDate;

public class AccountantJournal implements Serializable {
    private int journal_no , entry_no, debit, credit;
    private String account;
    private LocalDate date;

    public AccountantJournal(int journal_no, int entry_no, int debit, int credit, String account, LocalDate date) {
        this.journal_no = journal_no;
        this.entry_no = entry_no;
        this.debit = debit;
        this.credit = credit;
        this.account = account;
        this.date = date;
    }

    public int getJournal_no() {
        return journal_no;
    }

    public void setJournal_no(int journal_no) {
        this.journal_no = journal_no;
    }

    public int getEntry_no() {
        return entry_no;
    }

    public void setEntry_no(int entry_no) {
        this.entry_no = entry_no;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AccountantJournal{" +
                "journal_no=" + journal_no +
                ", entry_no=" + entry_no +
                ", debit=" + debit +
                ", credit=" + credit +
                ", account='" + account + '\'' +
                ", date=" + date +
                '}';
    }
}



