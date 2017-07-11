package es.rachelcarmena.bloaters.smell1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WithdrawShould {

    @Test
    public void keep_the_amount() {
        Amount amount = new Amount(760d);
        Withdraw withdraw1 = new Withdraw(amount);
        assertThat(withdraw1.getAmount(), is(amount));
    }
}
