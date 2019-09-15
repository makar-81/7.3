package main;

import java.io.*;
import java.util.ArrayList;


/**
 * Created by emakarov on 28.01.2016.
 */



public class Main {
    public static void main(String[] args) {
        // put your code here
        try {
        String temp;

        FileReader fr = new FileReader("./test1.txt");
        FileWriter wr = new FileWriter("./test2.txt");

        BufferedWriter  bw = new BufferedWriter(wr);
        BufferedReader br = new BufferedReader(fr);

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //Map<String, Integer> store = new HashMap<String, Integer>();
        //Map<Integer,String> keys = new HashMap<Integer,String>();
        //ArrayList<String> myArrayList = new ArrayList<String>();
        //ArrayList<String> myArrayList_correlations = new ArrayList<String>();

        // Map<String, Integer> count = new HashMap<String, Integer>();
        //int key = 0;
            int array_i=0;
        try {
            while ((temp = br.readLine()) != null) {
                while (!temp.isEmpty()) {

                    int pos1 = temp.indexOf("\t");
                    if (pos1>0) {
                        String word = temp.substring(0, pos1);
                        int pos2 = temp.substring(pos1+1, temp.length()).indexOf("\t");
                        String line = temp.substring(pos1 + 1, pos1+1+pos2);
                        String count = temp.substring(pos1+pos2 +2, temp.length());
                        System.out.println(word + "\t" + line + ";" + count + ";" + "1" + "\n");
                        bw.write(word + "\t" + line + ";" + count + ";" + "1" + "\n");
                        bw.flush();
                        temp = "";
                    }
                    temp="";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

