package com.onejava.repositories;

import com.onejava.entities.TicketPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

/*
JPARepository Query Precedence order as follows
@Query Annotated methods
@NamedQuery and @NamedNativeQuery methods
QueryDSL structured methods
And It throws exceptions for other methods where JPA don't understand
 */
public interface TicketPriceRepository extends JpaRepository<TicketPrice, Long> {

    // Get Tickets under given price and with workshops
    // Generated using JPA Palette Query Option
    @Query("select t from TicketPrice t where t.basePrice <= ?1 and t.ticketType.includesWorkshop = ?2")
    List<TicketPrice> getTicketsUnderPriceWithWorkshops(BigDecimal basePrice, Boolean includesWorkshop);

    // NamedQuery - Repository method should match NamedParameter(name)
    List<TicketPrice> namedFindTicketsByPricingCategoryName(@Param("name") String pricingCategoryName);

    // NativeQuery - Repository method should match NamedParameter(name)
    List<TicketPrice> nativeFindTicketsByCategoryWithWorkshop(@Param("name") String pricingCategoryName);

}