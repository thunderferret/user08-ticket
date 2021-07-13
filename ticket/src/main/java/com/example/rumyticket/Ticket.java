package com.example.rumyticket;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Ticket_table")
public class Ticket{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Integer price;

    @PostPersist
    public void onPostPersist(){
        TicketRegistered TicketRegistered = new TicketRegistered();
        BeanUtils.copyProperties(this, TicketRegistered);
        TicketRegistered.publishAfterCommit();
    }

    @PostRemove
    public void onPostRemove(){
        TicketDeleted TicketDeleted = new TicketDeleted();
        BeanUtils.copyProperties(this, TicketDeleted);
        TicketDeleted.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }




}
