//Program written by Tanner Yilmaz. Last edit: 4/8/2019
#include <iostream>
#include "SavingsAccount.h"
#include "CheckingAccount.h" //fgjykfgj

int main() {
  
  //Testing inhertance
  SavingsAccount saving = SavingsAccount("Tanner", 0, 1); //arguments: name, balance, interest rate
  CheckingAccount checking = CheckingAccount("Sarah", 500);
  
  saving.deposit(1000);
  checking.withdraw(100);
  saving.withdraw(200);
  checking.deposit(200);

  cout<<saving.toString()<<endl;
  cout<<checking.toString()<<endl;
  cout<<endl;

  saving.addInterest();
  checking.deductFees();  

  cout<<saving.toString()<<endl;
  cout<<checking.toString()<<endl;

}