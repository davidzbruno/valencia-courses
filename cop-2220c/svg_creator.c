// Draw SVG primitives

// Based on: https://www.w3schools.com/graphics/svg_inhtml.asp
// example:
/*
 <svg height="100" width="100">
  <circle cx="50" cy="50" r="40" stroke="black" stroke-width="3" fill="red" />
</svg> */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>
// User defined functions are in Chapter 6 of your zyBook
void circle(int cx, int cy, int r, char *color)
{
    printf("\t<circle cx='%d' cy='%d' r='%d' fill='%s' />\n", cx, cy, r, color);
}

/*
 <svg height="210" width="500">
  <line x1="0" y1="0" x2="200" y2="200" style="stroke:rgb(255,0,0);stroke-width:2" />
</svg>
*/
void line(float x1, float y1, float x2, float y2, char *stroke)
{
    printf("<line x1='%f' y1='%f' x2='%f' y2='%f' style='%s' />\n",
           x1, y1, x2, y2, stroke);
}

// example from: https://www.w3schools.com/graphics/svg_rect.asp
//
// <rect width="300" height="100" style="fill:rgb(0,0,255);stroke-width:3;stroke:rgb(0,0,0)" />
void rect(int x, int y, int width, int height, char *color)
{
    printf("<rect x=%d y=%d width='%d' height='%d' style = 'fill:%s;stroke-width:3;stroke:rgb(0,0,0)'/>\n",
           x, y, width, height, color);
}

void beginHtmlSVG(int wide, int high, char *backColor)
{
    printf("<!DOCTYPE html>\n");
    printf("<html>\n");
    printf("<body>\n");

    printf("<svg height='%d' width='%d' style='stroke-width: 0px; background-color: %s;'>\n",
           high, wide, backColor);
}

void endHtmlSVG()
{
    printf("</svg>\n");
    printf("</body>\n");
    printf("</html>\n");
}

char *getRGBColor(int red, int green, int blue)
{
    static char *svgFillString = "rgb(%d, %d, %d)";
    static char result[100] = {0};
    sprintf(result, svgFillString, red, green, blue);
    return result;
}

int main()
{
    srand(time(NULL));
    const int WIDTH = 1000;
    const int HEIGHT = 1000;
    const int offset = (rand() % 30) + 5;
    //Background
    beginHtmlSVG(WIDTH, HEIGHT, getRGBColor(153, 204, 255)); 

    //Ground
    int topOfGrass = 850;
    int topOfDirt = topOfGrass + offset;
    rect(0, topOfGrass, WIDTH, HEIGHT-topOfGrass, getRGBColor(0, 153, 0)); // grass
    rect(0, topOfDirt, WIDTH, HEIGHT-topOfDirt, getRGBColor(153, 102, 51)); // dirt

    // telecope color
    int red = rand() % 255;
    int blue = rand() % 255;
    int green = rand() % 255;

    // telescope
    int radius = 5;
    int scopeX = 100;
    int scopeY = topOfGrass - radius;
    int size = 10;
    int i;
    for (i = 0; i <= size; ++i)
    {
        circle(scopeX + (offset * i), scopeY - (offset * i), radius + (offset * i) / 4, getRGBColor(red + (offset * i), green + (offset * i), blue + (offset * i)));
    }

    // telescope stand
    line(scopeX + offset, topOfGrass, scopeX + offset * 2, scopeY - offset * 2, "stroke:rgb(0,0,0);stroke-width:4");
    line(scopeX + offset * 3, topOfGrass, scopeX + offset * 2, scopeY - offset * 2, "stroke:rgb(0,0,0);stroke-width:4");

    endHtmlSVG();

    return 0;
}
