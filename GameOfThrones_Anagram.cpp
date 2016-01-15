#include<iostream>
#include<string>
using namespace std;
int main(void){
	string inputString;
	int frequency[26];
	for(int i=0;i<26;i++){
		frequency[i]=0;	
	}
	cin >> inputString;
	int length=inputString.length();
	for(int i=0;i<length;i++){
            char tmp=inputString[i];
            tmp=toupper(tmp);
            frequency[tmp-65]++;
        }
	int largest=0;
        for(int i=0;i<26;i++){
            largest=frequency[i];
            if(largest<frequency[i]){
                largest=frequency[i];
            }
        }
	int numberOfOdd=0;
        for(int i=0;i<26;i++){
            if(frequency[i]%2 != 0){
                numberOfOdd++;
            }
        }
        if(numberOfOdd>1){
        	cout<<"NO"<<"\n";
        }
        else if(largest %2 ==1 && numberOfOdd ==1 ){
            cout<<"YES"<"\n";
        }
        else {
            cout<<"YES"<<"\n";
        }
	return 0;
}
