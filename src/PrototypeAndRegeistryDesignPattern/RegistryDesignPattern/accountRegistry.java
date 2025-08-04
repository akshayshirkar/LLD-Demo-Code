package PrototypeAndRegeistryDesignPattern.RegistryDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class accountRegistry {
    private Map<String, Account> accMap = new HashMap<>();

    void putAccount(String accountName, Account account){
        accMap.put(accountName,account);
    }
    Account getAccount(String accountName){
       return accMap.get(accountName);
    }
}
