
int add(int x, int y) {
  return x+y;
}

int add2(int x, int y) {
  return add(add(x,y),1);
}

void main() {
  println("This program prints 7");
  println(add2(2, 4));
}

