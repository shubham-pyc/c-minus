void main() {
  int a;
  int b;

  println("This program prints 7 7 7");
  a = 3;
  b = 2;
  {
    int a;
    a = 5;
    println(a+b);
    {
        int b;
        b = 9;
        a = -2;
        println(a+b);
    }
    b = 4;
  }
  println(a+b);
}
