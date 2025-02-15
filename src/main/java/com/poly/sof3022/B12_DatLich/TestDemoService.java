package com.poly.sof3022.B12_DatLich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class TestDemoService {

    @Autowired
    private DemoService service;

//    @Scheduled(fixedDelay = 1000) // 1s
    @Scheduled(cron = "30 9 25 * * *")
    public void testDatLich(){
        service.datDongBaoThuc();
    }
}
