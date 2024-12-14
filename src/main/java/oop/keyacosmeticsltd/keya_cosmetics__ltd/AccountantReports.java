package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import java.time.LocalDate;

public class AccountantReports extends AccountantJournal{
    public AccountantReports(int journal_no, int entry_no, int debit, int credit, String account, LocalDate date) {
        super(journal_no, entry_no, debit, credit, account, date);
    }
}
