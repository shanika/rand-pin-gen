### Rand Pin Gen

Rand Pin Gen is a library that generates a batch of random numbers in the given range.

Approach:

Divide number range into two parts,  
example when: min=1000, max=9999,  batchSize= 1000

1. 1000 - 8999
2. 8999 - 9999

Then generate a random number from first range and check if its already used using a tracking HashSet  
If already used return the next number sequence from 2nd range


- Space complexity: O(n) n: batch size
- Time complexity: O(n) n: batch size, worst case O(nlog n)

Usage:

```java 
RandomPinGenerator generator = new RandomPinGenerator();
int[] result = generator.getNext(1000, 1000, 9999);
   ```
