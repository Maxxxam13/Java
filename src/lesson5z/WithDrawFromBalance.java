package lesson5z;

public class WithDrawFromBalance {
    static int withDraw(String[] clients, int[] balances, String client, int amount){
        int balance = -1;
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        if(balances[clientIndex]>= amount) {
            balances[clientIndex] -= amount;
            balance = balances[clientIndex];
        }
        return balance;
    }
}
