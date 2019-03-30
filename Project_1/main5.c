#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>
//All interest rates should be passed as values less than 1. For example, a rate of 67% is 
//passed as 0.67, not as 67. 

typedef struct person{
  double savings; //amount of money in person's savings account
  double checking; //amount of money in person's checking account
  double debt; // the sum of the person's credit card and student loan debt
  double mortgageLoan; // the amount of mortgage debt the person carries
  double yearsWithDebt; // number of years person has credit card and student loan debt
  int yearsRented; // number of years the person rented an apartment
  double debtPaid; // total amount the person paid to pay off credit card and student loans
  double savingsRate; //the yearly interest that is paid in their savings account
  double minPayment; //percentage of their credit card and student loan debt the person                       //pays off each month. 
  double addlPayment; //The additional monthly payment made on their credit card debt
  double mortgageInterest; // The percent interest on the home mortgage loan 
  bool house; // true if person owns a house. False otherwise.
  bool finLiterate; // true if the person is financially literate. false otherwise.
}person;

/* Pays interest to the person's savings account.
rate parameter is the interest rate that applies annualy. 
Running this method simulates the passing of 1 year */
void savingsPlacement(person* person, double rate){
  person -> savings *= (rate + 1);
}

/* Running this function simulates 1 year of the person paying off their credit card and student loan debt. rate parameter is the percentage of their credit card and student loan debt that the person pays off each month. initialAmount parameter is the amount of debt the 
person has at the beginning of the year. THE VALUE PASSED FOR INITIALAMOUNT MUST BE THE 
SAME AS THE VALUE THAT THE PERSON'S DEBT DATA MEMBER IS SET TO. THIS FUNCTION WILL LIKELY BEHAVE ERRONEOUSLY IF THE PERSON'S DEBT DATA MEMBER IS NOT THE SAME AS THE VALUE BEING PASSED TO THIS FUNCTION FOR INITIALAMOUNT */
void debt(person* person, double initialAmount, double rate, double addlPay){
  
  int monthsSimulated = 1;
  double monthlyPayment;

  while(monthsSimulated <= 12 && (person -> debt) > 0){
    monthlyPayment = (person -> debt) * rate + addlPay;
    person -> debt -= monthlyPayment;
    person -> debtPaid += monthlyPayment;
    monthsSimulated++;
  }
  person -> debt *= 1.2; // Debt is compounded 20% annually
  person -> yearsWithDebt++;  
}

//Running this function simulates 1 year of the person renting an apartment
void rent(person* person, double rentamt){
  person -> checking -= 12 * rentamt;
  (person -> yearsRented)++;
}

// Running this funciton simulates 1 year of the person paying off their home mortgage loan
void house(person* person, double housePrice, double interestRate, double mortgageTerm){
  int N = mortgageTerm * 12; //Calculated by multiplying 30 years by 12 months per year
  double r = interestRate / 12.0; //monthlyRate is the interest charged per month
  double monthlyPayment;
  int monthsSimulated = 1;

  // See relevant formula at this URL: https://en.wikipedia.org/wiki/Fixed-rate_mortgage
  monthlyPayment = (r * housePrice) / (1 - pow(1 + r, -N));
  
  while(monthsSimulated <= 12){
    person -> checking -= monthlyPayment;
    person -> mortgageLoan -= monthlyPayment;
    monthsSimulated++;
  }
}

//If the person being simulated is financially literate, finLiterate argument should be passed with a value of true. 
int* simulator(person* person, double yearlySalary){
  
  int yearsSimulated = 1;
  int simulationLength = 40; // the number of years to be simulated
  double wealth = 0;
  double housePrice = 175000; // the price of the house the person wants to buy
  double rentAmount = 850; //The monthly cost of renting an apartment
  int mortgageTerm = 30; //Number of years to pay off mortgage loan
  person -> yearsWithDebt = 0;
  person -> savings = 0;
  person -> checking = 0;
  person -> debt = 31000;
  person -> yearsWithDebt = 0;
  person -> yearsRented = 0;
  person -> debtPaid = 0;
  person -> minPayment = .03;
  person -> house = false;

  printf("%d\n", person -> finLiterate); //DELETE THIS LINE BEFORE FINALIZATION OF CODE

  static int wealthArr[41]; // this needs to be static because local variables dissapear 
  wealthArr[0] = -24100; // Why is the inital debt equal to -24100?
  
  //Initializing values depending on whether or not the person is financially literate
  if(person -> finLiterate == true){
    person -> addlPayment = 15;
    person -> savingsRate = 0.07;
    person -> mortgageInterest = 0.045;
  }
  else{
    person -> addlPayment = 1;
    person -> savingsRate = 0.01;
    person -> mortgageInterest = 0.05;
  }

  while(yearsSimulated <= simulationLength){
    person -> savings += yearlySalary * 0.2; //Person puts 20 percent into savings
    person -> checking += yearlySalary * 0.3;//Person puts 30 percent into checkings

    //The following if-else statements are likely to contain a bug and need to be tested
    if(person -> house == true){
      house(person, housePrice, person -> mortgageInterest, mortgageTerm);
    }
    else{
      if(person -> finLiterate == true){
        if(person -> checking > housePrice * 0.2){
          person -> checking -= housePrice * 0.2;
          person -> mortgageLoan = housePrice - (housePrice * 0.2);
          person -> house = true;
        }
        else{
          rent(person, rentAmount);
        }
      }
      else{
        if(person -> checking > housePrice * 0.5){
          person -> checking -= housePrice * 0.05;
          person -> mortgageLoan = housePrice - (housePrice * 0.05);
          person -> house = true;
        }
        else{
          rent(person, rentAmount);
        }
      }
    }  
    debt(person, person -> debt, .03, person -> addlPayment);
    savingsPlacement(person, person -> savingsRate);
    wealth = (person->savings + person->checking - person->debt - person->mortgageLoan);
    wealth /= 3.0;
    // printf("%lf\n", wealth);
    wealthArr[yearsSimulated] = (int)wealth;
    yearsSimulated++;
  }
  return wealthArr;
}

int main(void) {
  person nfl;
  person fl;

  //Why is the program outputting the same values for wealth for both people?
  nfl.finLiterate = false;
  fl.finLiterate = true;

  int* nflWealth;
  int* flWealth;

  //REDO THE ZYBOOKS EXERCISES ON RETURNING ARRAYS FROM FUNCTIONS
  nflWealth = simulator(&nfl, 59000);
  flWealth = simulator(&fl, 59000);

  for(int i = 0; i < 41; i++){
    printf("nfl: %d\n", nflWealth[i]);
  }
  printf("\n");
  for(int i = 0; i < 41; i++){
    printf("fl: %d\n", flWealth[i]);
  }

  return 0;
}