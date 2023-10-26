#include <iostream>
#include <string>

using namespace std;


class Human {
private:
    string name;      
    string bloodType; 
    string organName; 

public:
   // Encapsulation: Getter and Setter methods
        string getName() {
        return name;
    }

    void setName(string newName) {
        name = newName;
    }

    string getBloodType() {
        return bloodType;
    }

    void setBloodType(string newBloodType) {
        bloodType = newBloodType;
    }

    string getOrganName() {
        return organName;
    }

    void setOrganName(string newOrganName) {
        organName = newOrganName;
    }

     // Polymorphism: Display method
    void displayInfo() {
        cout << "Name: " << name << ", Blood Type: " << bloodType << ", Organ Name: " << organName << endl;
    }
};

// Inheritance
class Patient : public Human {
private:
    int patientID; 

public:
    
    Patient(string name, string bloodType, string organName, int patientID) {
        setName(name);
        setBloodType(bloodType);
        setOrganName(organName);
        this->patientID = patientID;
    }

     // Polymorphism: Display method
    void displayInfo() {
        cout << "Name: " << getName() << ", Blood Type: " << getBloodType() << ", Organ Name: " << getOrganName() << ", Patient ID: " << patientID << endl;
    }
};

int main() {
    Human person1;
    person1.setName("tushar");
    person1.setBloodType("B+");
    person1.setOrganName("Heart");

    Patient patient1("Mahaveer", "B-", "Kidney", 1);

    cout << "Information for normal Person:" << endl;
    person1.displayInfo();

    cout << "\nInformation for special patient:" << endl;
    patient1.displayInfo();

    return 0;
}
