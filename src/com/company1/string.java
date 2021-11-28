package com.company1;

public class string {
    public static void main(String[] args) {
        String mySelf ="My name is ebrahim khan.";
        System.out.println("I am Bangladeshi" + mySelf);
        mySelf =mySelf + ",I am a java programmer.";
        System.out.println(mySelf);
        mySelf =mySelf+"\u00A9 2022";
        System.out.println(mySelf);
        String paragraph ="My country name Bangladesh\n"
                +"Our prime minister Sheikh Hasina\n"
                +"\tOur home minister Khan Kamal\n"
                +"Our president Abdul Hamid. ";
        System.out.println(paragraph);

    }
}
