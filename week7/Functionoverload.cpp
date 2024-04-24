#include <iostream>
using namespace std;

class Harshitha {
public:
    void showFeature() {
        cout << "I have a feature where we are similar in some aspects.\n";
 }

    void showFeature(string featureName) {
        cout << "Feature Name: " << featureName << endl;
    }
};

int main() {
    Harshitha obj;
    obj.showFeature();
    obj.showFeature("Smart Harshitha");
    return 0;
}
