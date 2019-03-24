#include <stdio.h>
#include <stdlib.h> 
#include <string.h>
#include <time.h>

void ask_in_range(int min, int max){
  printf("You need to guess a number between %d and %d\n", min, max);
  printf("Please guess a number: ");
}

int get_random(int rangemin, int rangemax){
  srand( time(NULL) );
  return ( rand() % (rangemax - rangemin + 1)) + rangemin;
}

void file_write(char player_name[], int guess_cnt){
  FILE *outfile; 
  outfile = fopen ("history.txt", "w");
  fprintf(outfile, "%s's score: %d", player_name, guess_cnt);
  fclose(outfile);
}

char* file_read(char prev_player_score[]){

  FILE *input_file; 
  input_file = fopen ("history.txt", "r");
  fgets(prev_player_score, 100, input_file);
  fclose(input_file);

  return prev_player_score;
}

int guessing_game(int rangemin, int rangemax){
  int usr_guess;
  int guess_cnt = 1;
  int num = get_random(rangemin, rangemax);
  char prev_player_info[40];
  char prev_name[15];
  char usr_name[15];

  printf("Hello and welcome to the game\n");
  printf("Please enter your name: \n");
  scanf("%s", usr_name);
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

  printf("You took %d guesses\n", guess_cnt);
  strcpy(prev_player_info, file_read(prev_player_info));

  printf("%s", prev_player_info);
  file_write(usr_name, guess_cnt);

  return usr_guess;
}

int main(){
  guessing_game(-2, 2);
  return 0;
}

// the maximum number of guesses needed to guess a number in the range [-500, 500] is 1001 guesses.
