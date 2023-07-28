package service;

import model.Transaction;

import java.util.List;

public interface TransactionService {
    public Transaction create(Transaction transaction);
     public Transaction get(Integer id);
    public Transaction update(Transaction transaction);
    boolean delete(Integer id);
    //For Search operation
public List<Transaction>getAllTransactions();

}
