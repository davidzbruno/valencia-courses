#include <stdio.h>
#include <stdlib.h>

int main(void){
    
    FILE* inFile = NULL; // File pointer
    char string[100];        // Data value from file

    inFile = fopen("input.c", "r");
    if (inFile == NULL) {
        printf("Could not open file sample-code.txt.\n");
        return -1; // -1 indicates error
    }

   fscanf(inFile, "%[^\n]", string);
   printf("%s",string);
   
   
   fclose(inFile); // close file

    return 0;
}