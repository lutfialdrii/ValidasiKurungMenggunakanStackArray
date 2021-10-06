package StackArray;

public class Main {
    public static void main(String[] args) {
        StackArray stack = new StackArray(100);

        String soal = "f(x) = (2x + y) - (3 + (2x - x) + 20)";

        //proses pengecekan tanda kurung
        for (int i = 0; i <soal.length() ; i++) {
            char karakter = soal.charAt(i);
            if (karakter == '('){
                stack.push("(");
            } else if (karakter == ')'){
                stack.pop();
            }
        }
        stack.validasi();
    }
}
