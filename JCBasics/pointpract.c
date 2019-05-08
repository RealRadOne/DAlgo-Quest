#include<stdio.h>
#include<malloc.h>
int main()
{
	int num=2;
	printf("The location store is %p\n",&num);
	printf("The location store is %u\n",&num);
	//Now we gettin the value at said address
	printf("The value at location %d\n",*(&num));
	long int j=&num;
	//But you see this gives off a warning
	printf("The address at this %u\n",j);
	//So we have a special variable
	int *ptr=&num;
	printf("The value at this is %d\n",*ptr);
	printf("The address of pointer is %d\n",&(ptr));
	printf("The address of variable is %d::%d",&(*ptr),&num);
	return 0;
}