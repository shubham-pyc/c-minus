void foo() {
  println(7);
}

void fum() {
    int a;
    int b;
    a = 9;
    b = 12;
    println(b-a+4);

    foo();
}

void main() {
  println("This program prints 7 7 7");
  foo();
  fum();
}
