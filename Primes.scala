
// This silly little script prints out a list of prime numbers.

def isPrime(n: Int): Boolean = {
  n match {
    case number if n <  2 => false
    case _      if n == 2 => true
    case _  =>
      var result = true
      for (i <- 2 to n-1) {
        if (n % i == 0) result = false;
      }
      return result
  }
}

val upperBound = args(0).toInt
for (i <- 2 to upperBound) {
  if (isPrime(i)) println(i)
}