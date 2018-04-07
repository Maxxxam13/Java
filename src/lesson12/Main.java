package lesson12;

public class Main {
    public static void main(String[] args) {
        Bank euBank = new EUBank(1222,"Sweeden",Currency.EUR,100,1400,4,444343434);
        Bank chinaBank = new ChinaBank(1333,"China",Currency.EUR,200,1000,3,555555555);
        Bank usBank = new USBank(1444,"United States",Currency.USD,150,1500,5,777777777);

        User user1 = new User(1001,"Denis",12200,40,"GMD",1500,usBank);
        User user2 = new User(1002,"Grisha",10000,30,"GMD",1000,usBank);
        User user3 = new User(1003,"Andrey",7500,35,"GMD",1200,euBank);
        User user4 = new User(1004,"Max",13000,45,"GMD",1100,euBank);
        User user5 = new User(1005,"Vlad",8800,50,"GMD",1300,chinaBank);
        User user6 = new User(1006,"Timur",11100,25,"GMD",1400,chinaBank);

        BankSystem bankSystem = new UkrainianBankSystem();

        bankSystem.withdraw(user1,100);
        bankSystem.fund(user1,100);
        bankSystem.transferMoney(user1,user2,100);
        bankSystem.paySalary(user1);

        bankSystem.withdraw(user2,150);
        bankSystem.fund(user2,150);
        bankSystem.transferMoney(user2,user3,150);
        bankSystem.paySalary(user2);

        bankSystem.withdraw(user3,200);
        bankSystem.fund(user3,200);
        bankSystem.transferMoney(user3,user4,200);
        bankSystem.paySalary(user3);

        bankSystem.withdraw(user4,250);
        bankSystem.fund(user4,250);
        bankSystem.transferMoney(user4,user5,250);
        bankSystem.paySalary(user4);

        bankSystem.withdraw(user5,50);
        bankSystem.fund(user5,100);
        bankSystem.transferMoney(user5,user6,100);
        bankSystem.paySalary(user5);

        bankSystem.withdraw(user6,50);
        bankSystem.fund(user6,50);
        bankSystem.transferMoney(user6,user1,50);
        bankSystem.paySalary(user6);


        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());
        System.out.println(user5.toString());
        System.out.println(user6.toString());
    }
}
