package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import java.time.LocalDate;

public class AccountantFinancialStatement extends AccountantJournal{

    public AccountantFinancialStatement(int journal_no, int entry_no, int debit, int credit, String account, LocalDate date) {
        super(journal_no, entry_no, debit, credit, account, date);
    }
}
