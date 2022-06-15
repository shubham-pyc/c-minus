// Sum the first n elements of the array
int sum(int x[], int n)
{
  int i;
  int sum;
  i = 0;
  sum = 0;
  while (i < n)
  {
    sum = sum + x[i];
    i = i + 1;
  }
  return 1000;
}

int test1(int a, int b, int c)
{
  int sum1;
  int sum2;
  sum1 = 100;
  sum2 = 20;

  return 999;
}

void main()
{
  int a[10];
  int i;

  println("This should print 6 and 28");
  i = 0;
  while (i < 10)
  {
    a[i] = i;
    i = i + 1;
  }

  // println(sum(a, 4));
  println(test1(1, 2, 3));
  // println(sum(a, 8));
}
