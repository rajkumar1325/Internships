package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class managementTestCases {
    ArrayList<Options> accList;

    @BeforeEach
    void settingUp() {
        accList = new ArrayList<>();
//      creating 3 lists
        Options.CreateAccount(accList, "raj kumar", "1234567890", 1000, 1234);
        Options.CreateAccount(accList, "Rajesh", "5678901234", 1200, 234);
        Options.CreateAccount(accList, "Rohan", "9876543234", 3400, 0000);

    }

    @Test
    void DisplayTotalNumberOfAccounts(){
        assertEquals(3, accList.size());    //as I have created 3 accounts
    }

    @Test
    void testCreationAccount0() {
        assertEquals("Raj Kumar".toLowerCase(), accList.get(0).getName().toLowerCase());    //ignoring case
        assertEquals(1000, accList.get(0).getBalance());
    }

    @Test
    void testCreationAccount1() {
        assertEquals("Rajesh", accList.get(1).getName());   //case sensitive
        assertEquals(1200, accList.get(1).getBalance());
    }

    @Test
    void testCreationAccount2() {
        assertEquals("Rohan", accList.get(2).getName());
        assertEquals(3400, accList.get(2).getBalance());
    }


    @Test
    void testDeposit0(){
        Options.DepositMoney(accList,"Raj kumar".toLowerCase(),500);
        assertEquals(1500,accList.get(0).getBalance());
    }

    @Test
    void withDrewMoney0(){
        Options.WithdrawMoney(accList,"Raj Kumar",1234,400);
        assertEquals(600, accList.get(0).getBalance());
    }

    @Test
    void checkBalance0(){
        assertEquals(1000,accList.get(0).getBalance());
    }

    @Test
    void checkBalance2(){
        assertEquals(3400, accList.get(2).getBalance());
    }


}