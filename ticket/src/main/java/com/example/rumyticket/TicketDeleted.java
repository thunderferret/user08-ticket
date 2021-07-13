package com.example.rumyticket;

public class TicketDeleted extends AbstractEvent {

    private Long id;

    public TicketDeleted(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
