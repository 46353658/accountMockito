package service.implementations;

import services.AccountService;

import java.util.List;

public class AccountImpl {
    private AccountService accountService;

    public AccountImpl(AccountService accountService) {
        this.accountService = accountService;
    }

    public List<String> retrieveAccountsForHolder(String accountHolder) {
        List<String> accounts = accountService.retrieveAccounts(accountHolder);
        return accounts;
    }
}
