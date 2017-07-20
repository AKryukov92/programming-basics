package lab17;

/**
 * @author akryukov
 *         20.07.2017
 */
public class Client {
    private String id;
    private String checkingAccount;
    private String inn;
    private String name;

    public Client(String id, String checkingAccount, String inn, String name){
        this.id = id;
        this.checkingAccount = checkingAccount;
        this.inn = inn;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getCheckingAccount() {
        return checkingAccount;
    }

    public String getInn() {
        return inn;
    }

    public String getName() {
        return name;
    }
}
