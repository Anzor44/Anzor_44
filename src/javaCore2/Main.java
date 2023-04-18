package javaCore2;

public class Main {
    static class MyArraySizeException extends Exception {
        public MyArraySizeException(){
            super("������ ������� �������");
        }
    }
    static class MyArrayDataException extends Exception {
        public MyArrayDataException(int i, int j){
            super("������ ������ � ������ "+i+" "+j);
        }
    }
    public static void checkArraySize(String[][] array) throws MyArraySizeException{
      boolean result = false;
      if (array.length!=4){
          result = true;
      }
      for (String[] i: array){
          if (i.length!=4){
              result = true;
          }
      }
      if (result) {
          throw new MyArraySizeException();
      }
    }
    // ������������ ����� � �������
    public static void arraySum(String[][] array) throws MyArrayDataException {
        int res = 0;
        Integer value;
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                try {
                    value = Integer.valueOf(array[i][j]);
                    /* Use parseInt(String) to convert a string to a int primitive, or use valueOf(String) to
 convert a string to an Integer object*/
                }
                catch (Exception e) {
                    System.out.println("�������������� �� ������� ��������� - "+"\""+array[i][j]+"\" � ������ : "+i+" "+j);
                    throw new MyArrayDataException(i,j);
                }
                res+=value;
            }
        }
        System.out.println("����� ��������� ������� = "+res);
    }

    // exception "������ �������"
    public static void main (String[] args){
        String[][] rightArray = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String[][] bestArray = {{"1","Hello world","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String[][] badArray = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4","5"}};
        try {
            checkArraySize(rightArray);
        }
        catch (MyArraySizeException e){
            System.out.println(e);
        }
        //������ � ������� �����
        try {
            checkArraySize(badArray);
        }
        catch (MyArraySizeException e) {
            System.out.println(e);
        }
        try {
            arraySum(rightArray);
        }
        catch (MyArrayDataException e){
            System.out.println(e);
        }
        //������� ����� ��� ������������� �������
        try {
            arraySum(bestArray);
        }
        catch (MyArrayDataException e){
            System.out.println(e);
            // � ������� bestArray �� ������� ������������� ����� ������� ���������� "Hello World" � ������ : 0 1
        }
    }
}
