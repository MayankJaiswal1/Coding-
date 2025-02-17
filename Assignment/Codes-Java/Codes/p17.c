#include <stdio.h>

void main(){
	int arr[] = {10,20,30,40,50};
	printf("%p\n",&arr[0]);
	printf("%p\n",&arr);
}

/*
 mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/Arrays/Jagged_Array 25_11-March$ vim p17.c
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/Arrays/Jagged_Array 25_11-March$ gcc -o m p17.c
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/Arrays/Jagged_Array 25_11-March$ ./m
0x7ffe7bea0fe0
0x7ffe7bea0fe0

*/
