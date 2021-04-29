Introduction
Asymptotic notations are used to analyze an algorithm’s running time by identifying its behavior as the input size for the algorithm increases. There are six symbols used to characterize the relative growth rates of functions:

Symbol	Summary
f = Θ(g)	f grows at the same rate as g
f = O(g)	f grows no faster than g
f = Ω(g)	f grows at least as fast as g
f = o(g)	f grows slower than g
f = ω(g)	f grows faster than g
f ∼ g	f/g approaches 1
 

The algorithm performance can be measured based on the worst-case, best-case, and average-case. Bachmann–Landau notation is an Asymptotic Notation for the worst case or ceiling of growth for a given function. Computer programming uses this notation to classify algorithms according to how their computing time or space requirements grow as the input size grows. Here are the notations ordered from the fastest to slowest:

O(1) – Constant Time Algorithms. The time is a constant amount of time regardless of the size of n. This is fastest one.
O(log n) – Logarithmic Time Algorithms – It grows in proportion to the logarithm of the input size.
O(n) – Linear Time Algorithms – It grows linearly with the input size.
O(n log n) – N Log N Time Algorithms – It grows in proportion to n log n of the input size.
O(n^p) – Polynomial Time Algorithms – These algorithms are slower than O(n log n) algorithms.
O(k^n) – Exponential Time Algorithms – It grows in proportion to some factor exponentiation by the input size.
O(n!) – Factorial Time Algorithms – It grows to the factorial of the input size. This is the slowest.
In this example, I will create several methods and analyze them with Big O notations: O(1), O(Log n), O(n), and O(n^2).

Sum an integer series by adding them all. It is O(n) for both time and space complexity.
Sum an integer series by using formula. It is O(1) for both time and space complexity.
Find an item from a sorted integer array with binary search algorithm. It is O(Log n) for time complexity and O(1) for space complexity.
Sort an integer array with insertion sort algorithm. It is O(n^2) for time complexity and O(1) for space complexity.


https://examples.javacodegeeks.com/big-o-notation-java-example/
