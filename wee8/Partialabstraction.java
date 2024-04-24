#include <iostream>

using namespace std;

class Vehicle {
protected:
  string make;
  string model;
  int year;

public:
  Vehicle(string make, string model, int year) {
    this->make = make;
    this->model = model;
    this->year = year;
  }

  virtual void print() {
    cout << "Vehicle: " << make << " " << model << " " << year << endl;
  }
};

class Car : public Vehicle {
public:
  Car(string make, string model, int year) : Vehicle(make, model, year) {}

  void print() override {
    cout << "Car: " << make << " " << model << " " << year << endl;
  }
};

int main() {
  Vehicle* vehicle = new Car("Toyota", "Camry", 2020);
  vehicle->print();

  delete vehicle;

  return 0;
}
