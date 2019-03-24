//The * operator is a dereference operator and allows you to access the value stored at the memory address held by a pointer variable. The & operator allows you to access the memory address of a variable. 
//Written by Tanner Yilmaz

#include <stdio.h>
#include <stdlib.h>

typedef struct node{
  int data;
  struct node* next;
}node;

void prepend(node** head, int val){ //passing a double pointer allows modification of head
  node* new_node;
  new_node = (node*)malloc(sizeof(node));
  new_node -> data = val;
  new_node -> next = *head;
  *head = new_node;
}

int remove_first_node(node** head){
  node* old_head;
  old_head = *head;
  *head = (*head) -> next;
  int return_val = old_head->data;
  free(old_head);

  return return_val;

}

int main(void) {

  node* head;

  head = (node*)malloc(sizeof(node));

  head -> data = 1;

  head -> next = (node*)malloc(sizeof(node));
  head-> next ->data = 2; //i.e. (*(*head).next).data = 2;
  
  printf("List contents: %d %d\n", head -> data, head -> next -> data);

  prepend(&head, 0); //&head is the memory address of a variable that stores                                      the memory address of the first node in the list.

  printf("List contents after adding 0: %d %d %d\n", head -> data, head -> next -> data, head -> next -> next -> data);
  
  remove_first_node(&head); //Removing first node in list;
  remove_first_node(&head); //Removing first node in list;

  printf("List contents after removal of two items: %d", head -> data);
  
  return 0;
}