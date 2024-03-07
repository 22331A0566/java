#include <iostream>
using namespace std;

class student {
  private:
    double semper = 80;
  protected:
    int num = 66;
    void stdnum(){
          cout<<"My num is "<<num<<"(protected)"<<endl;
        }
  public:
    string name = “Harshitha";
void studname(){
      cout<<"My name is "<<name<<" (public)."<<endl;
    }
// function to access private member
    double getPVT() {
      cout<<"My percentage is "<<semper<<" (private)."<<endl;
      return semper;
    }
};
class details : public student {
  public:
    // function to access protected member from Base
    int getProt() {
        cout<<"My num is "<<num<<" (protected)."<<endl;
        return num;
    }
};
int main() {
  details object1;
  object1.studname();
object1.getProt();
  object1.getPVT();
  return 0;
}
