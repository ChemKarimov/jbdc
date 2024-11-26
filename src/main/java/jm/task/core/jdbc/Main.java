package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoJDBCImpl jdbc = new UserDaoJDBCImpl();

        jdbc.createUsersTable();
        jdbc.saveUser("Ivan", "Ivanov", (byte) 20);
        jdbc.saveUser("Danil", "Danilov", (byte) 21);
        jdbc.saveUser("Aboba", "Valeryev", (byte) 24);
        jdbc.saveUser("Denis", "Petrov", (byte) 27);
        jdbc.getAllUsers();
        jdbc.cleanUsersTable();
        jdbc.dropUsersTable();
    }
}
