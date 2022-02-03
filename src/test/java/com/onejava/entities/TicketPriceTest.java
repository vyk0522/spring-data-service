package com.onejava.entities;

import com.onejava.repositories.TicketPriceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TicketPriceTest {
    @Autowired
    private TicketPriceRepository ticketPriceRepository;

    @Test
    public void test() {
        List<TicketPrice> ticketPrices = ticketPriceRepository.getTicketsUnderPriceWithWorkshops(BigDecimal.valueOf(1000), true);
        assertFalse(CollectionUtils.isEmpty(ticketPrices));
    }

    @Test
    public void testNamedQuery() {
        List<TicketPrice> ticketPrices = ticketPriceRepository.namedFindTicketsByPricingCategoryName("Regular");
        assertTrue(ticketPrices.size() > 0);
    }

    @Test
    public void testNativeQuery() {
        List<TicketPrice> ticketPrices = ticketPriceRepository.nativeFindTicketsByCategoryWithWorkshop("Regular");
        assertTrue(ticketPrices.size() > 0);
    }

}