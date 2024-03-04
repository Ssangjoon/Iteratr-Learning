package com.iteratrlearning;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankStatementCSVParser implements BankStatementParser{
    final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    @Override
    public BankTransaction parseFrom(final String line){
        final String[] columns = line.split(",");
        final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
        final double amount = Double.parseDouble(columns[1]);
        final String description = columns[2];

        return new BankTransaction(date, amount, description);
    }

    @Override
    public List<BankTransaction> parseLinesFrom(final List<String> lines){
        final List<BankTransaction> bankingTransactions = new ArrayList<>();
        for(final String line : lines){
            bankingTransactions.add(parseFrom(line));
        }
        return bankingTransactions;
    }

}
