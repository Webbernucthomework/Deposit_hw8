package com.example.lib;

import java.util.Scanner;

public class CppBank {
    Scanner scanner = new Scanner(System.in);
    private int Customer[];
    private int TransactionTime;

    public CppBank(int CustomerN, int TransactionTimeN) {
        while (CustomerN > 100) {
            System.out.println("不能超過100個顧客，請從新輸入");
            CustomerN = Integer.parseInt(scanner.next());
        }
        while (TransactionTimeN > 10000) {
            System.out.println("不能超過10000個交易次數，請從新輸入");
            TransactionTimeN = Integer.parseInt(scanner.next());
        }
        Customer = new int[CustomerN];
        TransactionTime = TransactionTimeN;
        for (int i = 0; i < CustomerN; i++) {               //初始化
            Customer[i] = 0;
        }
        for(int i=0;i<TransactionTime;i++){                 //交易開始
            int ThisTimeCustomer = Integer.parseInt(scanner.next());
            while (ThisTimeCustomer>CustomerN){
                System.out.println("超過原輸入的顧客數，請再次輸入");
                ThisTimeCustomer = Integer.parseInt(scanner.next());
            }
            int Form_of_transaction = Integer.parseInt(scanner.next());
            while (Form_of_transaction!=1&&Form_of_transaction!=2){
                System.out.println("請再次輸入，存款為1、提款為2");
                Form_of_transaction = Integer.parseInt(scanner.next());
            }
            int ThisTimeTransactionM = Integer.parseInt(scanner.next());
            switch (Form_of_transaction){
                case 1:
                    Customer[ThisTimeCustomer] += ThisTimeTransactionM;
                    break;
                case 2:
                    Customer[ThisTimeCustomer] -= ThisTimeTransactionM;
                    break;
            }
        }
        for (int i = 0; i < CustomerN; i++){
            System.out.printf("%d : %d \n",i,Customer[i]);
        }
    }

}
