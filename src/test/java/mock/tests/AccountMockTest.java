package mock.tests;

import org.junit.Test;
import service.implementations.AccountImpl;
import services.AccountService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AccountMockTest {
    @Test
    public void testRetrieveAccountsForHolder_withMock() {
        AccountService accountServiceMock = mock(AccountService.class);
        List<String> mockAccounts = Arrays.asList("12345","54321","13579");
        when(accountServiceMock.retrieveAccounts("holder")).thenReturn(mockAccounts);

        AccountImpl accountImpl = new AccountImpl(accountServiceMock);
        List<String> accountsRetrieved = accountImpl.retrieveAccountsForHolder("holder");

        assertEquals(3,accountsRetrieved.size());
    }
}

