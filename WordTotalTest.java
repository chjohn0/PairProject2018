package count;

public class WordTotalTest {
   public static void main(String[] args){
	   String text="Contributor  means any person or \r entity that distributes the Program. \n"
	   		+ "Licensed Patents  mean patent claims licensable by a Contributor which are necessarily  \n"
	   		+ "infringed by the 1 2 56use or sale of its Contribution alone or when combined with the Program.  \n"
	   		+"                                \n"
	   		+ "Program  means the Contributions distributed in accordance with this Agreement. \n"
	   		+ " Recipient means anyone \r who receives the Program under this Agreement, including all Contributors. \n";
	   WordTotal wt = new WordTotal(text);
	   
	   wt.getCharacterCount();        //字符、空格、制表、换行统计
	   wt.getWordCount();             //单词统计
	   wt.getLineValidate();          //有效行数统计

	   System.out.println("Text is"+text);
	   System.out.println("字符数="+wt.charCount);
	   System.out.println("空格数="+wt.blankCount);
	   
	   System.out.println("水平字符数="+wt.tabCount);
	   System.out.println("换行符数="+wt.enterCount);
	   System.out.println("均算字符数="+wt.total);
	   System.out.println("行数="+wt.lineCount);
	   System.out.println("单词数="+wt.getWordCount());
	   System.out.println("有效行数="+wt.lineValidate);	   
   }	
}
