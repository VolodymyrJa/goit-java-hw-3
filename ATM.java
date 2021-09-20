public class ATM {

    public int countBanknotes(int sum) {
        int[] nominal = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        int result=0;
        int i=0;
        while (sum != 0 ) {
           result = result + sum/nominal[i];
            sum = (sum % nominal[i]);
            i++;

        }
        return result;

    }
    public static void main(String[] args) {
       ATM bank = new  ATM();


        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countBanknotes(365));
    }
}


