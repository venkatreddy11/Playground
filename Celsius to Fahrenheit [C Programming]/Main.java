#include <stdio.h>
float fahrenheit(float celsius);
float kelvin(float celsius);
int main()
{
    float celsius;
    scanf("%f",&celsius);
    printf("temperature in Fahrenheit %f", fahrenheit(celsius));
  	printf("\n");
    printf("temperature in Kelvin %f", kelvin(celsius));
    return 0;
}
float fahrenheit(float celsius)
{
	//type your code here
  	float temp;
  	temp=(celsius * 1.8)+32;
    return temp;
}
float kelvin(float celsius)
{
	//type your code here
  	float temp2;
  	temp2=celsius + 273.15;
  	return temp2;
}
