#include<iostream>
using namespace std;
class transport{
    public:
    int transport=10;
    private:
    int model=1985;
};
class bus:public transport{

};
int main(){
bus obj;
cout<<obj.transport<<endl;
//cout<<obj.model<<endl;
}
