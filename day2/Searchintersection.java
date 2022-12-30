package week2.day2;

public class Searchintersection {
	public static void main(String[]args) {
		int a[]= {5,7,8,9,4,3,5};
		int b[]= {1,3,4,7,6,9,4};
		int c=a.length;
		int d=b.length;
		for(int i=0;i<=c-1;i++) {
			for(int j=0;j<=d-1;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}System.out.println("those are intersection values");
	}

}
