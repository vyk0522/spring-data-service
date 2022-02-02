package com.onejava.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ticket_type")
public class TicketType {
    @Id
    @Column(name = "ticket_type_code", nullable = false)
    private String ticketTypeCode;

    @Column(name = "ticket_type_name")
    private String ticketTypeName;

    @Column(name = "description")
    private String description;

    @Column(name = "includes_workshop")
    private Boolean includesWorkshop;

    @OneToMany(mappedBy = "ticketType", orphanRemoval = true)
    @JsonIgnore
    private List<TicketPrice> ticketPrices = new ArrayList<>();

}