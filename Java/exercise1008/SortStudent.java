package exercise1008;

import java.util.Scanner;

//Page238 **7.17
public class SortStudent {
  public static void main(String[] args) {
	Scanner input = new java.util.Scanner(System.in);
	
	//����ѧ������
	System.out.print("The number of the students: ");
	int num = input.nextInt();
	String[] name = new String[num];
	double[] score = new double[num];
	
	//����ѧ�������ͳɼ�
	System.out.println("Please input student's names and grades:");
	for (int i = 0;i < num;i ++) {
	  System.out.println("Enter " + (i + 1) + " information");
	  name[i] = input.next();
	  score[i] = input.nextDouble();
	}
	
	//����
	for(int i = 0;i < num;i ++) {
	  double max = score[i];
	  int maxIndex = i;
	  for(int j = i + 1;j < num;j ++) {
		if(score[j] > max) {
		  max = score[j];
		  maxIndex = j;
		}
	  }
	  
	  if(maxIndex != i) {
		score[maxIndex] = score[i];
		score[i] = max;
		String temp = name[maxIndex];
		name[maxIndex] = name[i];
		name[i] = temp;
	  }
	}
	
	//���
	for(int i = 0; i < num; i ++) {
	  System.out.println(name[i]);
	}
  }
}
