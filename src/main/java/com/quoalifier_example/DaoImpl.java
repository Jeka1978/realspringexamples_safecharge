package com.quoalifier_example;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@SafechargeRepository(DBType.MONGO)
public class DaoImpl implements Dao {
    @Override
    public void saveData() {
        System.out.println("data was saved to Mongo in production");
    }
}
