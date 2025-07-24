package com.deskflow.backend.service;

import com.deskflow.backend.model.Ticket;
import com.deskflow.backend.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    private final TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    public List<Ticket> listAll() {
        return repository.findAll();
    }

    public Ticket save(Ticket ticket) {
        return repository.save(ticket);
    }
}
