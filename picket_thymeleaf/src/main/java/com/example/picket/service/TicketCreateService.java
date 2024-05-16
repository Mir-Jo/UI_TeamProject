package com.example.picket.service;

import com.example.picket.entity.Performance;
import com.example.picket.entity.Ticket;
import com.example.picket.repository.PerformanceRepository;
import com.example.picket.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Integer.parseInt;

@Service
@RequiredArgsConstructor
public class TicketCreateService {
    private final TicketRepository ticketRepository;
    private final PerformanceRepository performanceRepository;

    private static String generateRandomString(int length) {
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // 사용할 문자들
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }

    public List<Ticket> ticketCreateInput(String ticketCount, String performanceTitle){
        Performance performance = performanceRepository.findById(performanceTitle).orElse(null);
        List<Ticket> tickets = new ArrayList<>();
        if(performance != null){
            for(int i = 0; i < parseInt(ticketCount); i++){
                String ticketId = generateRandomString(10);
                Ticket ticket = new Ticket(ticketId, performance);
                Ticket searchTicket = ticketRepository.findById(ticketId).orElse(null);

                if(searchTicket == null){
                    tickets.add(ticketRepository.save(ticket));
                }
                else {
                    i--;
                }
            }
        }
        return tickets;
    }
}
