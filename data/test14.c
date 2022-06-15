// Sum the first n elements of the array
int sum(int x[], int n) {
  int i;
  int sum;
  i = 0;
  sum = 0;
  while (i < n) {
    sum = sum + x[i];
    i = i + 1;
  }
  return sum;
}

void main() {
  int a[10];
  int i;

  println("This should print 6 and 28");
  i = 0;
  while (i < 10) {
    a[i] = i;
    i = i + 1;
  }

  println(sum(a, 4));
  println(sum(a, 8));
}
