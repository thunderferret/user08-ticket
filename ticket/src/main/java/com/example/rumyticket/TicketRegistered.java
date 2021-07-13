package com.example.rumyticket;

public class TicketRegistered extends AbstractEvent {

    private Long id;

    public TicketRegistered(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
