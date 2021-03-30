package Controller;

import Model.User;
import Model.Account;


public class Bank {
    private final User[] users = new User[100];

    public Account returnAccount(int id, boolean type, double residue) {
        return new Account(id, type, residue);
    }

    public Bank() {
        for (int i = 0; i < users.length; i++) {
            users[i] = new User();
        }
        for (User user : users) {
            user.setLastName(" ");
        }
    }

    public void save(String name, String lastName) {
        boolean accountFree = false;
        int id = 0;
        do {
            if (users[id].getName() == null) {
                users[id].setId(id);
                users[id].setName(name);
                users[id].setLastName(lastName);
                accountFree = true;
            } else {
                id++;
            }

        } while (!accountFree && id < 100);
    }

    public void updateAccount(int id, boolean type) {
        boolean save=false;
        try {
            for (User user : users) {
                if (user.getId() == id && user.getName() != null) {
                    int idAccount = user.returnIdAccount();
                    user.getAccount()[idAccount] = returnAccount(idAccount, type, 0);
                    save=true;
                    break;
                }
            }
            if (!save){
                System.err.println("El usuario no existe");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Identificación incorrecta o cuenta máxima permitida");
        }
    }

    public void listUser() {

        SortUsers(users, users.length);
        System.out.println("____________________________________");
        mostUserResidue();
        System.out.println("____________________________________");
        mustUserResidueByCheckingAccount();
        minorUserResidueBySavingAccount();

    }
    public void SortUsers(User[] users, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (users[j].getLastName().compareTo(users[j + 1].getLastName())>0&&users[j].getName()!=null&&users[j+1].getName()!=null) {
                    User aux = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = aux;
                }
            }
        }
        for (User user : users) {
            if (user.getName()!=null)
                System.out.println(user.toString());
        }
    }


    public void addResidue(int id, int idA, double residue, boolean addOrRest) {
        try {
            for (User user : users) {
                if (user.getId() == id && addOrRest) {
                    user.getAccount()[idA].setResidue(user.getAccount()[idA].getResidue() + residue);
                    break;
                } else if (user.getId() == id && !addOrRest) {
                    user.getAccount()[idA].setResidue(user.getAccount()[idA].getResidue() - residue);
                    break;
                }
            }
        } catch (NullPointerException e) {
            System.err.println("El usuario o la cuenta no existen !!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Identificación incorrecta !!");
        }
    }

    public void mostUserResidue() {
        Account account = new Account();
        double maxResidue = 0;
        for (User user : users) {
            for (int i = 0; i < 3; i++) {
                if (user.getAccount()[i] != null) {
                    if (user.getAccount()[i].getResidue() > maxResidue) {
                        maxResidue = user.getAccount()[i].getResidue();
                        account = user.getAccount()[i];
                    }
                }
            }

        }
        System.out.println("\n" + "El tipo de cuenta que tiene la mayor cantidad de dinero es: " + account.toString());
    }

    public void minorUserResidueBySavingAccount() {
        User userMS = new User();
        double maxResidueS = 0;
        for (int j = 0, usersLength = users.length; j < usersLength; j++) {
            User user = users[j];
            double residueSumS = 0;
            for (int i = 0; i < 3; i++) {
                if (user.getAccount()[i] != null && user.getAccount()[i].isType()) {
                    residueSumS += user.getAccount()[i].getResidue();
                }

            }
            if (j == 0) {
                maxResidueS = residueSumS;
            }
            if (residueSumS < maxResidueS && users[j].getName() != null) {
                maxResidueS = residueSumS;
                userMS = user;
            }
        }
        System.out.println("El usuario que tiene la suma de dinero menor en la cuenta de ahorro es: " + userMS.toString());
    }

    public void mustUserResidueByCheckingAccount() {
        User userMC = new User();
        double maxResidueC = 0;
        for (User user : users) {
            double residueSumC = 0;
            for (int i = 0; i < 3; i++) {
                if (user.getAccount()[i] != null && !user.getAccount()[i].isType()) {
                    residueSumC += user.getAccount()[i].getResidue();
                }
            }
            if (residueSumC > maxResidueC) {
                maxResidueC = residueSumC;
                userMC = user;
            }
        }
        System.out.println("El usuario que tiene la mayor cantidad de dinero en la cuenta corriente es: " + userMC.toString());
    }

}
