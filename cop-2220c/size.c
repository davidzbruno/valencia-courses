#include <stdio.h>
#include <limits.h>

int main(void){

    // What is the the size of variables with the following C data types – int, long, unsigned, long long, char, float and double?
    int a;
    long b;
    unsigned c;
    long long d;
    char e;
    float f;
    double g;
    printf("Size of int(%lu), long(%lu), unsigned(%lu), long long(%lu), char(%lu), float(%lu) and double(%lu)\n", sizeof(a), sizeof(b), sizeof(c), sizeof(d), sizeof(e), sizeof(f), sizeof(g));
    
    // Does adding the static keyword to the declaration of these variables in your program change their size?
    static int a1;
    static long b1;
    static unsigned c1;
    static long long d1;
    static char e1;
    static float f1;
    static double g1;
    printf("Size of static int(%lu), static long(%lu), static unsigned(%lu), static long long(%lu), static char(%lu), static float(%lu) and static double(%lu)\n", sizeof(a1), sizeof(b1), sizeof(c1), sizeof(d1), sizeof(e1), sizeof(f1), sizeof(g1));


    //What is the largest number and smallest numbers that can be represented in the variables in your program with the following C data type – int, long, long long, unsigned, char?
    printf("Range of data types:\nint: %d to %d\nlong: %ld to %ld\nunsigned: %ud to %ud\nlong long: %lld to %lld\nchar: %d to %d\nfloat: %f to %f\ndouble: %f to %f\n", INT_MIN, INT_MAX, LONG_MIN, LONG_MAX, 0, UINT_MAX, LLONG_MIN, LLONG_MAX, CHAR_MIN, CHAR_MAX, __FLT_MIN__, __FLT_MAX__, __DBL_MIN__, __DBL_MAX__);

    //Which of these types allow negative numbers to be meaningfully assigned as values? (int, unsigned, char, long)
    //----int, char and long
    return 0;
}