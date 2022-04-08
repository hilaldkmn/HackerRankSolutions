# 2D Array
## ❓ Task
You are given a 6x6  2D array. An hourglass in an array is a portion shaped like this:
<pre>
a b c
  d
e f g
</pre>
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
<pre>
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
</pre>
Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
<pre>
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
</pre>
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.
## ⬅️Sample Input
<pre>
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
</pre>

## ➡️Sample Output
<pre>
19
</pre>

### 💬️Explanation
The hourglass which has the largest sum is:
<pre>
2 4 4
  2
1 2 4
</pre>