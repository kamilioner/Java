package sorting;

import java.util.Arrays;
import java.util.Random;

public class Sortowania {
    
	public final static int ZAKRESTABELI = 50000;
	public final static int PRZEDZIALSORT = 1000000;
	
	public static void swap(int a, int b){
	    int temp = a;
	    a = b;
	    b = temp;
	}
	
	public static long Sortowanie_wstawianie(int[] tab){
		long start = System.currentTimeMillis();
		int klucz, j;
		for (int i = 1;i<tab.length;i++){
			klucz = tab[i];
			j = i - 1;
			while(j>=0 && tab[j]>klucz){
				tab[j+ 1] = tab[j];
				j--;
			}
			tab[j+1] = klucz;
		}
		long stop = System.currentTimeMillis();
		//wypisz(tab);
		return (stop-start);
	}
	
	public static long Sortowanie_wybor(int[] tab){
		long start = System.currentTimeMillis();
		int k, klucz;
		for (int i = 0;i<tab.length;i++){
			klucz = tab[i];
			k = i;
			for (int j = i + 1;j<tab.length;j++){
				if (klucz > tab[j]){
					klucz = tab[j];
					k = j;	
				}
			tab[k] = tab[i];
			tab[i] = klucz;
			}
		}
		long stop = System.currentTimeMillis();
		//wypisz(tab);
		return (stop-start);
	}
	
	public static long Sortowanie_zamiana(int[] tab){
		long start = System.currentTimeMillis();
		int k, klucz;
		for (int i = 1;i < tab.length;i++){
			klucz = tab[i];
			k = i;
			for (int j = i + 1;j<tab.length;j++){
				if (klucz > tab[j]){
					klucz = tab[j];
					k = j;
				}
				tab[k] = tab[i];
				tab[i] = klucz;
			}
		}
		long stop = System.currentTimeMillis();
		//wypisz(tab);
		return (stop-start);
	}
	
	public static long Sortowanie_zliczanie(int[] tab){
		long start = System.currentTimeMillis();
		int t = PRZEDZIALSORT+1;
		int[] tmptab = new int[t];
		Arrays.fill(tmptab, 0);
		for (int i: tab){
			tmptab[i]++;
		}
		int j = 0;
		for (int a = 0; a < t;a++){
			for (int c = 0; c < tmptab[a];c++){
				tab[j] = a;
				j++;
			}
		}
		long stop = System.currentTimeMillis();
		//wypisz(tab);
		return (stop-start);
		
	}
	public static int Part(int[] tab, int a, int b){	
		int klucz = a;
		for (int i = a;i<b;i++){
			if (tab[i]<tab[b]){
				swap(tab[i],tab[klucz]);
				klucz++;
			}
		}
		swap(tab[klucz],tab[b]);
		return klucz;
	}
	
	public static void Quick_s(int[] tab, int a, int b){
		if (a<b){
			int klucz = Part(tab,a,b);
			Quick_s(tab,a,klucz-1);
			Quick_s(tab,klucz+1,b);
		}
	}
	
	public static long Quick_sort(int[] tab){
		long start = System.currentTimeMillis();
		int a = 0;
		int b = tab.length-1;
		Quick_s(tab,a,b);
		long stop = System.currentTimeMillis();
		//wypisz(tab);
		return (stop-start);
	}	
	
	
	public static void rand(int [] tab){
		Random generator = new Random();
		for(int i=0;i<ZAKRESTABELI;i++)
			tab[i] = generator.nextInt(PRZEDZIALSORT)+1;
	}
	public static void wypisz(int [] tab){
		for(int i=0;i<ZAKRESTABELI;i++)
			System.out.print(tab[i] + " ");
	}
	
	
	public static void main(String[] args) {
 	
		final int[] tab1 = new int[ZAKRESTABELI];
		
		rand(tab1);
		//wypisz(tab1);
		System.out.println("");
		System.out.println("Czas wykonania sortowania przez wstawianie (w milisekundach) : "+Sortowanie_wstawianie(tab1));
		System.out.println("Czas wykonania sortowania przez wybór (w milisekundach) : "+Sortowanie_wybor(tab1));
		System.out.println("Czas wykonania sortowania przez zamianê (w milisekundach) : "+Sortowanie_zamiana(tab1));
		System.out.println("Czas wykonania sortowania przez zliczanie (w milisekundach) : "+Sortowanie_zliczanie(tab1));
		System.out.println("Czas wykonania sortowania przez Quick Sort (w milisekundach) : "+Quick_sort(tab1));
	}
}
