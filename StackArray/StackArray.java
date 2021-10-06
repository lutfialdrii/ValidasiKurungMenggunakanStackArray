package StackArray;

public class StackArray {
    private String data [];
    private int top = 0;

    //Method untuk menentukan kapasitas Array
    public StackArray(int kapasitas){
        data = new String[kapasitas];

        }
    //Proses Push
    public boolean push(String isi ){
        if(top < data.length) {
            data[top] = isi;
            top++;
            return true;
        } else {
            return false;
        }
    }
    //proses pop
    public boolean pop(){
        try {
            top--;
            String temp = data[top];
            data[top] = null;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Tidak Valid");
            System.exit(0);
        }
        return top<=0;
    }

    public boolean validasi(){
        if (top==0){
            System.out.println("Valid");
        } else if (top > 0){
            System.out.println("Tidak valid");
        }
        return true;
    }
}
