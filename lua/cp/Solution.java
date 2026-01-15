
/**
 * Author: https://prerit714.cloud
 * */

import java.io.*;
import java.util.*;

class CP {
  public static long binPow(long a, long b) {
    long res = 1;
    while (b > 0) {
      if ((b & 1) == 1) {
        res = res * a;
      }
      a = a * a;
      b >>= 1;
    }
    return res;
  }
}

class FastIO {
  private final BufferedReader br;
  private StringTokenizer st;
  private final PrintWriter out;

  FastIO() {
    this.br = new BufferedReader(new InputStreamReader(System.in));
    this.out = new PrintWriter(new BufferedOutputStream(System.out));
    this.st = new StringTokenizer("");
  }

  FastIO(String inputFile, String outputFile) throws IOException {
    this.br = new BufferedReader(new FileReader(inputFile));
    this.out = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
    this.st = new StringTokenizer("");
  }

  private String next() {
    while (!this.st.hasMoreTokens()) {
      try {
        this.st = new StringTokenizer(this.br.readLine());
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
    return this.st.nextToken();
  }

  public int nextInt() {
    return Integer.parseInt(this.next());
  }

  public long nextLong() {
    return Long.parseLong(this.next());
  }

  public String nextLine() {
    try {
      return this.br.readLine();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Input int array
   */
  public int[] nextIntArray(int n) {
    int arr[] = new int[n];
    for (int i = 0; i < n; ++i) {
      arr[i] = this.nextInt();
    }
    return arr;
  }

  /**
   * Input long array
   */
  public long[] nextLongArray(int n) {
    long[] arr = new long[n];
    for (int i = 0; i < n; ++i) {
      arr[i] = this.nextLong();
    }
    return arr;
  }

  public void print(Object o) {
    this.out.print(o);
  }

  public void println(Object o) {
    this.out.println(o);
  }

  public void println() {
    this.out.println();
  }

  public void printArray(int[] arr) {
    StringBuilder sb = new StringBuilder();
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
      sb.append(arr[i]);
      if (i < n - 1) {
        sb.append(" ");
      }
    }
    this.out.println(sb);
  }

  public void printArray(long[] arr) {
    StringBuilder sb = new StringBuilder();
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
      sb.append(arr[i]);
      if (i < n - 1) {
        sb.append(" ");
      }
    }
    this.out.println(sb);
  }

  public void flush() {
    this.out.flush();
  }

  public void close() {
    this.out.close();
  }
}

class Solution {
  static final FastIO io = new FastIO();

  public static void main(String... args) {
    var t = io.nextInt();
    while (t-- > 0) {
      ;
    }

    io.close();
  }
}
