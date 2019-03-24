#include <stdio.h>

void ask_in_range(int min, int max){
  printf("You need to guess a number between %d and %d\n", min, max);
  printf("Please guess a number: ");
}

int guessing_game(int num, int rangemin, int rangemax){
  int usr_guess;
  int guess_cnt = 1;

  printf("Hello and welcome to the game\n");
  ask_in_range(rangemin, rangemax);
  scanf("%d", &usr_guess);

  while(usr_guess != num){
    if(usr_guess > rangemax || usr_guess < rangemin){
      printf("Your number is not in the range\n");
    }
    else if(usr_guess < num){
      printf("Your guess is too low!\n");
    }
    else{
      printf("Your guess is too high\n");
    }

    printf("Please enter a number: ");
    scanf("%d", &usr_guess);

    guess_cnt++;
  }

  printf("You took %d guesses", guess_cnt);

  return usr_guess;
}

int main(){
  guessing_game(25, 0, 100);
  return 0;
}