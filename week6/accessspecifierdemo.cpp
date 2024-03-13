#include<iostream>
using namespace std;
class AccessSpecifierDemo{
    private:
    int privar;
    protected:
    int provar;
    public:
    int pubvar;
    public :
    void setvar(int privalue,int provalue,int pubvalue){
        privar=privalue;
        provar=provalue;
        pubvar=pubvalue;

    }
    void getvar(){
        cout<<"private value : "<<privar<<endl;
        cout<<"protected value : "<<provar<<endl;
        cout<<"public value : "<<pubvar<<endl;
    }
};
int main(){
    AccessSpecifierDemo obj;
    obj.setvar(22,33,44);
    obj.getvar();
}
