package stubs;

import services.AccountService;

import java.util.Arrays;
import java.util.List;

public class AccountStub implements AccountService {

    public List<String> retrieveAccounts(String accountHolder) {
        return Arrays.asList("12345","54321","13579");
    }
}
