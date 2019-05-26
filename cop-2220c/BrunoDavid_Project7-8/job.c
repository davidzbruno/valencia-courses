#include <stdio.h>
#include <string.h>
#include "job.h"


int main(void){

    Job occupation[5];
    
    strcpy( occupation[0].role, "Doctor" ) ;
    strcpy( occupation[1].role, "Engineer" ) ;
    strcpy( occupation[2].role, "Lawyer" ) ;
    strcpy( occupation[3].role, "Teacher" ) ;
    strcpy( occupation[4].role, "Parent" ) ;

    strcpy( occupation[0].description, "Heals people" ) ;
    strcpy( occupation[1].description, "Builds for people" ) ;
    strcpy( occupation[2].description, "Sues people" ) ;
    strcpy( occupation[3].description, "Teaches people" ) ;
    strcpy( occupation[4].description, "Grows people" ) ;

    occupation[0].weeklyHours = 60;
    occupation[1].weeklyHours = 40;
    occupation[2].weeklyHours = 30;
    occupation[3].weeklyHours = 50;
    occupation[4].weeklyHours = 168;

    occupation[0].hourlyPay = 124.25;
    occupation[1].hourlyPay = 56.12;
    occupation[2].hourlyPay = 155.00;
    occupation[3].hourlyPay = 10;
    occupation[4].hourlyPay = 0;

    strcpy( occupation[0].company, "Winnie Palmer Hospital" ) ;
    strcpy( occupation[1].company, "Lockheed Martin" ) ;
    strcpy( occupation[2].company, "Bogin Munns & Munns" ) ;
    strcpy( occupation[3].company, "Valencia College" ) ;
    strcpy( occupation[4].company, "Homooe" ) ;

    FILE* outFile = NULL;
    outFile = fopen("job.bin", "wb");
    if( outFile == NULL ) {
        printf("Could not open file job.bin.\n");
        return -1;
    }
    
    printf("Writing numbers to job.dat.\n");
    for (int i = 0; i < 5; ++i) {
        fwrite(&(occupation[i]), sizeof(Job), 1, outFile);
    }

    printf("Finished.\n");
    fclose(outFile);
    
    return 0;
}