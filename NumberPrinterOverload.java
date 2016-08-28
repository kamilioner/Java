class NumberPrinterOverload {
    void printNumber(int a) {
        System.out.println(a);
    }
     
    void printNumber(int a, int b) {
        printNumber(a);
        System.out.println(b);
    }
     
    void printNumber(int a, int b, int c) {
        printNumber(a, b);
        System.out.println(c);
    }
	void printNumber(int a, int b, int c, int d) {
        printNumber(a, b, c);
        System.out.println(d);
    }
}