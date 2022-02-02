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