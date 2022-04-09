package ds;

public class count
{
	static void printDistinct(String arr[], int n,int count[])
	{
		for (int i = 0; i < n; i++)
		{
			int j;
			if (arr[i]!=null) 
			{
				for (j = 0; j < i; j++) 
				{
					if (arr[i]!=null && arr[j]!=null) {
						if(arr[i].equals(arr[j]))
							break;
					}
				}
				if (i == j)
					System.out.print( arr[i]+" "+count[i]+"\n");
			}
		}
	}
	public static void main(String[] args) {
		String str = "I saw a CD play-er and a modem in ccd";
		String newStr="";
		String[] element = new String[str.length()];
		int[] Count = new int[str.length()];
		int eleIndex=0, count=1,k=0;
		for(int i=0;i<str.length();i++) {
			newStr+=Character.toUpperCase(str.charAt(i));
		}
		System.out.println(newStr);
		for(int i=0;i<newStr.length()-1;i++) {
			if((int)newStr.charAt(i)+1==(int)newStr.charAt(i+1)){
				element[eleIndex++]=newStr.charAt(i)+""+newStr.charAt(i+1);
			}
	}
	for(int i=0;i<element.length;i++) {
		count=1;
		if(element[i]!=null)
		{
			for(int j=0;j<element.length;j++)
			{
				if(i!=j) 
				{
					if (element[i]!=null && element[j]!=null) 
					{
						if(element[i].equals(element[j])) 
						{
							count++;
						}
					}
				}
			}
			Count[k++]=count;
		}
	}
	printDistinct(element,element.length,Count);
	}
}
