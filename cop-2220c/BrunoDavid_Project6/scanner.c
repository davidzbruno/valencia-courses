#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void search(char *line)
{
}

int main(void)
{

    FILE *inFile = NULL, *outFile = NULL; // File pointer
    char *inputLine = (char *)malloc(1000 * sizeof(char));
    char line[1000];  // Data value from file
    int numLines = 0; // returns the number of lines in the file.
    int numBlanks = 0;
    inFile = fopen("input.c", "r");
    outFile = fopen("output.txt", "w");

    if (inFile == NULL)
    {
        printf("Could not open file input.txt.\n");
        return -1; // -1 indicates error
    }
    if (outFile == NULL)
    {
        printf("Could not open file output.txt.\n");
        return -1; // -1 indicates erro
    }

    while (!feof(inFile))
    { // there is a line in the file
        fgets(inputLine, 1000, inFile);
        printf("%s SIZE: %5d", inputLine, (int)strlen(inputLine));
        // if (fscanf(inFile, "%[^\n]", line) == 1)
        // {
        //     printf("%s\n", line);
        //     if (strcmp(line, "n++") == 0)
        //         printf("BAKLDSAJDSAKDLASJ");
        //     search(line);
        //     numLines++;
        // }
        // else
        // {
        //     fscanf(inFile, "%c", line);
        //     if (line[0] == '\n')
        //         numBlanks++;
        // };
        // print line
        // increase the file pointer
    }

    numLines = (numLines < 0) ? 0 : numLines + 1; //take into account the end-of-file line
    printf("number of lines: %10d\n", numLines);
    printf("number of bannks: %10d\n", numBlanks);

    fclose(inFile); //close file

    return 0;
}