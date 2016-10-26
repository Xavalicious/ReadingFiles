import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileNerd {

	public static void main(String[] args) throws IOException {
		Scanner LTake = new Scanner(new File("E:\\ReadingFiles\\NerdData.txt"));
		int maxIndx=-1;
		String text[]=new String[1000];
		
		while(LTake.hasNextLine())
			{
			maxIndx++;
			text[maxIndx]=LTake.nextLine();
			}
		LTake.close();
		
		
		for(int n=0;n<maxIndx+1;n++)
			{
			String text2[]=text[n].split(" ");
			if (text2[0].equals("The"))
			{System.out.println(text[n]);}
			else {continue;}
			}
	}

}
