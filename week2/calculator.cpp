#include<iostream>
using namespace std;
int main()
{
    int a,b;
    cout<<"1.addition,2.substraction,3.multiplication,4.division";
    int choice;
    cin>>choice;
    cout<<"enter two numbers"<<endl;
    float number1,number2;
    cin>>number1>>number2;
    switch (choice)
    {
        case 1:
               cout<<"addition of " <<number1<<"+"<<number2<<"is"<<number1+number2<<endl;
               break;
        case 2:
               cout<<"subtraction of " <<number1<<"-"<<number2<<"is"<<number1-number2<<endl;
               break;
        case 3:
               cout<<"multiplication of " <<number1<<"*"<<number2<<"is"<<number1*number2<<endl;
               break;
        case 4:
               cout<<"division of " <<number1<<"/"<<number2<<"is"<<number1/number2<<endl;
               break;
        default:
        { 
            cout<<"invalid operator"<<endl;
            break;
        }            
    }
}
