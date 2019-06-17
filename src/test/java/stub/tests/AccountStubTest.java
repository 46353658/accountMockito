package stub.tests;

import org.junit.Test;
import service.implementations.AccountImpl;
import services.AccountService;
import stubs.AccountStub;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AccountStubTest {
    @Test
    public void testRetrieveAccountsForHolder_withStub() {
        AccountService accountStub = new AccountStub();
        AccountImpl accountImpl = new AccountImpl(accountStub);
        List<String> accountsRetrieved = accountImpl.retrieveAccountsForHolder("holder");

        assertEquals(3,accountsRetrieved.size());
    }
}
