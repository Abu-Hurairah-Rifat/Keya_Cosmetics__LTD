package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import java.time.LocalDate;

public class AccountantEditExistingEntry extends AccountantJournal {
    AccountantJournal entry;

    public AccountantEditExistingEntry(int journal_no, int entry_no, int debit, int credit, String account, LocalDate date) {
        super(journal_no, entry_no, debit, credit, account, date);

    }

    public AccountantJournal getEntry() {
        return entry;
    }

    public void setEntry(AccountantJournal entry) {
        this.entry = entry;
    }
}
