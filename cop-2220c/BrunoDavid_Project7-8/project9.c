#include <stdio.h>
#include <string.h>
#include "job.h"

void printJob(FILE* outFile, Job thisOccupation){
    fprintf(outFile, "This %s works at %s, Their main duties involve %s. They make $%.2f an hour working roughly %d hours a week.\n", thisOccupation.role, thisOccupation.company, thisOccupation.description, thisOccupation.hourlyPay, thisOccupation.weeklyHours);
}

int main(void){
    FILE* outFile = NULL;  // File pointer
    FILE* inFile = NULL;   // File pointer
    Job object;           // Data value from file
    long numBytesRead;     // Num bytes read from file
    
    inFile = fopen("job.dat", "wb");
    outFile = fopen("project9.txt","wb");

    // Check files
    if( outFile == NULL ) {
        printf("Could not open file job.dat.\n");
        return -1;
    }
    if( inFile == NULL ) {
        printf("Could not open file project.txt.\n");
        return -1;
    }

    // Print read numbers to output
    printf("Reading and writing numbers to project9.txt.\n");
    numBytesRead = fread(&object, sizeof(Job), 1, inFile);

    while (numBytesRead != 0) {
        printf("num: %ld\n", numBytesRead);
        fprintf(outFile, "hi\n");
        printJob(outFile, object);
        numBytesRead = fread(&object, sizeof(Job), 1, inFile);
    }
    
    // Done with file, so close it
    printf("Closing file job.dat.\n");
    fclose(inFile);
}