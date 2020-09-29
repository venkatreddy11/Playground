#include<iostream>
using namespace std;

void printpattern(int n)
{
  string pat="";
  char star='*';
  char hash='#';
  for(int i=0;i<n;i++)
  {
    if(i%2==0)
    {
      pat=pat+star;
      cout<<pat;
    }
    else{
      pat=pat+hash;
      cout<<pat;
    }
    cout<<"\n";
  }
  
}


int main()
{
    int a;
    cin>>a;
    printpattern(a);
    return 0;
}
