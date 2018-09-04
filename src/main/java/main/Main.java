package main;

import dbService.DBException;
import dbService.DBService;
import dbService.accounts.AccountService;
import dbService.accounts.UserProfile;
import dbService.dao.UsersDAO;
import dbService.dataSets.UsersDataSet;

import java.util.HashMap;

//
public class Main {

    public static HashMap<String, UserProfile> profiles;

    public static void main(String[] args) {
        DBService dbService = new DBService();
        dbService.printConnectInfo();

/*        AccountService accountService = new AccountService();

        accountService.addNewUser(new UserProfile("admin"));
        accountService.addNewUser(new UserProfile("test"));*/

        try {
            long userId = dbService.addUser("tully");
            System.out.println("Added user id: " + userId);

            UsersDataSet dataSet = dbService.getUser(userId);
            System.out.println("User data set: " + dataSet);

        } catch (DBException e) {
            e.printStackTrace();
        }
    }
}
