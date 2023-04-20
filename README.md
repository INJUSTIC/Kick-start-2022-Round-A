# Kick-start-2022-Round-A
This is my solution for tasks 1-4 in Kick Start 2022 Round A


  First task (Colliding Encoding):
Alan just had his first cryptography class in school today. He decided to apply what he learned and come up with his own cipher. He will map each English letter from A to Z to a decimal digit 0 through 9. He will then try to encode each word to a string consisting of decimal digits by replacing each letter in the word with its mapped digit.
In his excitement, Alan failed to notice that there are 26 letters in the English alphabet and only 10 decimal digits. As a result, there might be collisions, that is, pairs of different words whose encoding is the same.
Given a list of N words that Alan wants to encode and the mapping that he uses, can you find out if there would be any collisions between words on the list?

Input
The first line of the input gives the number of test cases, T. T test cases follow. The first line of each test case contains 26 decimal digits (integers between 0 and 9, inclusve) DA,DB,…,DZ, representing the mapping that Alan uses. A letter α is mapped to digit Dα. The second line of each test case contains N, the number of words Alan will encode. The i-th of the last N lines contains a string Si, representing the i-th word Alan will encode.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is either YES, if there is at least one pair of different words from the list whose encoding coincides, and NO otherwise.


  Second task (Illumination Optimization):
Problem
Onyaomale is leading a project to exchange the lightbulbs from street lights along a freeway from incandescent ones to LED lightbulbs that are both more energy-efficient and powerful. She started by taking all the old incandescent lightbulbs out, and is now focused on installing the new LED ones. Because the new lightbulbs are more powerful, Onyaomale thinks it is possible that some street lights are not necessary and she can save even more energy by not using them. We model the freeway as a straight line measuring M meters that goes from west to east. The x-th meter is a point that is x meters to the east of the western end of the freeway. If a street light is located at the x-th meter, and a lightbulb with an illumination radius of R meters is installed on it, then the street light illuminates the segment of freeway starting at the max(0,x−R)-th meter and ending at the min(M,x+R)-th meter, inclusive. Onyaomale needs to install lightbulbs in such a way that every point of the freeway is illuminated by at least one of them. Notice that this includes illuminating points that are not an integer number of meters away from the freeway endpoints. Street lights that are left without a lightbulb do not illuminate anything. Given the length of the freeway in meters M, the illumination radius of the new lightbulbs R and the locations of all street lights, find the minimum number of lightbulbs Onyaomale needs to install to illuminate the whole freeway, or report that it is impossible to do so.

Input
The first line of the input gives the number of test cases, T. T test cases follow. Each test case consists of two lines. The first line contains three integers M, R, and N: the length, in meters, of the freeway, the illumination radius, in meters, of the lightbulbs and the number of street lights, respectively. The second line of a test case contains N sorted integers X1,X2,…,XN representing the meters of the freeway where street lights are located.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the minimum number of lightbulbs Onyaomale needs to install to illuminate the whole freeway, if it is possible. If there is no way to illuminate the entire freeway using the current street lights, y should be IMPOSSIBLE instead.


  Third task (Rainbow Sort):
Problem
Your friend Charles gives you a challenge. He puts N cards on a table and arranges them in a line in an order that he chooses. Each card has a single color, and each color can be on one or more cards. Charles then asks you to write a positive integer on each card without altering his chosen order such that:
The integers you write appear in non-decreasing order when cards are read from left to right. Cards of the same color have the same integer written on them. Cards of different colors have different integers written on them. Finally, Charles wants you to order the colors in increasing order of written integer. For example, if blue cards have a 2 , red cards have a 5, and green cards have a 3, the color order would be blue, green, red.

Input
The first line of the input gives the number of test cases, T. T test cases follow.
Each test case begins with a line containing the integer N. The next line contains N integers, S1, S2, …, SN, where Si represents the color of the i-th card from the left.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the set of colors, once each, listed in the requested order. If it is impossible to write integers in the given cards while adhering to all the rules, y must be IMPOSSIBLE instead.


  Fourth task (ASCII Art):
Problem
Cody-Jamal has heard about generative artificial intelligence producing art. He is excited about the new art opportunities, but also worried about human-created art being displaced. He thought a good compromise would be to use computers to create art that humans simply cannot. Since Cody-Jamal is just beginning at computer-generated art, he started simple. He wants to create an immense string that shows the English alphabet in a doubly-repeated way, to represent its ubiquity and permanence.
Cody-Jamal wrote the following program:
for i = 1 to 1e100:
  for letter = A to Z:
    print letter i times
Here 1e100 represents the integer 10100
. For example:
When i=1, the program prints ABCD....XYZ.
When i=2, the program prints AABBCC...XXYYZZ.
When i=3, the program prints AAABBBCCC...XXXYYYZZZ.
Of course, Cody-Jamal's program takes a long time to finish. Can you help him know what the N-th printed letter will be without waiting for it to be printed?

Input
The first line of the input gives the number of test cases, T. T test cases follow. Each test case consists of a single line with an integer N.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the N-th character printed by Cody-Jamal's program.
