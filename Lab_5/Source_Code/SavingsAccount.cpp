#include "SavingsAccount.h"
#include <string>
#include <iostream>
using namespace std;

SavingsAccount::SavingsAccount(string name, double initBalance, double rate){
  this -> rate = rate;
  this -> name = name;
  deposit(initBalance); 
}

void SavingsAccount::addInterest(){
  deposit(balance * (rate / 100));
}