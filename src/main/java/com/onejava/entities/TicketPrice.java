package com.onejava.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "ticket_price")

// name syntax is EntityName.EntityRepositoryMethodName
// Prefixed the method name with named just for our reference to understand the method type
// Repository method should match NamedParameter(here it is :name) @Param("name")
@NamedQuery(
        name = "TicketPrice.namedFindTicketsByPricingCategoryName",
        query = "select tp from TicketPrice tp where tp.pricingCategory.pricingCategoryName = :name"
)
@NamedNativeQuery(
        name = "TicketPrice.nativeFindTicketsByCategoryWithWorkshop",
        query = "select tp.* from ticket_price tp " +
                "left join ticket_type tt on tp.ticket_type_ticket_type_code = tt.ticket_type_code " +
                "left join pricing_category pc on tp.pricing_category_pricing_category_code = pc.pricing_category_code " +
                "where tt.includes_workshop = true and pc.pricing_category_name = :name",
        resultClass = TicketPrice.class
)
public class TicketPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "base_price", precision = 19, scale = 2)
    private BigDecimal basePrice;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ticket_type_ticket_type_code", updatable = false)
    private TicketType ticketType;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "pricing_category_pricing_category_code", updatable = false)
    private PricingCategory pricingCategory;

}