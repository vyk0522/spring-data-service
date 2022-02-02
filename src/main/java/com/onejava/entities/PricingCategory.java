package com.onejava.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pricing_category")
public class PricingCategory {
    @Id
    @Column(name = "pricing_category_code", nullable = false)
    private String pricingCategoryCode;

    @Column(name = "pricing_category_name")
    private String pricingCategoryName;

    @Column(name = "pricing_start_date")
    private Date pricingStartDate;

    @Column(name = "pricing_end_date")
    private Date pricingEndDate;

    @OneToMany(mappedBy = "pricingCategory", orphanRemoval = true)
    @JsonIgnore
    private List<TicketPrice> ticketPrices = new ArrayList<>();

}