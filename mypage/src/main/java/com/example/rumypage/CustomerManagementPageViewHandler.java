package com.example.rumypage;

import com.example.rumypage.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class CustomerManagementPageViewHandler {


    @Autowired
    private CustomerManagementPageRepository customerManagementPageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenBooked_then_CREATE_1 (@Payload Booked booked) {
        try {

            if (!booked.validate()) return;

            // view 객체 생성
            CustomerManagementPage customerManagementPage = new CustomerManagementPage();
            // view 객체에 이벤트의 Value 를 set 함
            customerManagementPage.setBookId(booked.getId());
//            guestManagementPage.set(booked.get());
//            guestManagementPage.set(booked.get());
            // view 레파지 토리에 save
            customerManagementPageRepository.save(customerManagementPage);
        
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenBookCanceled_then_UPDATE_1(@Payload BookCanceled bookCanceled) {
        try {
            if (!bookCanceled.validate()) return;
                // view 객체 조회
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenBookCanceled_then_DELETE_1(@Payload BookCanceled bookCanceled) {
        try {
            if (!bookCanceled.validate()) return;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}