package ua.ashepelsky.library.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.ashepelsky.library.db.Loan;
import ua.ashepelsky.library.services.LoansService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shepelsky on 07.05.2017.
 */
@RestController
public class LoansController {

    @Autowired
    private LoansService loansService;

    @RequestMapping("/api/loans")
    public Map<String, Object> getLoans() {
        Map<String, Object> model = new HashMap<>();
        model.put("loans", loansService.getAll());

        return model;
    }

    @RequestMapping(value = "/api/loans", method = RequestMethod.POST)
    public void borrowBook(@RequestBody Loan loan) {
        loansService.borrowBook(loan);
    }

    @RequestMapping(value = "/api/loans/{id}", method = RequestMethod.DELETE)
    public void unborrowBook(@PathVariable() Integer id) {
        loansService.unborrowBook(id);
    }


}
