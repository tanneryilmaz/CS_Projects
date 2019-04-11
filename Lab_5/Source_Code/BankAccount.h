#pragma once
#include <string>
using namespace std;

class BankAccount{
  public:
    string name;
    double balance;
    string getName();
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
    string toString();
};

