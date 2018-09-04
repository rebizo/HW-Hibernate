package dbService;

import dbService.dataSets.UsersDataSet;

public interface getSession {

    void setPr();

    UsersDataSet getUser(long id) throws DBException;

    long addUser(String name) throws DBException;

    void printConnectInfo();

}
