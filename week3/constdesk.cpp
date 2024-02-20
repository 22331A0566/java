#include<iostream>
using namespace std;
class Student
{
public:
    string fullName, collegeName;
    int rollNumber, collegeCode;
    double semPercentage;
    Student(string Name, int rollNum, double percentage, string college, int clgCode)
    {
        fullName = Name;
        rollNumber = rollNum;
        semPercentage = percentage;
        collegeName = college;
        collegeCode = clgCode;
    }
    Student()
    {
        fullName = "harshitha";
        rollNumber = 566;
        semPercentage = 85.0;
        collegeName = "MVGRCE";
        collegeCode = 46;
    }
    ~Student()
    {
        cout << "DEAD" <<endl;
    }

    void display()
    {
        cout << "Full Name : " <<fullName << endl;
        cout << "Roll Number : " <<rollNumber << endl;
        cout << "Sem Percentage : " <<semPercentage << endl;
        cout << "College Name : " <<collegeName << endl;
        cout << "College Code : " <<collegeCode << endl;
    }
};

int main()
{
    Student student1;
    Student student2("siddika", 523, 95, "MVGRCE", 46);
    student1.display();
    student2.display();
}
