class AddAndMult {
  
  private static long mult(long a, long b) {
    long product = 0;
    
    if (b == 0) return 0;
    
    for (long i = 0; i < b; i++) {
      product = sum(product, a);    
    }
    
    
    return product;
  }
  
  private static long sum(long a, long b) {
    long sum, carry;  
    
    if (b == 0) return a;
    
    sum = a ^ b; 
    carry = (a & b) << 1; 
  
    return sum(sum,carry); 
  }
  
  public static void main(String[] args) {
    System.out.println(mult(3,12));
  }
}