class Account {
  long AccountNumber = newAccountNumber();
  User user; 
  float interestRates;
  float balance;

  public Account(User newUser, float newInterestRates, float startingBalance){
    user = newUser;
    interestRates = newInterestRates;
    balance = startingBalance;
  }

  public void transferMoney(Account endDestination, float amount) {

  }

  public void depositMoney(float amount) {

  }

  public void extractMoney(float amount) {

  }

  public static long newAccountNumber(){
    return 1234567890;
  }

  public void sleep() {

  }
}