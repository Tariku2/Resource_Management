package serviceImpl;

import lombok.extern.slf4j.Slf4j;
import model.Transaction;
import org.springframework.stereotype.Service;
import repo.TransactionRepo;
import service.TransactionService;

import java.util.List;

@Slf4j
@Service
public class TransactionServiceImpl implements TransactionService {
    private static TransactionRepo transactionRepo;

    @Override
    public Transaction create(Transaction transaction) {
        log.info("In save transaction Method of TransactionServiceImpl class");
        return transactionRepo.save(transaction);
    }

    @Override
    public Transaction get(Integer id) {
        log.info("Reading the transaction");
        return transactionRepo.findById(id).get();
    }

    @Override
    public Transaction update(Transaction transaction) {
        return transactionRepo.save(transaction);
    }

    @Override
    public boolean delete(Integer id) {
        transactionRepo.deleteById(id);
        return  true;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepo.findAll();
    }

}
