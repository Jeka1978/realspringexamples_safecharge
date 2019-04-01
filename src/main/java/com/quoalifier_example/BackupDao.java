package com.quoalifier_example;

import org.springframework.stereotype.Repository;

import static com.quoalifier_example.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@SafechargeRepository(ORACLE)
public class BackupDao implements Dao {
    @Override
    public void saveData() {
        System.out.println("data was saved to Oracle for backup");
    }
}
