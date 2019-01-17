
#include<iostream>
#include<stdlib.h>
#define SIZE 5
using namespace std;

class Stack{
private:
int itsStack[SIZE];
int tos; // tos refers to top of stack. 
public:
Stack();
// Stack(const Stack &)
bool isEmpty();
bool isFull();
void push(int);
void pop();
int top();
bool display();
~Stack(){}
};

Stack::Stack(){
tos=-1; // Top of stack is -1, which implies the index of the array is still less than 0 i.e. array is unassigned yet.
}

// Stack()::Stack(const Stack& temp){} Copy constructor is in hold for a while.

bool Stack::isEmpty(){
if(tos==-1){
return true; // Function returns true if the stack is empty i.e. Stack Underflow
}
return false; // Function returns false if the stack is not empty.
}

bool Stack::isFull(){
if(tos>=SIZE-1){
return true; // Function returns true if the stack is full i.e. Stack Overflow.
}
return false; // Function returns false if the stack is not full.
}

void Stack::push(int data){
if(isFull()){
cout << "Stack is Full. \n";
return ; // No returned value because the return type is void in the function.
}
itsStack[tos++]=data;
cout << "\nThe item pushed is " << data << endl;
return ;
}

void Stack::pop(){
if(isEmpty()){
cout << "Stack is empty. \n";
return ;
}
int data=itsStack[tos];
cout << "The item popped is " << data << endl;
--tos;
return ;
}

int Stack::top(){
if(isEmpty()){
cout << "Stack is empty. \n";
return 0;
}
int data=itsStack[tos];
cout << "The item on the top is " << data << endl;
return 1;
}

bool Stack::display(){
if(isEmpty()){
cout << "Stack is empty.\n";
return false;
}
if(isFull()){
cout << "Stack is full.\n";
return false;
}
cout << "\nThe elements are : \n";
for(int i=0;i<SIZE;i++){
cout << itsStack[tos];
}
return true;
}

int main(){
Stack example;
int data,choice;
while(true){ // The condition for while is set to be true because the loops runs forever; as we need to display the menu everytime. True also can be replaced be 1.
cout << "\n1. Push Element";
cout << "\n2. Pop Element";
cout << "\n3. Display Elements";
cout << "\n4. Exit the Program";

cout << "\nEnter your choice : ";
cin >> choice;

switch(choice){
case 1:
cout << "\nEnter value : ";
cin >> data;
example.push(data);
break;
case 2:
example.pop();
break;
case 3:
example.display();
break;
case 4:
exit(0); //The parameter 0 is returned to OS by compiler.
}
}
return 0;
}


