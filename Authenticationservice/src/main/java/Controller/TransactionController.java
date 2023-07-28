package Controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import model.HttpService;
import model.Transaction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import serviceImpl.TransactionServiceImpl;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

/**
 *
 */
@RestController
@RequestMapping("/transaction")
@AllArgsConstructor
public class TransactionController {

    private final TransactionServiceImpl transactionService;



    /**saving transaction with http status
     *
     */
    @PostMapping("/save")
    public ResponseEntity<HttpService> saveTransaction(@RequestBody @Valid Transaction transaction) {
        return ResponseEntity.ok(HttpService.builder()
                .timeStamp(now())
                .status(CREATED)
                .StatusCode(CREATED.value()).build());
    }
    /**retrieving transaction with respect to http status
     *
     */
    @GetMapping("/get/(id)")
    public ResponseEntity<HttpService> getTransaction(@PathVariable("id")Integer id)  {
        return ResponseEntity.ok(
                HttpService
                        .builder()
                        .timeStamp(now())
                        .status(OK)
                        .StatusCode(OK.value()).build());
    }
    /**deleting transaction with respect to http status
     *
     */
    @DeleteMapping("/delete/(id)")
    public ResponseEntity<HttpService> deleteTransaction(@PathVariable("id")Integer id)  {
        return ResponseEntity.ok(
                HttpService
                        .builder()
                        .timeStamp(now())
                        .status(OK)
                        .StatusCode(OK.value()).build());
    }
}
