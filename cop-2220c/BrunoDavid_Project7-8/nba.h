#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
 
typedef struct nba_team_structure
{
    char abbreviation[3];
	char conference[20];
    char division[20];
    int yearFounded;
    bool stillActive;
    char areaName[20];
    char mainSponsor[20];
    char president[20];
    char headCoach[20];
    int nbaTitles;
    int conferenceTitles;
    int divisionTitles;
    int retiredNumbers[20];

    double yearlyBudget;
} nba;