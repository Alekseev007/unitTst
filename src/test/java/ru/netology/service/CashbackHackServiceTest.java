package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(expected,actual);
    }
    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(expected,actual);
    }
    @Test
    public void remain3() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected,actual);
    }
    @Test
    public void remain4() {
        CashbackHackService service = new CashbackHackService();

        int expected = 800;
        int actual = service.remain(1200);

        assertEquals(expected,actual);
    }
}