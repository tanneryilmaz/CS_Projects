#include <string>
#include "BankAccount.h"
using namespace std;

class CheckingAccount : public BankAccount{
  public:
    CheckingAccount(string name, double initBalance);
    void deposit(double amount); //Overrides BankAccount class deposit function
    void withdraw(double amount); //Overrides BankAccount class withdraw function
    int transactionCount;
    static constexpr double TRANSACTION_FEE = 3.0;
    void deductFees();
};