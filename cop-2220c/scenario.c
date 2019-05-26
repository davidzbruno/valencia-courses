#import <stdio.h>
#import <stdlib.h>
#include <stdbool.h>

/*
Scenario by: Nikolas Goetzke
It's Friday and you want to order takeout to your house!

If the time is after 12 pm but before 5 pm (inclusive) and 5 of your friends
are over and everyone collectively has more than $20 you order a Pizza from Papa Murphy's. 
-or- 
If the time is after 5 pm and at least 3 of your friends are still over and
one or more of your friends says they are starving you order Chinese Food from the Oriental Diner. 
*/
    
bool takeout(int time, int friends, int money, bool starvingFriend){
    //boundary test cases
    if(time < 0 || time > 24 || friends < 0 || money < 0) return false;

    //only two times you will order takeout
    bool papaMurphys = (time > 12 && time <= 18 && friends == 5 && money > 20);
    bool orientalDiner = (time > 18 && friends >= 3 && starvingFriend);

    if( papaMurphys || orientalDiner)
        return true;
    
    return false;
}


int main(void){
    int time = 0;
    int friends = 0;
    int money = 0;
    bool starvingFriend = true;

    for(time = 0; time < 24; ++time){
        for(friends = 0; friends <= 10; ++friends){
            for(money = 0; money <= 50; money+=10){
                if(takeout(time,friends,money,starvingFriend) || takeout(time,friends,money,!starvingFriend))
                    printf("Time: %-5.2d Friends: %-5d Money: %-5.2d Straving Friend?: %-5d\n", time, friends, money, starvingFriend);
            }
        }
    }
    return 0;
}