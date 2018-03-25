/** veri yapılar 1 ödev
 *singly linked list veri yapısı kullanılarak, x’e bağlı değişen iki adet fonksiyon üzerinden
  aritmetik işlemler 
  * 10/3/2018.
 * @author maya karahBala
 */
package HW;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

/**
 *
 * @author maya
 */
public class LinkedLst {

    Node head;
    Node tail;

    public LinkedLst() {
        head = null;
        tail = null;

    }

    public void AddLast(String data, String dataPower) {
        Node newNode = new Node(data, dataPower);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;

        }
    }

    public String print() {
        String str = "";
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + ":" + temp.dataPower + " -> ");
                str += temp.data + ":" + temp.dataPower + " -> ";
                temp = temp.nextNode;

            }
            System.out.println("null");
            str += "null";
        }
        return str;
    }

    public void fill(String s) {
        s = s.replace("+", "#+");
        s = s.replace("-", "#-");
        String[] splitedWords = s.split("#");
        String tempData, tempPower;
        for (String splitedWord : splitedWords) {
            // 4x^2 + x^3  + 7
            if (splitedWord.contains("x")) {
                tempData = splitedWord.substring(0, splitedWord.indexOf("x"));
                tempPower = splitedWord.substring(splitedWord.indexOf("x") + 2);
            } else {
                tempData = splitedWord;
                tempPower = "0";
            }

            if (tempData.equals("+") || tempData.equals("-")) {
                tempData = tempData + "1";
            } else if (tempData.equals("")) {// bastat + yoksa ekle
                tempData = "+1";
            }

            AddLast(tempData, tempPower);
        }
        if (!head.data.startsWith("+") && !head.data.startsWith("-")) {
            head.data = "+" + head.data;
        }
    }
//"x^1+1+2x^3";

    public BigInteger calculate(BigInteger x) {
        BigInteger result = new BigInteger("0");
        BigInteger tempData1;
        BigInteger tempDataPower;
        if (head == null) {
            return result;
        } else {
            Node temp = head;
            while (temp != null) {
                tempData1 = BigInteger.valueOf(Long.parseLong(temp.data.substring(1)));
                tempDataPower = x.pow(Integer.parseInt(temp.dataPower));

                if (temp.data.startsWith("-")) {

                    result = result.subtract(tempData1.multiply(tempDataPower));

                } else if (temp.data.startsWith("+")) {

                    result = result.add(tempData1.multiply(tempDataPower));

                }

                temp = temp.nextNode;
            }

            return result;
        }

    }

    public void printToFile(String fileame) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileame + ".txt"));) {
            bw.write(fileame);
            bw.newLine();
            bw.write(print());
        } catch (IOException ex) {
            System.out.println("acılamadı");

        }
    }
}
