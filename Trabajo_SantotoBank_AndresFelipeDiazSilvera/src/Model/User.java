package Model;
import Model.Account;

import java.util.Arrays;

public class User {
    private int id;
    private String name;
    private String lastName;
    private Account account[]= new Account[3];

    public User() {
    }

    public User(int id, String name, String lastName, Account[] account) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account[] getAccount() {
        return account;
    }

    public void setAccount(Account[] account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "User{" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", account:" + Arrays.toString(account) +
                '}'+"\n";
    }

    public int returnIdAccount() {
        int id = 0;
        boolean save = false;
        do {
            if (account[id]==null){
                save=true;
            }else {
                id++;
            }
        } while (save == false);
        return id;
    }
}
