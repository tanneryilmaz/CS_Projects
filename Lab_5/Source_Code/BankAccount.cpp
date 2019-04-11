#include "BankAccount.h"
#include <string>
#include <sstream>
#include <iostream>
using namespace std;

string BankAccount::getName(){
  return name;
}

double BankAccount::getBalance(){
  return balance;
}

void BankAccount::deposit(double amount){
  balance += amount;
}

void BankAccount::withdraw(double amount){
  balance -= amount;
}

string BankAccount::toString(){

  ostringstream strs; //These three lines of code convert the balance variable to a string
  strs << balance;
  string str_balance = strs.str();

  return "Name: " + name + ", Balance: " + str_balance;
}