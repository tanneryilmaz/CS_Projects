#include "CheckingAccount.h"
#include <string>
#include <iostream>
using namespace std;

CheckingAccount::CheckingAccount(string name, double initBalance){
  transactionCount = 0;
  this -> name = name;
  deposit(initBalance);
}

void CheckingAccount::deductFees(){
  withdraw(transactionCount * TRANSACTION_FEE);
  transactionCount = 0;
}

//Overrides BankAccount class deposit function
void CheckingAccount::deposit(double amount){
  transactionCount++;
  BankAccount::deposit(amount);
}

//Overrides BankAccount class withdraw function
void CheckingAccount::withdraw(double amount){
  transactionCount++;
  BankAccount::withdraw(amount);
}