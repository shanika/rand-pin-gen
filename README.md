### Rand Pin Gen

Rand Pin Gen is a library that generates a batch of random numbers in the given range.

Approach:

Divide number range into two parts,  
example when: min=1000, max=9999,  batchSize= 1000

| 1000 - 8999 | 9000 - 9999|

Then generate a random number from first range and check if its already used using a tracking HashSet  
If already used return the next number sequence from 2nd range


- Space complexity: O(n) 
- Time complexity: O(n), Worst case O(nlog n)
  n: batch size

Usage:

```java 
RandomPinGenerator generator = new RandomPinGenerator();
int[] result = generator.getNext(1000, 1000, 9999);
   ```
