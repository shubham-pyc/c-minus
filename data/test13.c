void main() {
  int a[10];
  int i;

  println("This should print 0, 2, 2, 3, 6 and 36");
  a[0] = 0;
  println(a[0]);
  a[2] = 2;
  println(a[2]);

  i = 2;
  a[i] = i;
  println(a[i]);

  i = 0;
  while (i < 10) {
    a[i] = i;
    i = i + 1;
  }
  println(a[3]);
  println(a[6]);
  println(a[6]*6);
}
