#include <string>
#include "BankAccount.h"
using namespace std;

class SavingsAccount : public BankAccount{
  public:
    SavingsAccount(string name, double initBalance, double rate);
    void addInterest();
    double rate;
};