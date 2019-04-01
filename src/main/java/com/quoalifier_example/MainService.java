package com.quoalifier_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static com.quoalifier_example.DBType.*;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @SafechargeRepository(MONGO)
    private Dao dao;
    @SafechargeRepository(ORACLE)
    private Dao backup;

    @Scheduled(fixedDelay = 1000)
    public void dowork(){
        dao.saveData();
    }


    @Scheduled(fixedDelay = 3000)
    public void doBackup(){
        backup.saveData();
    }
}
