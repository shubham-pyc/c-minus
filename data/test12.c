int fib(int i) {
  if (i == 0) return 1;
  if (i == 1) return 1;
  return fib(i-1) + fib(i-2);
}

void main() {
  int i;
  i = 0;
  println("This program prints the first 12 numbers of the Fibonacci sequence.");
  while (i < 12) {
      println(fib(i));
      i = i + 1;
  }
}
